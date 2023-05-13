package com.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.ware.domain.UndoLog;

import java.util.Map;

/**
 * 
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:03:30
 */
public interface UndoLogService extends IService<UndoLog> {

    PageUtils queryPage(Map<String, Object> params);
}

