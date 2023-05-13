package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.product.dao.PmsCategoryDao;
import com.gulimall.product.domain.PmsCategory;
import com.gulimall.product.service.PmsCategoryService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsCategoryService")
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryDao, PmsCategory> implements PmsCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCategory> page = this.page(
                new Query<PmsCategory>().getPage(params),
                new QueryWrapper<PmsCategory>()
        );

        return new PageUtils(page);
    }

}
