package com.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.ware.domain.WmsWareSku;

import java.util.Map;

/**
 * 商品库存
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:03:30
 */
public interface WmsWareSkuService extends IService<WmsWareSku> {

    PageUtils queryPage(Map<String, Object> params);
}

