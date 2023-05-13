package com.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.coupon.dao.SmsCouponSpuRelationDao;
import com.gulimall.coupon.domain.SmsCouponSpuRelation;
import com.gulimall.coupon.service.SmsCouponSpuRelationService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("smsCouponSpuRelationService")
public class SmsCouponSpuRelationServiceImpl extends ServiceImpl<SmsCouponSpuRelationDao, SmsCouponSpuRelation> implements SmsCouponSpuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCouponSpuRelation> page = this.page(
                new Query<SmsCouponSpuRelation>().getPage(params),
                new QueryWrapper<SmsCouponSpuRelation>()
        );

        return new PageUtils(page);
    }

}
