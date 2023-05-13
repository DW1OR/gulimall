package com.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.coupon.domain.SmsSkuLadder;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:25
 */
public interface SmsSkuLadderService extends IService<SmsSkuLadder> {

    PageUtils queryPage(Map<String, Object> params);
}

