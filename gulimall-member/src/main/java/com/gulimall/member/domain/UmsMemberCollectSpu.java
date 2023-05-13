package com.gulimall.member.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 会员收藏的商品
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:58:31
 */
@Data
@TableName("ums_member_collect_spu")
public class UmsMemberCollectSpu implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;

	/**
	 * 会员id
	 */
	private Long memberId;

	/**
	 * spu_id
	 */
	private Long spuId;

	/**
	 * spu_name
	 */
	private String spuName;

	/**
	 * spu_img
	 */
	private String spuImg;

	/**
	 * create_time
	 */
	private Date createTime;


}
