package com.gulimall.coupon.dao;

import com.gulimall.coupon.domain.SmsCouponSpuRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:25
 */
@Mapper
public interface SmsCouponSpuRelationDao extends BaseMapper<SmsCouponSpuRelation> {

}
