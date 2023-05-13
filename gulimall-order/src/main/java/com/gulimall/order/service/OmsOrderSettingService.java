package com.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.order.domain.OmsOrderSetting;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:00:56
 */
public interface OmsOrderSettingService extends IService<OmsOrderSetting> {

    PageUtils queryPage(Map<String, Object> params);
}

