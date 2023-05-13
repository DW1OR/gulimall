package com.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.gulimall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gulimall.member.domain.UmsMember;
import com.gulimall.member.service.UmsMemberService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.R;

/**
 * 会员
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:58:31
 */
@RestController
@RequestMapping("/umsmember")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;

    @Autowired
    private CouponFeignService couponFeignService;

    @RequestMapping("/coupons")
    public R test() {
        UmsMember umsMember = new UmsMember();
        umsMember.setNickname("test");
        R r = couponFeignService.memberCoupons();
        return R.ok().put("member", umsMember).put("coupon", r.get("coupons"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = umsMemberService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
		UmsMember umsMember = umsMemberService.getById(id);

        return R.ok().put("umsMember", umsMember);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UmsMember umsMember) {
		umsMemberService.save(umsMember);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UmsMember umsMember) {
		umsMemberService.updateById(umsMember);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
		umsMemberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
