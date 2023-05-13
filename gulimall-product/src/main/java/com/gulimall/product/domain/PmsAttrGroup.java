package com.gulimall.product.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 属性分组
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
@Data
@TableName("pms_attr_group")
public class PmsAttrGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分组id
	 */
	@TableId
	private Long attrGroupId;

	/**
	 * 组名
	 */
	private String attrGroupName;

	/**
	 * 排序
	 */
	private Integer sort;

	/**
	 * 描述
	 */
	private String descript;

	/**
	 * 组图标
	 */
	private String icon;

	/**
	 * 所属分类id
	 */
	private Long catelogId;


}
