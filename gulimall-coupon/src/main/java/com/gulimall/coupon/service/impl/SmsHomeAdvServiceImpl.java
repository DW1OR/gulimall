package com.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.coupon.dao.SmsHomeAdvDao;
import com.gulimall.coupon.domain.SmsHomeAdv;
import com.gulimall.coupon.service.SmsHomeAdvService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("smsHomeAdvService")
public class SmsHomeAdvServiceImpl extends ServiceImpl<SmsHomeAdvDao, SmsHomeAdv> implements SmsHomeAdvService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsHomeAdv> page = this.page(
                new Query<SmsHomeAdv>().getPage(params),
                new QueryWrapper<SmsHomeAdv>()
        );

        return new PageUtils(page);
    }

}
