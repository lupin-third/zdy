package com.springboot.zdy.controller;

import cn.hutool.core.map.MapUtil;
import cn.hutool.crypto.SecureUtil;
import com.springboot.zdy.config.utils.JwtUtils;
import com.springboot.zdy.entity.MUser;
import com.springboot.zdy.entity.dto.LoginDto;
import com.springboot.zdy.entity.result.Result;
import com.springboot.zdy.service.MUserService;
import com.springboot.zdy.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author dengyuan zhang
 * @date 2021/2/26 - 17:17
 */
@RestController
public class AccountController {
    @Autowired
    JwtUtils jwtUtils;
    @Autowired
    SysUserService sysUserService;
    @Autowired
    MUserService userService;

    //默认账号密码 markerhub / 111111
    @PostMapping("/login")
    public Result login(@Validated @RequestBody LoginDto loginDto, HttpServletResponse response) {
        MUser user = userService.getUserInfoByUserName(loginDto.getUltraname());
        //MUser user = userService.getOne(new QueryWrapper<MUser>().eq("username", loginDto.getUltraname()));
        Assert.notNull(user, "用户不存在");

        if(!user.getPassword().equals(SecureUtil.md5(loginDto.getUltrapassword()))){
            return Result.fail("密码不正确");
        }
        String jwt = jwtUtils.generateToken(user.getId());

        response.setHeader("Authorization", jwt);
        response.setHeader("Access-control-Expose-Headers", "Authorization");

        return Result.successful(MapUtil.builder()
                .put("id", user.getId())
                .put("username", user.getUsername())
                .put("avatar", user.getAvatar())
                .put("email", user.getEmail())
                .map()
        );
    }

    //退出
    @GetMapping("logout")
    @RequiresAuthentication
    public Result logout(){
        SecurityUtils.getSubject().logout();
        return Result.successful(null);
    }
}
