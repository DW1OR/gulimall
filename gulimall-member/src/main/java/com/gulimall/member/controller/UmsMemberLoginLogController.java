package com.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gulimall.member.domain.UmsMemberLoginLog;
import com.gulimall.member.service.UmsMemberLoginLogService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.R;

/**
 * 会员登录记录
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 15:58:31
 */
@RestController
@RequestMapping("/umsmemberloginlog")
public class UmsMemberLoginLogController {
    @Autowired
    private UmsMemberLoginLogService umsMemberLoginLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = umsMemberLoginLogService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
		UmsMemberLoginLog umsMemberLoginLog = umsMemberLoginLogService.getById(id);

        return R.ok().put("umsMemberLoginLog", umsMemberLoginLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UmsMemberLoginLog umsMemberLoginLog) {
		umsMemberLoginLogService.save(umsMemberLoginLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UmsMemberLoginLog umsMemberLoginLog) {
		umsMemberLoginLogService.updateById(umsMemberLoginLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
		umsMemberLoginLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
