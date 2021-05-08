package com.springboot.zdy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.zdy.entity.ZdyEncyclopediaTab;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-05-07
 */
public interface ZdyEncyclopediaTabDao extends BaseMapper<ZdyEncyclopediaTab> {
   List<ZdyEncyclopediaTab> getList();
}
