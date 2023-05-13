package com.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.member.dao.UmsMemberReceiveAddressDao;
import com.gulimall.member.domain.UmsMemberReceiveAddress;
import com.gulimall.member.service.UmsMemberReceiveAddressService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("umsMemberReceiveAddressService")
public class UmsMemberReceiveAddressServiceImpl extends ServiceImpl<UmsMemberReceiveAddressDao, UmsMemberReceiveAddress> implements UmsMemberReceiveAddressService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberReceiveAddress> page = this.page(
                new Query<UmsMemberReceiveAddress>().getPage(params),
                new QueryWrapper<UmsMemberReceiveAddress>()
        );

        return new PageUtils(page);
    }

}
