package com.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.ware.domain.WmsWareOrderTaskDetail;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:03:30
 */
public interface WmsWareOrderTaskDetailService extends IService<WmsWareOrderTaskDetail> {

    PageUtils queryPage(Map<String, Object> params);
}

