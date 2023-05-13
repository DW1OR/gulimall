package com.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.ware.dao.WmsPurchaseDao;
import com.gulimall.ware.domain.WmsPurchase;
import com.gulimall.ware.service.WmsPurchaseService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("wmsPurchaseService")
public class WmsPurchaseServiceImpl extends ServiceImpl<WmsPurchaseDao, WmsPurchase> implements WmsPurchaseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsPurchase> page = this.page(
                new Query<WmsPurchase>().getPage(params),
                new QueryWrapper<WmsPurchase>()
        );

        return new PageUtils(page);
    }

}
