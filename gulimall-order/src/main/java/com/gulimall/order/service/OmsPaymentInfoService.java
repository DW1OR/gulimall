package com.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.order.domain.OmsPaymentInfo;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:00:56
 */
public interface OmsPaymentInfoService extends IService<OmsPaymentInfo> {

    PageUtils queryPage(Map<String, Object> params);
}

