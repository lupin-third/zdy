package com.springboot.zdy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.zdy.entity.Ultraman;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-02-25
 */
public interface UltramanDao extends BaseMapper<Ultraman> {
    Ultraman getDataById(@Param("id") Integer id);
}
