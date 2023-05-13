package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.product.dao.PmsProductAttrValueDao;
import com.gulimall.product.domain.PmsProductAttrValue;
import com.gulimall.product.service.PmsProductAttrValueService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsProductAttrValueService")
public class PmsProductAttrValueServiceImpl extends ServiceImpl<PmsProductAttrValueDao, PmsProductAttrValue> implements PmsProductAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsProductAttrValue> page = this.page(
                new Query<PmsProductAttrValue>().getPage(params),
                new QueryWrapper<PmsProductAttrValue>()
        );

        return new PageUtils(page);
    }

}
