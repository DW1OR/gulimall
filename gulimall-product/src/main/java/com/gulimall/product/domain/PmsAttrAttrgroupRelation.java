package com.gulimall.product.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 属性&属性分组关联
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
@Data
@TableName("pms_attr_attrgroup_relation")
public class PmsAttrAttrgroupRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;

	/**
	 * 属性id
	 */
	private Long attrId;

	/**
	 * 属性分组id
	 */
	private Long attrGroupId;

	/**
	 * 属性组内排序
	 */
	private Integer attrSort;


}
