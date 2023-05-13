package com.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.order.dao.OmsOrderItemDao;
import com.gulimall.order.domain.OmsOrderItem;
import com.gulimall.order.service.OmsOrderItemService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("omsOrderItemService")
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemDao, OmsOrderItem> implements OmsOrderItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsOrderItem> page = this.page(
                new Query<OmsOrderItem>().getPage(params),
                new QueryWrapper<OmsOrderItem>()
        );

        return new PageUtils(page);
    }

}
