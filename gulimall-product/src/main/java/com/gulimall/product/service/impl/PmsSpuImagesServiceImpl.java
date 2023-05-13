package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.product.dao.PmsSpuImagesDao;
import com.gulimall.product.domain.PmsSpuImages;
import com.gulimall.product.service.PmsSpuImagesService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsSpuImagesService")
public class PmsSpuImagesServiceImpl extends ServiceImpl<PmsSpuImagesDao, PmsSpuImages> implements PmsSpuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuImages> page = this.page(
                new Query<PmsSpuImages>().getPage(params),
                new QueryWrapper<PmsSpuImages>()
        );

        return new PageUtils(page);
    }

}
