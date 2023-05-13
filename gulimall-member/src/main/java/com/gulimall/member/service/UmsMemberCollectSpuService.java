package com.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.member.domain.UmsMemberCollectSpu;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:58:31
 */
public interface UmsMemberCollectSpuService extends IService<UmsMemberCollectSpu> {

    PageUtils queryPage(Map<String, Object> params);
}

