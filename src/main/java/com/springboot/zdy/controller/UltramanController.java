package com.springboot.zdy.controller;


import com.springboot.zdy.entity.Ultraman;
import com.springboot.zdy.service.UltramanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-02-25
 */
@Controller
@RequestMapping("/ultraman")
public class UltramanController {
    @Autowired
    private UltramanService UltramanService;
    @RequestMapping("/login")
    public ModelAndView hello(ModelAndView mav){
        Ultraman data = UltramanService.getDataById(1);
        mav.addObject("data",data);
        mav.setViewName("UltramanLogin");
        return mav;
    }
}
