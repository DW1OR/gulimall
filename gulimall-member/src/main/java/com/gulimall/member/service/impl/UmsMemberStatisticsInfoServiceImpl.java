package com.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.member.dao.UmsMemberStatisticsInfoDao;
import com.gulimall.member.domain.UmsMemberStatisticsInfo;
import com.gulimall.member.service.UmsMemberStatisticsInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("umsMemberStatisticsInfoService")
public class UmsMemberStatisticsInfoServiceImpl extends ServiceImpl<UmsMemberStatisticsInfoDao, UmsMemberStatisticsInfo> implements UmsMemberStatisticsInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberStatisticsInfo> page = this.page(
                new Query<UmsMemberStatisticsInfo>().getPage(params),
                new QueryWrapper<UmsMemberStatisticsInfo>()
        );

        return new PageUtils(page);
    }

}
