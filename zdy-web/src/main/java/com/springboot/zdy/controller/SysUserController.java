package com.springboot.zdy.controller;


import com.springboot.zdy.entity.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-02-25
 */
@Controller
@RequestMapping("/sys-user")
public class SysUserController {
    @RequestMapping("/save")
    public Object testUser(@Validated SysUser user){
        return user.toString();
    }
}