package com.gulimall.coupon.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 专题商品
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:24
 */
@Data
@TableName("sms_home_subject_spu")
public class SmsHomeSubjectSpu implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;

	/**
	 * 专题名字
	 */
	private String name;

	/**
	 * 专题id
	 */
	private Long subjectId;

	/**
	 * spu_id
	 */
	private Long spuId;

	/**
	 * 排序
	 */
	private Integer sort;


}
