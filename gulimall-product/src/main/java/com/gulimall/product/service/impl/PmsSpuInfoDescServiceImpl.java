package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.product.dao.PmsSpuInfoDescDao;
import com.gulimall.product.domain.PmsSpuInfoDesc;
import com.gulimall.product.service.PmsSpuInfoDescService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsSpuInfoDescService")
public class PmsSpuInfoDescServiceImpl extends ServiceImpl<PmsSpuInfoDescDao, PmsSpuInfoDesc> implements PmsSpuInfoDescService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuInfoDesc> page = this.page(
                new Query<PmsSpuInfoDesc>().getPage(params),
                new QueryWrapper<PmsSpuInfoDesc>()
        );

        return new PageUtils(page);
    }

}
