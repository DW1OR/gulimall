package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.domain.PmsSkuSaleAttrValue;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
public interface PmsSkuSaleAttrValueService extends IService<PmsSkuSaleAttrValue> {

    PageUtils queryPage(Map<String, Object> params);
}

