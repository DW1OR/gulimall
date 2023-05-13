package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.domain.PmsSpuComment;

import java.util.Map;

/**
 * 商品评价
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
public interface PmsSpuCommentService extends IService<PmsSpuComment> {

    PageUtils queryPage(Map<String, Object> params);
}

