package com.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.coupon.domain.SmsHomeSubjectSpu;

import java.util.Map;

/**
 * 专题商品
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:24
 */
public interface SmsHomeSubjectSpuService extends IService<SmsHomeSubjectSpu> {

    PageUtils queryPage(Map<String, Object> params);
}

