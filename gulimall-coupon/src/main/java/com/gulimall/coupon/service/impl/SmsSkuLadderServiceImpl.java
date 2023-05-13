package com.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.coupon.dao.SmsSkuLadderDao;
import com.gulimall.coupon.domain.SmsSkuLadder;
import com.gulimall.coupon.service.SmsSkuLadderService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("smsSkuLadderService")
public class SmsSkuLadderServiceImpl extends ServiceImpl<SmsSkuLadderDao, SmsSkuLadder> implements SmsSkuLadderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSkuLadder> page = this.page(
                new Query<SmsSkuLadder>().getPage(params),
                new QueryWrapper<SmsSkuLadder>()
        );

        return new PageUtils(page);
    }

}
