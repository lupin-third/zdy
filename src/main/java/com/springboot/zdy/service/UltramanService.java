package com.springboot.zdy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springboot.zdy.entity.Ultraman;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-02-25
 */
public interface UltramanService extends IService<Ultraman> {
    Ultraman getDataById(int id);
}
