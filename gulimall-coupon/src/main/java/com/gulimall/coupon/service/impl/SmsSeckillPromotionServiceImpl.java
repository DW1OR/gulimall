package com.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.coupon.dao.SmsSeckillPromotionDao;
import com.gulimall.coupon.domain.SmsSeckillPromotion;
import com.gulimall.coupon.service.SmsSeckillPromotionService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("smsSeckillPromotionService")
public class SmsSeckillPromotionServiceImpl extends ServiceImpl<SmsSeckillPromotionDao, SmsSeckillPromotion> implements SmsSeckillPromotionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSeckillPromotion> page = this.page(
                new Query<SmsSeckillPromotion>().getPage(params),
                new QueryWrapper<SmsSeckillPromotion>()
        );

        return new PageUtils(page);
    }

}
