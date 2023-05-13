package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.product.dao.PmsSkuSaleAttrValueDao;
import com.gulimall.product.domain.PmsSkuSaleAttrValue;
import com.gulimall.product.service.PmsSkuSaleAttrValueService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsSkuSaleAttrValueService")
public class PmsSkuSaleAttrValueServiceImpl extends ServiceImpl<PmsSkuSaleAttrValueDao, PmsSkuSaleAttrValue> implements PmsSkuSaleAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSkuSaleAttrValue> page = this.page(
                new Query<PmsSkuSaleAttrValue>().getPage(params),
                new QueryWrapper<PmsSkuSaleAttrValue>()
        );

        return new PageUtils(page);
    }

}
