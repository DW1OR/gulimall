package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.domain.PmsSkuImages;

import java.util.Map;

/**
 * sku图片
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
public interface PmsSkuImagesService extends IService<PmsSkuImages> {

    PageUtils queryPage(Map<String, Object> params);
}

