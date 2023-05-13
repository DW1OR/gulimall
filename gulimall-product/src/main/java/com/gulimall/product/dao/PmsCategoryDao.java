package com.gulimall.product.dao;

import com.gulimall.product.domain.PmsCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
@Mapper
public interface PmsCategoryDao extends BaseMapper<PmsCategory> {

}
