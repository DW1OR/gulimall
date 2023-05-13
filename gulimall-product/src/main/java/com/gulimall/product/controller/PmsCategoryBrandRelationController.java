package com.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gulimall.product.domain.PmsCategoryBrandRelation;
import com.gulimall.product.service.PmsCategoryBrandRelationService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.R;

/**
 * 品牌分类关联
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
@RestController
@RequestMapping("/pmscategorybrandrelation")
public class PmsCategoryBrandRelationController {
    @Autowired
    private PmsCategoryBrandRelationService pmsCategoryBrandRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = pmsCategoryBrandRelationService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
		PmsCategoryBrandRelation pmsCategoryBrandRelation = pmsCategoryBrandRelationService.getById(id);

        return R.ok().put("pmsCategoryBrandRelation", pmsCategoryBrandRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PmsCategoryBrandRelation pmsCategoryBrandRelation) {
		pmsCategoryBrandRelationService.save(pmsCategoryBrandRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PmsCategoryBrandRelation pmsCategoryBrandRelation) {
		pmsCategoryBrandRelationService.updateById(pmsCategoryBrandRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
		pmsCategoryBrandRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
