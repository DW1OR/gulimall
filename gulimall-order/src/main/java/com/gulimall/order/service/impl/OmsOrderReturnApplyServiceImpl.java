package com.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.order.dao.OmsOrderReturnApplyDao;
import com.gulimall.order.domain.OmsOrderReturnApply;
import com.gulimall.order.service.OmsOrderReturnApplyService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("omsOrderReturnApplyService")
public class OmsOrderReturnApplyServiceImpl extends ServiceImpl<OmsOrderReturnApplyDao, OmsOrderReturnApply> implements OmsOrderReturnApplyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsOrderReturnApply> page = this.page(
                new Query<OmsOrderReturnApply>().getPage(params),
                new QueryWrapper<OmsOrderReturnApply>()
        );

        return new PageUtils(page);
    }

}
