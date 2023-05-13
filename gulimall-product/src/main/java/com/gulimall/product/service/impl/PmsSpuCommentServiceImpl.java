package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.product.dao.PmsSpuCommentDao;
import com.gulimall.product.domain.PmsSpuComment;
import com.gulimall.product.service.PmsSpuCommentService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsSpuCommentService")
public class PmsSpuCommentServiceImpl extends ServiceImpl<PmsSpuCommentDao, PmsSpuComment> implements PmsSpuCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuComment> page = this.page(
                new Query<PmsSpuComment>().getPage(params),
                new QueryWrapper<PmsSpuComment>()
        );

        return new PageUtils(page);
    }

}
