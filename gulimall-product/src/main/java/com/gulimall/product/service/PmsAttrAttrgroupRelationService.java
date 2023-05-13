package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.domain.PmsAttrAttrgroupRelation;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
public interface PmsAttrAttrgroupRelationService extends IService<PmsAttrAttrgroupRelation> {

    PageUtils queryPage(Map<String, Object> params);
}

