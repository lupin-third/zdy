package com.springboot.zdy.dao;

import com.springboot.zdy.Test;
import org.apache.ibatis.annotations.Param;

/**
 * @author dengyuan zhang
 * @date 2021/4/15 - 18:49
 */

public interface TestDao  {
    Test getById(@Param("id") Integer id);
}
