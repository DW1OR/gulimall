package com.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.coupon.dao.SmsCouponSpuCategoryRelationDao;
import com.gulimall.coupon.domain.SmsCouponSpuCategoryRelation;
import com.gulimall.coupon.service.SmsCouponSpuCategoryRelationService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("smsCouponSpuCategoryRelationService")
public class SmsCouponSpuCategoryRelationServiceImpl extends ServiceImpl<SmsCouponSpuCategoryRelationDao, SmsCouponSpuCategoryRelation> implements SmsCouponSpuCategoryRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCouponSpuCategoryRelation> page = this.page(
                new Query<SmsCouponSpuCategoryRelation>().getPage(params),
                new QueryWrapper<SmsCouponSpuCategoryRelation>()
        );

        return new PageUtils(page);
    }

}
