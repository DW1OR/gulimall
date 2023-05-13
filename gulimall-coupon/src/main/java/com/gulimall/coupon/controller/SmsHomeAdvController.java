package com.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gulimall.coupon.domain.SmsHomeAdv;
import com.gulimall.coupon.service.SmsHomeAdvService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.R;

/**
 * 首页轮播广告
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:25
 */
@RestController
@RequestMapping("/smshomeadv")
public class SmsHomeAdvController {
    @Autowired
    private SmsHomeAdvService smsHomeAdvService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = smsHomeAdvService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
		SmsHomeAdv smsHomeAdv = smsHomeAdvService.getById(id);

        return R.ok().put("smsHomeAdv", smsHomeAdv);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SmsHomeAdv smsHomeAdv) {
		smsHomeAdvService.save(smsHomeAdv);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SmsHomeAdv smsHomeAdv) {
		smsHomeAdvService.updateById(smsHomeAdv);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
		smsHomeAdvService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
