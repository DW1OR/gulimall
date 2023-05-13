package com.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.coupon.domain.SmsSkuFullReduction;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:25
 */
public interface SmsSkuFullReductionService extends IService<SmsSkuFullReduction> {

    PageUtils queryPage(Map<String, Object> params);
}

