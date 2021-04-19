package com.springboot.zdy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.zdy.entity.MUser;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-04-19
 */
public interface MUserDao extends BaseMapper<MUser> {
    MUser getUserInfoByUserName(@Param("username") String username);
}
