package com.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.member.dao.UmsMemberDao;
import com.gulimall.member.domain.UmsMember;
import com.gulimall.member.service.UmsMemberService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("umsMemberService")
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberDao, UmsMember> implements UmsMemberService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMember> page = this.page(
                new Query<UmsMember>().getPage(params),
                new QueryWrapper<UmsMember>()
        );

        return new PageUtils(page);
    }

}
