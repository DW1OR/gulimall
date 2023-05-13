package com.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.member.domain.UmsIntegrationChangeHistory;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:58:31
 */
public interface UmsIntegrationChangeHistoryService extends IService<UmsIntegrationChangeHistory> {

    PageUtils queryPage(Map<String, Object> params);
}

