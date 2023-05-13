package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.domain.PmsSpuInfoDesc;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
public interface PmsSpuInfoDescService extends IService<PmsSpuInfoDesc> {

    PageUtils queryPage(Map<String, Object> params);
}

