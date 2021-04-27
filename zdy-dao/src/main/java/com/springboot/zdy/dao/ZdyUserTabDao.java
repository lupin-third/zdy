package com.springboot.zdy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.zdy.entity.ZdyUserTab;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-04-27
 */
public interface ZdyUserTabDao extends BaseMapper<ZdyUserTab> {
    ZdyUserTab getUserInfoByUserName(@Param("username") String username);
}
