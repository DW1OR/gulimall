package com.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gulimall.coupon.domain.SmsSeckillSession;
import com.gulimall.coupon.service.SmsSeckillSessionService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.R;

/**
 * 秒杀活动场次
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:51:25
 */
@RestController
@RequestMapping("/smsseckillsession")
public class SmsSeckillSessionController {
    @Autowired
    private SmsSeckillSessionService smsSeckillSessionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = smsSeckillSessionService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
		SmsSeckillSession smsSeckillSession = smsSeckillSessionService.getById(id);

        return R.ok().put("smsSeckillSession", smsSeckillSession);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SmsSeckillSession smsSeckillSession) {
		smsSeckillSessionService.save(smsSeckillSession);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SmsSeckillSession smsSeckillSession) {
		smsSeckillSessionService.updateById(smsSeckillSession);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
		smsSeckillSessionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
