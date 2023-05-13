package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.domain.PmsSkuInfo;

import java.util.Map;

/**
 * sku信息
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:36
 */
public interface PmsSkuInfoService extends IService<PmsSkuInfo> {

    PageUtils queryPage(Map<String, Object> params);
}

