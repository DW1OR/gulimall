package com.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.member.dao.UmsGrowthChangeHistoryDao;
import com.gulimall.member.domain.UmsGrowthChangeHistory;
import com.gulimall.member.service.UmsGrowthChangeHistoryService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("umsGrowthChangeHistoryService")
public class UmsGrowthChangeHistoryServiceImpl extends ServiceImpl<UmsGrowthChangeHistoryDao, UmsGrowthChangeHistory> implements UmsGrowthChangeHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsGrowthChangeHistory> page = this.page(
                new Query<UmsGrowthChangeHistory>().getPage(params),
                new QueryWrapper<UmsGrowthChangeHistory>()
        );

        return new PageUtils(page);
    }

}
