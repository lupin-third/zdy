package com.springboot.zdy.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateTime;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.zdy.config.utils.ShiroUtil;
import com.springboot.zdy.entity.MBlog;
import com.springboot.zdy.entity.result.Result;
import com.springboot.zdy.service.MBlogService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author dengyuan zhang
 * @date 2021/3/1 - 9:24
 */
@RestController
public class BlogController {

    @Autowired
    MBlogService blogService;

    @GetMapping("/blogs")
    public Result list(@RequestParam(defaultValue = "1") Integer currentPage) {

        Page page = new Page(currentPage, 5);
        IPage pageData = blogService.page(page, new QueryWrapper<MBlog>().orderByDesc("created"));

        return Result.successful(pageData);
    }

    @GetMapping("/blog/{id}")
    public Result detail(@PathVariable(name = "id") Long id) {
        MBlog blog = blogService.getById(id);
        Assert.notNull(blog, "该博客已被删除");

        return Result.successful(blog);
    }

    @RequiresAuthentication
    @PostMapping("/blog/edit")
    public Result edit(@Validated @RequestBody MBlog blog) {

//        Assert.isTrue(false, "公开版不能任意编辑！");

        MBlog temp = null;
        if(blog.getId() != null) {
            temp = blogService.getById(blog.getId());
            // 只能编辑自己的文章
            System.out.println(ShiroUtil.getProfile().getId());
            Assert.isTrue(temp.getUserId().longValue() == ShiroUtil.getProfile().getId().longValue(), "没有权限编辑");

        } else {

            temp = new MBlog();
            temp.setUserId(ShiroUtil.getProfile().getId());
            temp.setCreated(DateTime.now().toDateStr());
            temp.setStatus(0);
        }

        BeanUtil.copyProperties(blog, temp, "id", "userId", "created", "status");
        blogService.saveOrUpdate(temp);

        return Result.successful(null);
    }


}
