package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.product.dao.PmsAttrDao;
import com.gulimall.product.domain.PmsAttr;
import com.gulimall.product.service.PmsAttrService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsAttrService")
public class PmsAttrServiceImpl extends ServiceImpl<PmsAttrDao, PmsAttr> implements PmsAttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsAttr> page = this.page(
                new Query<PmsAttr>().getPage(params),
                new QueryWrapper<PmsAttr>()
        );

        return new PageUtils(page);
    }

}
