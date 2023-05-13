package com.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.order.dao.OmsRefundInfoDao;
import com.gulimall.order.domain.OmsRefundInfo;
import com.gulimall.order.service.OmsRefundInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("omsRefundInfoService")
public class OmsRefundInfoServiceImpl extends ServiceImpl<OmsRefundInfoDao, OmsRefundInfo> implements OmsRefundInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsRefundInfo> page = this.page(
                new Query<OmsRefundInfo>().getPage(params),
                new QueryWrapper<OmsRefundInfo>()
        );

        return new PageUtils(page);
    }

}
