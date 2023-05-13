package com.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.coupon.dao.SmsCouponHistoryDao;
import com.gulimall.coupon.domain.SmsCouponHistory;
import com.gulimall.coupon.service.SmsCouponHistoryService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("smsCouponHistoryService")
public class SmsCouponHistoryServiceImpl extends ServiceImpl<SmsCouponHistoryDao, SmsCouponHistory> implements SmsCouponHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCouponHistory> page = this.page(
                new Query<SmsCouponHistory>().getPage(params),
                new QueryWrapper<SmsCouponHistory>()
        );

        return new PageUtils(page);
    }

}
