package com.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.coupon.dao.SmsHomeSubjectDao;
import com.gulimall.coupon.domain.SmsHomeSubject;
import com.gulimall.coupon.service.SmsHomeSubjectService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("smsHomeSubjectService")
public class SmsHomeSubjectServiceImpl extends ServiceImpl<SmsHomeSubjectDao, SmsHomeSubject> implements SmsHomeSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsHomeSubject> page = this.page(
                new Query<SmsHomeSubject>().getPage(params),
                new QueryWrapper<SmsHomeSubject>()
        );

        return new PageUtils(page);
    }

}
