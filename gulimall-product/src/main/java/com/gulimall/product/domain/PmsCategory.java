package com.gulimall.product.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 商品三级分类
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
@Data
@TableName("pms_category")
public class PmsCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分类id
	 */
	@TableId
	private Long catId;

	/**
	 * 分类名称
	 */
	private String name;

	/**
	 * 父分类id
	 */
	private Long parentCid;

	/**
	 * 层级
	 */
	private Integer catLevel;

	/**
	 * 是否显示[0-不显示，1显示]
	 */
	private Integer showStatus;

	/**
	 * 排序
	 */
	private Integer sort;

	/**
	 * 图标地址
	 */
	private String icon;

	/**
	 * 计量单位
	 */
	private String productUnit;

	/**
	 * 商品数量
	 */
	private Integer productCount;


}
