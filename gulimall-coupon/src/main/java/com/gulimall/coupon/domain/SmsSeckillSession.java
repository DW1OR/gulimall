package com.gulimall.coupon.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 秒杀活动场次
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:25
 */
@Data
@TableName("sms_seckill_session")
public class SmsSeckillSession implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;

	/**
	 * 场次名称
	 */
	private String name;

	/**
	 * 每日开始时间
	 */
	private Date startTime;

	/**
	 * 每日结束时间
	 */
	private Date endTime;

	/**
	 * 启用状态
	 */
	private Integer status;

	/**
	 * 创建时间
	 */
	private Date createTime;


}
