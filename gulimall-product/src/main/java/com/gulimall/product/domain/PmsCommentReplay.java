package com.gulimall.product.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 商品评价回复关系
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
@Data
@TableName("pms_comment_replay")
public class PmsCommentReplay implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;

	/**
	 * 评论id
	 */
	private Long commentId;

	/**
	 * 回复id
	 */
	private Long replyId;


}
