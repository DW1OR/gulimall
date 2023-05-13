package com.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.member.dao.UmsMemberCollectSubjectDao;
import com.gulimall.member.domain.UmsMemberCollectSubject;
import com.gulimall.member.service.UmsMemberCollectSubjectService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("umsMemberCollectSubjectService")
public class UmsMemberCollectSubjectServiceImpl extends ServiceImpl<UmsMemberCollectSubjectDao, UmsMemberCollectSubject> implements UmsMemberCollectSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberCollectSubject> page = this.page(
                new Query<UmsMemberCollectSubject>().getPage(params),
                new QueryWrapper<UmsMemberCollectSubject>()
        );

        return new PageUtils(page);
    }

}
