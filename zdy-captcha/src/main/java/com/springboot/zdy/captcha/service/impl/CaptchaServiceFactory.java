package com.springboot.zdy.captcha.service.impl;

import com.springboot.zdy.captcha.model.common.Const;
import com.springboot.zdy.captcha.service.CaptchaCacheService;
import com.springboot.zdy.captcha.service.CaptchaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.ServiceLoader;


public class CaptchaServiceFactory {

    private static Logger logger = LoggerFactory.getLogger(CaptchaServiceFactory.class);

    public static CaptchaService getInstance(Properties config) {
        CaptchaService ret = instances.get(config.getProperty(Const.CAPTCHA_TYPE, "default"));
        if (ret == null) {
            throw new RuntimeException("unsupported-[captcha.type]=" + config.getProperty(Const.CAPTCHA_TYPE));
        }
        ret.init(config);
        return ret;
    }

    public static CaptchaCacheService getCache(String cacheType) {
        return cacheService.get(cacheType);
    }

    public volatile static Map<String, CaptchaService> instances = new HashMap();
    public volatile static Map<String, CaptchaCacheService> cacheService = new HashMap();

    static {
        ServiceLoader<CaptchaCacheService> cacheServices = ServiceLoader.load(CaptchaCacheService.class);
        for (CaptchaCacheService item : cacheServices) {
            cacheService.put(item.type(), item);
        }
        logger.info("supported-captchaCache-service:{}", cacheService.keySet().toString());
        ServiceLoader<CaptchaService> services = ServiceLoader.load(CaptchaService.class);
        for (CaptchaService item : services) {
            instances.put(item.captchaType(), item);
        }
        ;
        logger.info("supported-captchaTypes-service:{}", instances.keySet().toString());
    }
}
