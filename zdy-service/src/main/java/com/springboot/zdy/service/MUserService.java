package com.springboot.zdy.service;

import com.springboot.zdy.entity.MUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-04-19
 */
public interface MUserService extends IService<MUser> {
    MUser getUserInfoByUserName(String username);
}
