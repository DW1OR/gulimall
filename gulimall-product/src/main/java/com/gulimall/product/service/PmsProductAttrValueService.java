package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.domain.PmsProductAttrValue;

import java.util.Map;

/**
 * spu属性值
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
public interface PmsProductAttrValueService extends IService<PmsProductAttrValue> {

    PageUtils queryPage(Map<String, Object> params);
}

