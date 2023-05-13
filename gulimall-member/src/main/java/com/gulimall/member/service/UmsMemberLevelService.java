package com.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.member.domain.UmsMemberLevel;

import java.util.Map;

/**
 * 会员等级
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:58:31
 */
public interface UmsMemberLevelService extends IService<UmsMemberLevel> {

    PageUtils queryPage(Map<String, Object> params);
}

