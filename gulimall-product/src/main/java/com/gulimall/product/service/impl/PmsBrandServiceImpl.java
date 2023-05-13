package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.product.dao.PmsBrandDao;
import com.gulimall.product.domain.PmsBrand;
import com.gulimall.product.service.PmsBrandService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsBrandService")
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandDao, PmsBrand> implements PmsBrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsBrand> page = this.page(
                new Query<PmsBrand>().getPage(params),
                new QueryWrapper<PmsBrand>()
        );

        return new PageUtils(page);
    }

}
