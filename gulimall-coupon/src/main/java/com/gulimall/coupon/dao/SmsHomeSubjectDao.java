package com.gulimall.coupon.dao;

import com.gulimall.coupon.domain.SmsHomeSubject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:25
 */
@Mapper
public interface SmsHomeSubjectDao extends BaseMapper<SmsHomeSubject> {

}
