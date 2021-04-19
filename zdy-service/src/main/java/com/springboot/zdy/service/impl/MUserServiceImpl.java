package com.springboot.zdy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.zdy.dao.MUserDao;
import com.springboot.zdy.entity.MUser;
import com.springboot.zdy.service.MUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-04-19
 */
@Service
public class MUserServiceImpl extends ServiceImpl<MUserDao, MUser> implements MUserService {
    @Autowired
    MUserDao mUserDao;

    @Override
    public MUser getUserInfoByUserName(String username) {
        return mUserDao.getUserInfoByUserName(username);
    }
}