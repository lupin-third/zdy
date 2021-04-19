package com.springboot.zdy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.zdy.dao.UltramanDao;
import com.springboot.zdy.entity.Ultraman;
import com.springboot.zdy.service.UltramanService;
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
public class UltramanServiceImpl extends ServiceImpl<UltramanDao, Ultraman> implements UltramanService {
    @Autowired
    private UltramanDao ultramanDao;
    @Override
    public Ultraman getDataById(int id) {
        return ultramanDao.getDataById(id);
    }
}
