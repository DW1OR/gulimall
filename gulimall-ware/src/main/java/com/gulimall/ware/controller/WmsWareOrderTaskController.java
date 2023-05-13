package com.gulimall.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gulimall.ware.domain.WmsWareOrderTask;
import com.gulimall.ware.service.WmsWareOrderTaskService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.R;

/**
 * 库存工作单
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:03:30
 */
@RestController
@RequestMapping("/wmswareordertask")
public class WmsWareOrderTaskController {
    @Autowired
    private WmsWareOrderTaskService wmsWareOrderTaskService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = wmsWareOrderTaskService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
		WmsWareOrderTask wmsWareOrderTask = wmsWareOrderTaskService.getById(id);

        return R.ok().put("wmsWareOrderTask", wmsWareOrderTask);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WmsWareOrderTask wmsWareOrderTask) {
		wmsWareOrderTaskService.save(wmsWareOrderTask);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WmsWareOrderTask wmsWareOrderTask) {
		wmsWareOrderTaskService.updateById(wmsWareOrderTask);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
		wmsWareOrderTaskService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
