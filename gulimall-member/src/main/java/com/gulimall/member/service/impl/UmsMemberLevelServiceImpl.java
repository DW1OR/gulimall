package com.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.member.dao.UmsMemberLevelDao;
import com.gulimall.member.domain.UmsMemberLevel;
import com.gulimall.member.service.UmsMemberLevelService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("umsMemberLevelService")
public class UmsMemberLevelServiceImpl extends ServiceImpl<UmsMemberLevelDao, UmsMemberLevel> implements UmsMemberLevelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberLevel> page = this.page(
                new Query<UmsMemberLevel>().getPage(params),
                new QueryWrapper<UmsMemberLevel>()
        );

        return new PageUtils(page);
    }

}
