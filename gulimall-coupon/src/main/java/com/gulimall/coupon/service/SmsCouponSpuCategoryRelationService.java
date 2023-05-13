package com.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.coupon.domain.SmsCouponSpuCategoryRelation;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:25
 */
public interface SmsCouponSpuCategoryRelationService extends IService<SmsCouponSpuCategoryRelation> {

    PageUtils queryPage(Map<String, Object> params);
}

