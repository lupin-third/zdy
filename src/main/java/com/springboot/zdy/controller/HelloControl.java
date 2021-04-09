package com.springboot.zdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author dengyuan zhang
 * @date 2020/8/27 - 16:27
 */
@Controller
@RequestMapping("/hello")
public class HelloControl {
    @RequestMapping("/login")
    public ModelAndView hello(ModelAndView mav){
        mav.setViewName("UltramanLogin");
        //
        return mav;
    }
}
