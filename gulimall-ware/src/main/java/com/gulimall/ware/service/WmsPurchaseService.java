package com.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.ware.domain.WmsPurchase;

import java.util.Map;

/**
 * 采购信息
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:03:30
 */
public interface WmsPurchaseService extends IService<WmsPurchase> {

    PageUtils queryPage(Map<String, Object> params);
}

