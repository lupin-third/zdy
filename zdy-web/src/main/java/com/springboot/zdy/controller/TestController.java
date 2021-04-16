package com.springboot.zdy.controller;

import com.springboot.zdy.TestService;
import com.springboot.zdy.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author dengyuan zhang
 * @date 2021/4/15 - 18:55
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping("/someone")
    public ModelAndView hello(ModelAndView mav){
        Test data = testService.getById(1);
        mav.addObject("data",data);
        mav.setViewName("UltramanLogin");
        return mav;
    }
}
