package com.gulimall.order.dao;

import com.gulimall.order.domain.OmsOrderOperateHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:00:56
 */
@Mapper
public interface OmsOrderOperateHistoryDao extends BaseMapper<OmsOrderOperateHistory> {

}
