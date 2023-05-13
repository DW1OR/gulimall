package com.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.order.dao.OmsOrderReturnReasonDao;
import com.gulimall.order.domain.OmsOrderReturnReason;
import com.gulimall.order.service.OmsOrderReturnReasonService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("omsOrderReturnReasonService")
public class OmsOrderReturnReasonServiceImpl extends ServiceImpl<OmsOrderReturnReasonDao, OmsOrderReturnReason> implements OmsOrderReturnReasonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsOrderReturnReason> page = this.page(
                new Query<OmsOrderReturnReason>().getPage(params),
                new QueryWrapper<OmsOrderReturnReason>()
        );

        return new PageUtils(page);
    }

}
