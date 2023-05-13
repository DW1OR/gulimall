package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.domain.PmsCommentReplay;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
public interface PmsCommentReplayService extends IService<PmsCommentReplay> {

    PageUtils queryPage(Map<String, Object> params);
}

