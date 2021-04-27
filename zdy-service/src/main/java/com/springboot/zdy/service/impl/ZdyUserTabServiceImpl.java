package com.springboot.zdy.service.impl;

import com.springboot.zdy.entity.ZdyUserTab;
import com.springboot.zdy.dao.ZdyUserTabDao;
import com.springboot.zdy.service.ZdyUserTabService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-04-27
 */
@Service
public class ZdyUserTabServiceImpl extends ServiceImpl<ZdyUserTabDao, ZdyUserTab> implements ZdyUserTabService {
    @Autowired
    ZdyUserTabDao zdyUserTabDao;
    @Override
    public ZdyUserTab getUserInfoByUserName(String username) {
        return zdyUserTabDao.getUserInfoByUserName(username);
    }
}
