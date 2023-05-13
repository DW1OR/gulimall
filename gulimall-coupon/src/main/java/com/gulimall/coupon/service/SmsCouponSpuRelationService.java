package com.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.coupon.domain.SmsCouponSpuRelation;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:25
 */
public interface SmsCouponSpuRelationService extends IService<SmsCouponSpuRelation> {

    PageUtils queryPage(Map<String, Object> params);
}

