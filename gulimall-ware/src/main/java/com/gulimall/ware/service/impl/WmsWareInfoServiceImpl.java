package com.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.ware.dao.WmsWareInfoDao;
import com.gulimall.ware.domain.WmsWareInfo;
import com.gulimall.ware.service.WmsWareInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("wmsWareInfoService")
public class WmsWareInfoServiceImpl extends ServiceImpl<WmsWareInfoDao, WmsWareInfo> implements WmsWareInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsWareInfo> page = this.page(
                new Query<WmsWareInfo>().getPage(params),
                new QueryWrapper<WmsWareInfo>()
        );

        return new PageUtils(page);
    }

}
