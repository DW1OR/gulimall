package com.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.order.domain.OmsOrder;

import java.util.Map;

/**
 * 订单
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:00:56
 */
public interface OmsOrderService extends IService<OmsOrder> {

    PageUtils queryPage(Map<String, Object> params);
}

