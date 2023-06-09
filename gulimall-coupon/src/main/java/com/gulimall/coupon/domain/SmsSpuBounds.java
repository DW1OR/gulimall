package com.gulimall.coupon.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 商品spu积分设置
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:25
 */
@Data
@TableName("sms_spu_bounds")
public class SmsSpuBounds implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;

	/**
	 * 
	 */
	private Long spuId;

	/**
	 * 成长积分
	 */
	private BigDecimal growBounds;

	/**
	 * 购物积分
	 */
	private BigDecimal buyBounds;

	/**
	 * 优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
	 */
	private Integer work;


}
