package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.product.dao.PmsSpuInfoDao;
import com.gulimall.product.domain.PmsSpuInfo;
import com.gulimall.product.service.PmsSpuInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsSpuInfoService")
public class PmsSpuInfoServiceImpl extends ServiceImpl<PmsSpuInfoDao, PmsSpuInfo> implements PmsSpuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuInfo> page = this.page(
                new Query<PmsSpuInfo>().getPage(params),
                new QueryWrapper<PmsSpuInfo>()
        );

        return new PageUtils(page);
    }

}
