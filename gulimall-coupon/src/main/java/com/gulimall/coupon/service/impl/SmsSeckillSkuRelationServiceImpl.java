package com.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.coupon.dao.SmsSeckillSkuRelationDao;
import com.gulimall.coupon.domain.SmsSeckillSkuRelation;
import com.gulimall.coupon.service.SmsSeckillSkuRelationService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("smsSeckillSkuRelationService")
public class SmsSeckillSkuRelationServiceImpl extends ServiceImpl<SmsSeckillSkuRelationDao, SmsSeckillSkuRelation> implements SmsSeckillSkuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSeckillSkuRelation> page = this.page(
                new Query<SmsSeckillSkuRelation>().getPage(params),
                new QueryWrapper<SmsSeckillSkuRelation>()
        );

        return new PageUtils(page);
    }

}
