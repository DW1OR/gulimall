package com.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.order.dao.OmsPaymentInfoDao;
import com.gulimall.order.domain.OmsPaymentInfo;
import com.gulimall.order.service.OmsPaymentInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("omsPaymentInfoService")
public class OmsPaymentInfoServiceImpl extends ServiceImpl<OmsPaymentInfoDao, OmsPaymentInfo> implements OmsPaymentInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsPaymentInfo> page = this.page(
                new Query<OmsPaymentInfo>().getPage(params),
                new QueryWrapper<OmsPaymentInfo>()
        );

        return new PageUtils(page);
    }

}
