package com.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.coupon.dao.SmsMemberPriceDao;
import com.gulimall.coupon.domain.SmsMemberPrice;
import com.gulimall.coupon.service.SmsMemberPriceService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("smsMemberPriceService")
public class SmsMemberPriceServiceImpl extends ServiceImpl<SmsMemberPriceDao, SmsMemberPrice> implements SmsMemberPriceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsMemberPrice> page = this.page(
                new Query<SmsMemberPrice>().getPage(params),
                new QueryWrapper<SmsMemberPrice>()
        );

        return new PageUtils(page);
    }

}
