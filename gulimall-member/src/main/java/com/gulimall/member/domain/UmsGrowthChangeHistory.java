package com.gulimall.member.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 成长值变化历史记录
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:58:31
 */
@Data
@TableName("ums_growth_change_history")
public class UmsGrowthChangeHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;

	/**
	 * member_id
	 */
	private Long memberId;

	/**
	 * create_time
	 */
	private Date createTime;

	/**
	 * 改变的值（正负计数）
	 */
	private Integer changeCount;

	/**
	 * 备注
	 */
	private String note;

	/**
	 * 积分来源[0-购物，1-管理员修改]
	 */
	private Integer sourceType;


}
