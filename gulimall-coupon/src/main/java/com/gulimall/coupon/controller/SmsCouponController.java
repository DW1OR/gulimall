package com.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gulimall.coupon.domain.SmsCoupon;
import com.gulimall.coupon.service.SmsCouponService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.R;

/**
 * 优惠券信息
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:25
 */
@RestController
@RequestMapping("/smscoupon")
public class SmsCouponController {
    @Autowired
    private SmsCouponService smsCouponService;

    @RequestMapping("/member/list")
    public R memberCoupons() {
        SmsCoupon smsCoupon = new SmsCoupon();
        smsCoupon.setCouponName("test优惠卷");
        return R.ok().put("coupons", Arrays.asList(smsCoupon));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = smsCouponService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
		SmsCoupon smsCoupon = smsCouponService.getById(id);

        return R.ok().put("smsCoupon", smsCoupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SmsCoupon smsCoupon) {
		smsCouponService.save(smsCoupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SmsCoupon smsCoupon) {
		smsCouponService.updateById(smsCoupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
		smsCouponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
