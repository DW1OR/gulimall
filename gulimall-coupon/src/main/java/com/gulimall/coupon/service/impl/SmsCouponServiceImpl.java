package com.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.coupon.dao.SmsCouponDao;
import com.gulimall.coupon.domain.SmsCoupon;
import com.gulimall.coupon.service.SmsCouponService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("smsCouponService")
public class SmsCouponServiceImpl extends ServiceImpl<SmsCouponDao, SmsCoupon> implements SmsCouponService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCoupon> page = this.page(
                new Query<SmsCoupon>().getPage(params),
                new QueryWrapper<SmsCoupon>()
        );

        return new PageUtils(page);
    }

}
