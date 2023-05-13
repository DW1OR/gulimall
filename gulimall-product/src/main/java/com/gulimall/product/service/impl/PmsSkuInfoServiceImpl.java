package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.product.dao.PmsSkuInfoDao;
import com.gulimall.product.domain.PmsSkuInfo;
import com.gulimall.product.service.PmsSkuInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsSkuInfoService")
public class PmsSkuInfoServiceImpl extends ServiceImpl<PmsSkuInfoDao, PmsSkuInfo> implements PmsSkuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSkuInfo> page = this.page(
                new Query<PmsSkuInfo>().getPage(params),
                new QueryWrapper<PmsSkuInfo>()
        );

        return new PageUtils(page);
    }

}
