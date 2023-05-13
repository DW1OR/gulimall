package com.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gulimall.product.domain.PmsSkuImages;
import com.gulimall.product.service.PmsSkuImagesService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.R;

/**
 * sku图片
 *
 * @author li
 * @email li@test.com
 * @date 2023-05-12 11:21:35
 */
@RestController
@RequestMapping("/pmsskuimages")
public class PmsSkuImagesController {
    @Autowired
    private PmsSkuImagesService pmsSkuImagesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = pmsSkuImagesService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
		PmsSkuImages pmsSkuImages = pmsSkuImagesService.getById(id);

        return R.ok().put("pmsSkuImages", pmsSkuImages);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PmsSkuImages pmsSkuImages) {
		pmsSkuImagesService.save(pmsSkuImages);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PmsSkuImages pmsSkuImages) {
		pmsSkuImagesService.updateById(pmsSkuImages);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
		pmsSkuImagesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
