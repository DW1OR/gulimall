package com.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.coupon.dao.SmsHomeSubjectSpuDao;
import com.gulimall.coupon.domain.SmsHomeSubjectSpu;
import com.gulimall.coupon.service.SmsHomeSubjectSpuService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("smsHomeSubjectSpuService")
public class SmsHomeSubjectSpuServiceImpl extends ServiceImpl<SmsHomeSubjectSpuDao, SmsHomeSubjectSpu> implements SmsHomeSubjectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsHomeSubjectSpu> page = this.page(
                new Query<SmsHomeSubjectSpu>().getPage(params),
                new QueryWrapper<SmsHomeSubjectSpu>()
        );

        return new PageUtils(page);
    }

}
