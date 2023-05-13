package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.domain.PmsAttrGroup;

import java.util.Map;

/**
 * 属性分组
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
public interface PmsAttrGroupService extends IService<PmsAttrGroup> {

    PageUtils queryPage(Map<String, Object> params);
}

