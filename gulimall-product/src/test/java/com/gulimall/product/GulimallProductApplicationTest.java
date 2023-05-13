package com.gulimall.product;

import com.gulimall.product.domain.PmsBrand;
import com.gulimall.product.service.PmsBrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTest {

    @Autowired
    private PmsBrandService pmsBrandService;

    @Test
    public void contextLoads() {
        PmsBrand pmsBrand = new PmsBrand();

        pmsBrand.setName("华为");
        pmsBrandService.save(pmsBrand);

        System.out.println("保存成功");
    }
}
