package com.springboot.zdy.captcha.config;

import com.springboot.zdy.captcha.properties.AjCaptchaProperties;
import com.springboot.zdy.captcha.service.CaptchaCacheService;
import com.springboot.zdy.captcha.service.impl.CaptchaServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 存储策略自动配置.
 *
 */
@Configuration
public class AjCaptchaStorageAutoConfiguration {

    @Bean(name = "AjCaptchaCacheService")
    public CaptchaCacheService captchaCacheService(AjCaptchaProperties ajCaptchaProperties){
        //缓存类型redis/local/....
        return CaptchaServiceFactory.getCache(ajCaptchaProperties.getCacheType().name());
    }
}
