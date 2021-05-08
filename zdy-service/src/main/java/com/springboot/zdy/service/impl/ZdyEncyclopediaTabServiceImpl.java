package com.springboot.zdy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.zdy.dao.ZdyEncyclopediaTabDao;
import com.springboot.zdy.entity.ZdyEncyclopediaTab;
import com.springboot.zdy.service.ZdyEncyclopediaTabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-05-07
 */
@Service
public class ZdyEncyclopediaTabServiceImpl extends ServiceImpl<ZdyEncyclopediaTabDao, ZdyEncyclopediaTab> implements ZdyEncyclopediaTabService {

    @Autowired
    ZdyEncyclopediaTabDao zdyEncyclopediaTabDao;

    @Override
    public List<ZdyEncyclopediaTab> getList() {
        return zdyEncyclopediaTabDao.getList();
    }
}
