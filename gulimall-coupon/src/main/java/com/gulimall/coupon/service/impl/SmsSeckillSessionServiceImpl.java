package com.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.coupon.dao.SmsSeckillSessionDao;
import com.gulimall.coupon.domain.SmsSeckillSession;
import com.gulimall.coupon.service.SmsSeckillSessionService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("smsSeckillSessionService")
public class SmsSeckillSessionServiceImpl extends ServiceImpl<SmsSeckillSessionDao, SmsSeckillSession> implements SmsSeckillSessionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSeckillSession> page = this.page(
                new Query<SmsSeckillSession>().getPage(params),
                new QueryWrapper<SmsSeckillSession>()
        );

        return new PageUtils(page);
    }

}
