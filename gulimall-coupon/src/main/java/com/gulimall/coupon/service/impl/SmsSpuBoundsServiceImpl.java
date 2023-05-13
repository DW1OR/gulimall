package com.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.coupon.dao.SmsSpuBoundsDao;
import com.gulimall.coupon.domain.SmsSpuBounds;
import com.gulimall.coupon.service.SmsSpuBoundsService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("smsSpuBoundsService")
public class SmsSpuBoundsServiceImpl extends ServiceImpl<SmsSpuBoundsDao, SmsSpuBounds> implements SmsSpuBoundsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSpuBounds> page = this.page(
                new Query<SmsSpuBounds>().getPage(params),
                new QueryWrapper<SmsSpuBounds>()
        );

        return new PageUtils(page);
    }

}
