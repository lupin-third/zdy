package com.springboot.zdy;

import cn.hutool.crypto.SecureUtil;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ZdyApplicationTests {
    public static void main(String[] args) {
        System.out.println(SecureUtil.md5("0"));
    }
}
