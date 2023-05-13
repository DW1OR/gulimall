package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.product.dao.PmsAttrGroupDao;
import com.gulimall.product.domain.PmsAttrGroup;
import com.gulimall.product.service.PmsAttrGroupService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsAttrGroupService")
public class PmsAttrGroupServiceImpl extends ServiceImpl<PmsAttrGroupDao, PmsAttrGroup> implements PmsAttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsAttrGroup> page = this.page(
                new Query<PmsAttrGroup>().getPage(params),
                new QueryWrapper<PmsAttrGroup>()
        );

        return new PageUtils(page);
    }

}
