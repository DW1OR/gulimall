package com.gulimall.order.dao;

import com.gulimall.order.domain.OmsOrderSetting;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:00:56
 */
@Mapper
public interface OmsOrderSettingDao extends BaseMapper<OmsOrderSetting> {

}
