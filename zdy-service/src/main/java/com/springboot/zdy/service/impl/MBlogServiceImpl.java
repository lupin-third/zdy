package com.springboot.zdy.service.impl;

import com.springboot.zdy.entity.MBlog;
import com.springboot.zdy.dao.MBlogDao;
import com.springboot.zdy.service.MBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class MBlogServiceImpl extends ServiceImpl<MBlogDao, MBlog> implements MBlogService {

}
