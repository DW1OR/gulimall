package com.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.order.dao.OmsOrderOperateHistoryDao;
import com.gulimall.order.domain.OmsOrderOperateHistory;
import com.gulimall.order.service.OmsOrderOperateHistoryService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("omsOrderOperateHistoryService")
public class OmsOrderOperateHistoryServiceImpl extends ServiceImpl<OmsOrderOperateHistoryDao, OmsOrderOperateHistory> implements OmsOrderOperateHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsOrderOperateHistory> page = this.page(
                new Query<OmsOrderOperateHistory>().getPage(params),
                new QueryWrapper<OmsOrderOperateHistory>()
        );

        return new PageUtils(page);
    }

}
