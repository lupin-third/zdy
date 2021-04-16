
package com.springboot.zdy.captcha.service;

import com.springboot.zdy.captcha.model.common.ResponseModel;
import com.springboot.zdy.captcha.model.vo.CaptchaVO;

import java.util.Properties;

/**
 * 验证码服务接口
 * @author lide1202@hotmail.com
 * @date 2020-05-12
 */
public interface CaptchaService {
    /**
     * 配置初始化
     * @throws Exception
     */
    void init(Properties config);

    /**
     * 获取验证码
     * @param captchaVO
     * @return
     */
    ResponseModel get(CaptchaVO captchaVO);

    /**
     * 核对验证码(前端)
     * @param captchaVO
     * @return
     */
    ResponseModel check(CaptchaVO captchaVO);

    /**
     * 二次校验验证码(后端)
     * @param captchaVO
     * @return
     */
    ResponseModel verification(CaptchaVO captchaVO);

    /***
     * 验证码类型
     * 通过java SPI机制，接入方可自定义实现类，实现新的验证类型
     * @return
     */
    String captchaType();

}
