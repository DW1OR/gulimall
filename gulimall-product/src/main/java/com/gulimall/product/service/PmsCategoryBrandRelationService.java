package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.domain.PmsCategoryBrandRelation;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
public interface PmsCategoryBrandRelationService extends IService<PmsCategoryBrandRelation> {

    PageUtils queryPage(Map<String, Object> params);
}

