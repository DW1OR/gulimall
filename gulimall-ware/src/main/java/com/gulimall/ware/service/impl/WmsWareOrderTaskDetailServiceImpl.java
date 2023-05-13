package com.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.ware.dao.WmsWareOrderTaskDetailDao;
import com.gulimall.ware.domain.WmsWareOrderTaskDetail;
import com.gulimall.ware.service.WmsWareOrderTaskDetailService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("wmsWareOrderTaskDetailService")
public class WmsWareOrderTaskDetailServiceImpl extends ServiceImpl<WmsWareOrderTaskDetailDao, WmsWareOrderTaskDetail> implements WmsWareOrderTaskDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsWareOrderTaskDetail> page = this.page(
                new Query<WmsWareOrderTaskDetail>().getPage(params),
                new QueryWrapper<WmsWareOrderTaskDetail>()
        );

        return new PageUtils(page);
    }

}
