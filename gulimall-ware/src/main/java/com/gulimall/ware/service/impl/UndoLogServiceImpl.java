package com.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;
import com.gulimall.ware.dao.UndoLogDao;
import com.gulimall.ware.domain.UndoLog;
import com.gulimall.ware.service.UndoLogService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("undoLogService")
public class UndoLogServiceImpl extends ServiceImpl<UndoLogDao, UndoLog> implements UndoLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UndoLog> page = this.page(
                new Query<UndoLog>().getPage(params),
                new QueryWrapper<UndoLog>()
        );

        return new PageUtils(page);
    }

}
