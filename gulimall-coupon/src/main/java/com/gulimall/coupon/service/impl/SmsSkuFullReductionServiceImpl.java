package com.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.coupon.dao.SmsSkuFullReductionDao;
import com.gulimall.coupon.domain.SmsSkuFullReduction;
import com.gulimall.coupon.service.SmsSkuFullReductionService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("smsSkuFullReductionService")
public class SmsSkuFullReductionServiceImpl extends ServiceImpl<SmsSkuFullReductionDao, SmsSkuFullReduction> implements SmsSkuFullReductionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSkuFullReduction> page = this.page(
                new Query<SmsSkuFullReduction>().getPage(params),
                new QueryWrapper<SmsSkuFullReduction>()
        );

        return new PageUtils(page);
    }

}
