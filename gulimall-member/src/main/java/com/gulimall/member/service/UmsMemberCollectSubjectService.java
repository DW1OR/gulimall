package com.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.member.domain.UmsMemberCollectSubject;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:58:31
 */
public interface UmsMemberCollectSubjectService extends IService<UmsMemberCollectSubject> {

    PageUtils queryPage(Map<String, Object> params);
}

