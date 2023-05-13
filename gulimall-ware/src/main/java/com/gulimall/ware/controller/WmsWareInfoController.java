package com.gulimall.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gulimall.ware.domain.WmsWareInfo;
import com.gulimall.ware.service.WmsWareInfoService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.R;

/**
 * 仓库信息
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:03:30
 */
@RestController
@RequestMapping("/wmswareinfo")
public class WmsWareInfoController {
    @Autowired
    private WmsWareInfoService wmsWareInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = wmsWareInfoService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
		WmsWareInfo wmsWareInfo = wmsWareInfoService.getById(id);

        return R.ok().put("wmsWareInfo", wmsWareInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WmsWareInfo wmsWareInfo) {
		wmsWareInfoService.save(wmsWareInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WmsWareInfo wmsWareInfo) {
		wmsWareInfoService.updateById(wmsWareInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
		wmsWareInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
