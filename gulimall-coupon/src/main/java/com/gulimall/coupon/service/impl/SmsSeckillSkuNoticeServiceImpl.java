package com.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.coupon.dao.SmsSeckillSkuNoticeDao;
import com.gulimall.coupon.domain.SmsSeckillSkuNotice;
import com.gulimall.coupon.service.SmsSeckillSkuNoticeService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("smsSeckillSkuNoticeService")
public class SmsSeckillSkuNoticeServiceImpl extends ServiceImpl<SmsSeckillSkuNoticeDao, SmsSeckillSkuNotice> implements SmsSeckillSkuNoticeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSeckillSkuNotice> page = this.page(
                new Query<SmsSeckillSkuNotice>().getPage(params),
                new QueryWrapper<SmsSeckillSkuNotice>()
        );

        return new PageUtils(page);
    }

}
