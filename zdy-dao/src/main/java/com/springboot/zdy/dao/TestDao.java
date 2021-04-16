package com.springboot.zdy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.zdy.Test;
import org.apache.ibatis.annotations.Param;

/**
 * @author dengyuan zhang
 * @date 2021/4/15 - 18:49
 */

public interface TestDao extends BaseMapper<Test> {
    Test getById(@Param("id") Integer id);
}
