package com.springboot.zdy.config.captcha;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@EnableConfigurationProperties(AjCaptchaProperties.class)
@ComponentScan("com.springboot.zdy.captcha")
@Import({AjCaptchaServiceAutoConfiguration.class,AjCaptchaStorageAutoConfiguration.class})
public class AjCaptchaAutoConfiguration {
}
