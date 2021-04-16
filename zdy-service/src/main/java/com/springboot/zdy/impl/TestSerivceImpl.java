package com.springboot.zdy.impl;

import com.springboot.zdy.Test;
import com.springboot.zdy.dao.TestDao;
import com.springboot.zdy.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dengyuan zhang
 * @date 2021/4/15 - 18:54
 */
@Service
public class TestSerivceImpl implements TestService {
    @Autowired
    private TestDao testDao;
    @Override
    public Test getById(Integer id) {
        return testDao.getById(id);
    }
}
