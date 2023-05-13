package com.gulimall.product.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * spu信息介绍
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
@Data
@TableName("pms_spu_info_desc")
public class PmsSpuInfoDesc implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	@TableId
	private Long spuId;

	/**
	 * 商品介绍
	 */
	private String decript;


}
