package com.gulimall.ware.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 *
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:03:30
 */
@Data
@TableName("undo_log")
public class UndoLog implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Long id;

	/**
	 *
	 */
	private Long branchId;

	/**
	 *
	 */
	private String xid;

	/**
	 *
	 */
	private String context;

	/**
	 *
	 */
	private byte[] rollbackInfo;

	/**
	 *
	 */
	private Integer logStatus;

	/**
	 *
	 */
	private Date logCreated;

	/**
	 *
	 */
	private Date logModified;

	/**
	 *
	 */
	private String ext;


}
