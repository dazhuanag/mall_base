package com.dazhuang.mall.product;

import com.dazhuang.mall.product.entity.BrandEntity;
import com.dazhuang.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("测试");
        boolean save = brandService.save(brandEntity);
        System.out.println("save"+save);
    }

}
