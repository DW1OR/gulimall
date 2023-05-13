package com.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.order.dao.OmsOrderDao;
import com.gulimall.order.domain.OmsOrder;
import com.gulimall.order.service.OmsOrderService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("omsOrderService")
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderDao, OmsOrder> implements OmsOrderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsOrder> page = this.page(
                new Query<OmsOrder>().getPage(params),
                new QueryWrapper<OmsOrder>()
        );

        return new PageUtils(page);
    }

}
