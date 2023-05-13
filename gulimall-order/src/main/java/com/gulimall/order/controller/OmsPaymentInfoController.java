package com.gulimall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gulimall.order.domain.OmsPaymentInfo;
import com.gulimall.order.service.OmsPaymentInfoService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.R;

/**
 * 支付信息表
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 16:00:56
 */
@RestController
@RequestMapping("/omspaymentinfo")
public class OmsPaymentInfoController {
    @Autowired
    private OmsPaymentInfoService omsPaymentInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = omsPaymentInfoService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
		OmsPaymentInfo omsPaymentInfo = omsPaymentInfoService.getById(id);

        return R.ok().put("omsPaymentInfo", omsPaymentInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OmsPaymentInfo omsPaymentInfo) {
		omsPaymentInfoService.save(omsPaymentInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OmsPaymentInfo omsPaymentInfo) {
		omsPaymentInfoService.updateById(omsPaymentInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
		omsPaymentInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
