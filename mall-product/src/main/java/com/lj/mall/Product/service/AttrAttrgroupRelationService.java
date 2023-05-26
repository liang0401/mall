package com.lj.mall.Product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lj.common.utils.PageUtils;
import com.lj.mall.Product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * ????&???Է???????
 *
 * @author lj
 * @email lj@gmail.com
 * @date 2023-05-27 20:25:08
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

