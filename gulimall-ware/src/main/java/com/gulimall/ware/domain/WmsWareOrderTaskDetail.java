package com.gulimall.ware.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 库存工作单
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:03:30
 */
@Data
@TableName("wms_ware_order_task_detail")
public class WmsWareOrderTaskDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;

	/**
	 * sku_id
	 */
	private Long skuId;

	/**
	 * sku_name
	 */
	private String skuName;

	/**
	 * 购买个数
	 */
	private Integer skuNum;

	/**
	 * 工作单id
	 */
	private Long taskId;

	/**
	 * 仓库id
	 */
	private Long wareId;

	/**
	 * 1-已锁定  2-已解锁  3-扣减
	 */
	private Integer lockStatus;


}
