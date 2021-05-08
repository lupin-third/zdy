package com.springboot.zdy.controller;


import com.springboot.zdy.entity.ZdyEncyclopediaTab;
import com.springboot.zdy.entity.result.Result;
import com.springboot.zdy.service.ZdyEncyclopediaTabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-05-07
 */
@Controller
@RequestMapping("/encyclopedia")
public class ZdyEncyclopediaTabController {

    @Autowired
    private ZdyEncyclopediaTabService zdyEncyclopediaTabService;

    @RequestMapping("/getList")
    @ResponseBody
    public Result<List<ZdyEncyclopediaTab>> getDataList(@RequestBody String username){
        try {
            //long stime = System.currentTimeMillis();
            List<ZdyEncyclopediaTab> list = zdyEncyclopediaTabService.getList();
            //long etime = System.currentTimeMillis();
            //long time = etime - stime;
            return Result.successful(list);
        }catch (Exception e){
            return Result.fail(e.toString());
        }
    }
}
