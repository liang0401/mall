package com.lj.mall.Product;

import com.lj.mall.Product.dao.BrandDao;
import com.lj.mall.Product.entity.BrandEntity;
import com.lj.mall.Product.service.BrandService;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@MapperScan(value = "com.lj.mall.Product.dao")
@RunWith(SpringRunner.class)

public class MallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    public void a() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("华为");
        brandService.save(brandEntity);
    }
    @Test
    public void contextLoads() {

        for (BrandEntity brandEntity : brandService.list()) {

            System.out.println(brandEntity);
        }
    }

}
