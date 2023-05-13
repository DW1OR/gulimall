package com.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.member.dao.UmsIntegrationChangeHistoryDao;
import com.gulimall.member.domain.UmsIntegrationChangeHistory;
import com.gulimall.member.service.UmsIntegrationChangeHistoryService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("umsIntegrationChangeHistoryService")
public class UmsIntegrationChangeHistoryServiceImpl extends ServiceImpl<UmsIntegrationChangeHistoryDao, UmsIntegrationChangeHistory> implements UmsIntegrationChangeHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsIntegrationChangeHistory> page = this.page(
                new Query<UmsIntegrationChangeHistory>().getPage(params),
                new QueryWrapper<UmsIntegrationChangeHistory>()
        );

        return new PageUtils(page);
    }

}
