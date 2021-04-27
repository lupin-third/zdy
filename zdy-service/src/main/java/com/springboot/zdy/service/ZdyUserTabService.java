package com.springboot.zdy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springboot.zdy.entity.ZdyUserTab;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-04-27
 */
public interface ZdyUserTabService extends IService<ZdyUserTab> {
    ZdyUserTab getUserInfoByUserName(String username);
}
