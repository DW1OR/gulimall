package com.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.ware.dao.WmsPurchaseDetailDao;
import com.gulimall.ware.domain.WmsPurchaseDetail;
import com.gulimall.ware.service.WmsPurchaseDetailService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("wmsPurchaseDetailService")
public class WmsPurchaseDetailServiceImpl extends ServiceImpl<WmsPurchaseDetailDao, WmsPurchaseDetail> implements WmsPurchaseDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsPurchaseDetail> page = this.page(
                new Query<WmsPurchaseDetail>().getPage(params),
                new QueryWrapper<WmsPurchaseDetail>()
        );

        return new PageUtils(page);
    }

}
