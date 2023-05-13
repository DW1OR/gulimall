package com.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.coupon.domain.SmsHomeAdv;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:25
 */
public interface SmsHomeAdvService extends IService<SmsHomeAdv> {

    PageUtils queryPage(Map<String, Object> params);
}

