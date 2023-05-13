package com.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.member.dao.UmsMemberCollectSpuDao;
import com.gulimall.member.domain.UmsMemberCollectSpu;
import com.gulimall.member.service.UmsMemberCollectSpuService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("umsMemberCollectSpuService")
public class UmsMemberCollectSpuServiceImpl extends ServiceImpl<UmsMemberCollectSpuDao, UmsMemberCollectSpu> implements UmsMemberCollectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberCollectSpu> page = this.page(
                new Query<UmsMemberCollectSpu>().getPage(params),
                new QueryWrapper<UmsMemberCollectSpu>()
        );

        return new PageUtils(page);
    }

}
