package com.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.coupon.domain.SmsSpuBounds;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:25
 */
public interface SmsSpuBoundsService extends IService<SmsSpuBounds> {

    PageUtils queryPage(Map<String, Object> params);
}

