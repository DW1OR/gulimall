package com.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.ware.domain.WmsPurchaseDetail;

import java.util.Map;

/**
 * 
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:03:30
 */
public interface WmsPurchaseDetailService extends IService<WmsPurchaseDetail> {

    PageUtils queryPage(Map<String, Object> params);
}

