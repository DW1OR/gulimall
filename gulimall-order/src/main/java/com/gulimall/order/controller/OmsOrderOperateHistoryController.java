package com.gulimall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gulimall.order.domain.OmsOrderOperateHistory;
import com.gulimall.order.service.OmsOrderOperateHistoryService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.R;

/**
 * 订单操作历史记录
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:00:56
 */
@RestController
@RequestMapping("/omsorderoperatehistory")
public class OmsOrderOperateHistoryController {
    @Autowired
    private OmsOrderOperateHistoryService omsOrderOperateHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = omsOrderOperateHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
		OmsOrderOperateHistory omsOrderOperateHistory = omsOrderOperateHistoryService.getById(id);

        return R.ok().put("omsOrderOperateHistory", omsOrderOperateHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OmsOrderOperateHistory omsOrderOperateHistory) {
		omsOrderOperateHistoryService.save(omsOrderOperateHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OmsOrderOperateHistory omsOrderOperateHistory) {
		omsOrderOperateHistoryService.updateById(omsOrderOperateHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
		omsOrderOperateHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
