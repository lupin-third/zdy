package com.springboot.zdy;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.springboot.zdy.dao")
@SpringBootApplication
public class ZdyApplication {
    private static Logger logger = LoggerFactory.getLogger(ZdyApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ZdyApplication.class, args);
        String cmd = "C:\\\\Program Files (x86)\\\\Google\\\\Chrome\\\\Application\\\\chrome.exe http://localhost:8080";
        Runtime run = Runtime.getRuntime();
        try {
            run.exec(cmd);
            logger.info("启动浏览器打开项目成功");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
    }

}
