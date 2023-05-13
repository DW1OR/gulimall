package com.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.ware.dao.WmsWareSkuDao;
import com.gulimall.ware.domain.WmsWareSku;
import com.gulimall.ware.service.WmsWareSkuService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("wmsWareSkuService")
public class WmsWareSkuServiceImpl extends ServiceImpl<WmsWareSkuDao, WmsWareSku> implements WmsWareSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsWareSku> page = this.page(
                new Query<WmsWareSku>().getPage(params),
                new QueryWrapper<WmsWareSku>()
        );

        return new PageUtils(page);
    }

}
