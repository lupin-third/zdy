package com.springboot.zdy;

import org.apache.ibatis.annotations.Param;

/**
 * @author dengyuan zhang
 * @date 2021/4/15 - 18:51
 */

public interface TestService {
    Test getById(@Param("id") Integer id);
}
