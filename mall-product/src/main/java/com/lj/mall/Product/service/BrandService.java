package com.lj.mall.Product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lj.common.utils.PageUtils;
import com.lj.mall.Product.entity.BrandEntity;

import java.util.Map;

/**
 * Ʒ?
 *
 * @author lj
 * @email lj@gmail.com
 * @date 2023-05-27 20:25:08
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

