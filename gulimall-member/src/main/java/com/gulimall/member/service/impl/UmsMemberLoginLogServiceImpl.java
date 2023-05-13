package com.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.member.dao.UmsMemberLoginLogDao;
import com.gulimall.member.domain.UmsMemberLoginLog;
import com.gulimall.member.service.UmsMemberLoginLogService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("umsMemberLoginLogService")
public class UmsMemberLoginLogServiceImpl extends ServiceImpl<UmsMemberLoginLogDao, UmsMemberLoginLog> implements UmsMemberLoginLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberLoginLog> page = this.page(
                new Query<UmsMemberLoginLog>().getPage(params),
                new QueryWrapper<UmsMemberLoginLog>()
        );

        return new PageUtils(page);
    }

}
