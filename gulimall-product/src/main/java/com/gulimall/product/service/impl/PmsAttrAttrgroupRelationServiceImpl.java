package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.product.dao.PmsAttrAttrgroupRelationDao;
import com.gulimall.product.domain.PmsAttrAttrgroupRelation;
import com.gulimall.product.service.PmsAttrAttrgroupRelationService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsAttrAttrgroupRelationService")
public class PmsAttrAttrgroupRelationServiceImpl extends ServiceImpl<PmsAttrAttrgroupRelationDao, PmsAttrAttrgroupRelation> implements PmsAttrAttrgroupRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsAttrAttrgroupRelation> page = this.page(
                new Query<PmsAttrAttrgroupRelation>().getPage(params),
                new QueryWrapper<PmsAttrAttrgroupRelation>()
        );

        return new PageUtils(page);
    }

}
