package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.product.dao.PmsCategoryBrandRelationDao;
import com.gulimall.product.domain.PmsCategoryBrandRelation;
import com.gulimall.product.service.PmsCategoryBrandRelationService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsCategoryBrandRelationService")
public class PmsCategoryBrandRelationServiceImpl extends ServiceImpl<PmsCategoryBrandRelationDao, PmsCategoryBrandRelation> implements PmsCategoryBrandRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCategoryBrandRelation> page = this.page(
                new Query<PmsCategoryBrandRelation>().getPage(params),
                new QueryWrapper<PmsCategoryBrandRelation>()
        );

        return new PageUtils(page);
    }

}
