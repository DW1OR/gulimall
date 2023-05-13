package com.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.order.domain.OmsOrderReturnApply;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:00:56
 */
public interface OmsOrderReturnApplyService extends IService<OmsOrderReturnApply> {

    PageUtils queryPage(Map<String, Object> params);
}

