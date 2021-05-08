package com.springboot.zdy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springboot.zdy.entity.ZdyEncyclopediaTab;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-05-07
 */
public interface ZdyEncyclopediaTabService extends IService<ZdyEncyclopediaTab> {
    List<ZdyEncyclopediaTab> getList();
}
