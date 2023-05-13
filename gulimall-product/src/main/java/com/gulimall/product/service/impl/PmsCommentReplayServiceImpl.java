package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.product.dao.PmsCommentReplayDao;
import com.gulimall.product.domain.PmsCommentReplay;
import com.gulimall.product.service.PmsCommentReplayService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pmsCommentReplayService")
public class PmsCommentReplayServiceImpl extends ServiceImpl<PmsCommentReplayDao, PmsCommentReplay> implements PmsCommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCommentReplay> page = this.page(
                new Query<PmsCommentReplay>().getPage(params),
                new QueryWrapper<PmsCommentReplay>()
        );

        return new PageUtils(page);
    }

}
