package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.domain.PmsSpuInfo;

import java.util.Map;

/**
 * spu信息
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
public interface PmsSpuInfoService extends IService<PmsSpuInfo> {

    PageUtils queryPage(Map<String, Object> params);
}

