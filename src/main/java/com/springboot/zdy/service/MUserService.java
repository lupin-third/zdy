package com.springboot.zdy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springboot.zdy.entity.MUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-03-01
 */
public interface MUserService extends IService<MUser> {
    MUser getUserInfoByUserName(String username);
}
