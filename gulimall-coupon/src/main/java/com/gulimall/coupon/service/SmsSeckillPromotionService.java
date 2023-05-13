package com.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.coupon.domain.SmsSeckillPromotion;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:25
 */
public interface SmsSeckillPromotionService extends IService<SmsSeckillPromotion> {

    PageUtils queryPage(Map<String, Object> params);
}

