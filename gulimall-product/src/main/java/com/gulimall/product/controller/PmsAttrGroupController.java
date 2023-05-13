package com.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gulimall.product.domain.PmsAttrGroup;
import com.gulimall.product.service.PmsAttrGroupService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.R;

/**
 * 属性分组
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
@RestController
@RequestMapping("/pmsattrgroup")
public class PmsAttrGroupController {
    @Autowired
    private PmsAttrGroupService pmsAttrGroupService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = pmsAttrGroupService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{attrGroupId}")
    public R info(@PathVariable("attrGroupId") Long attrGroupId) {
		PmsAttrGroup pmsAttrGroup = pmsAttrGroupService.getById(attrGroupId);

        return R.ok().put("pmsAttrGroup", pmsAttrGroup);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PmsAttrGroup pmsAttrGroup) {
		pmsAttrGroupService.save(pmsAttrGroup);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PmsAttrGroup pmsAttrGroup) {
		pmsAttrGroupService.updateById(pmsAttrGroup);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] attrGroupIds) {
		pmsAttrGroupService.removeByIds(Arrays.asList(attrGroupIds));

        return R.ok();
    }

}
