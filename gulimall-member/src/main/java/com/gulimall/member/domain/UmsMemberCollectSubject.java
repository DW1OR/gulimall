package com.gulimall.member.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 会员收藏的专题活动
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:58:31
 */
@Data
@TableName("ums_member_collect_subject")
public class UmsMemberCollectSubject implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;

	/**
	 * subject_id
	 */
	private Long subjectId;

	/**
	 * subject_name
	 */
	private String subjectName;

	/**
	 * subject_img
	 */
	private String subjectImg;

	/**
	 * 活动url
	 */
	private String subjectUrll;


}
