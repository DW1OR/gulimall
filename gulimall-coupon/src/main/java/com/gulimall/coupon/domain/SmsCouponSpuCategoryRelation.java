package com.gulimall.coupon.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 优惠券分类关联
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:25
 */
@Data
@TableName("sms_coupon_spu_category_relation")
public class SmsCouponSpuCategoryRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;

	/**
	 * 优惠券id
	 */
	private Long couponId;

	/**
	 * 产品分类id
	 */
	private Long categoryId;

	/**
	 * 产品分类名称
	 */
	private String categoryName;


}
