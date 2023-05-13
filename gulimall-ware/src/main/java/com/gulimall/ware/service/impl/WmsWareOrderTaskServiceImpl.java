package com.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.ware.dao.WmsWareOrderTaskDao;
import com.gulimall.ware.domain.WmsWareOrderTask;
import com.gulimall.ware.service.WmsWareOrderTaskService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("wmsWareOrderTaskService")
public class WmsWareOrderTaskServiceImpl extends ServiceImpl<WmsWareOrderTaskDao, WmsWareOrderTask> implements WmsWareOrderTaskService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsWareOrderTask> page = this.page(
                new Query<WmsWareOrderTask>().getPage(params),
                new QueryWrapper<WmsWareOrderTask>()
        );

        return new PageUtils(page);
    }

}
