package com.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.order.dao.OmsOrderSettingDao;
import com.gulimall.order.domain.OmsOrderSetting;
import com.gulimall.order.service.OmsOrderSettingService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("omsOrderSettingService")
public class OmsOrderSettingServiceImpl extends ServiceImpl<OmsOrderSettingDao, OmsOrderSetting> implements OmsOrderSettingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsOrderSetting> page = this.page(
                new Query<OmsOrderSetting>().getPage(params),
                new QueryWrapper<OmsOrderSetting>()
        );

        return new PageUtils(page);
    }

}
