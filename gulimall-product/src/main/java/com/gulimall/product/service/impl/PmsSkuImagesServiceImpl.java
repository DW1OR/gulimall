package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.product.dao.PmsSkuImagesDao;
import com.gulimall.product.domain.PmsSkuImages;
import com.gulimall.product.service.PmsSkuImagesService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsSkuImagesService")
public class PmsSkuImagesServiceImpl extends ServiceImpl<PmsSkuImagesDao, PmsSkuImages> implements PmsSkuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSkuImages> page = this.page(
                new Query<PmsSkuImages>().getPage(params),
                new QueryWrapper<PmsSkuImages>()
        );

        return new PageUtils(page);
    }

}
