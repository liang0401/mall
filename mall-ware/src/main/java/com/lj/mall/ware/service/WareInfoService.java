package com.lj.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lj.common.utils.PageUtils;
import com.lj.mall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * ?ֿ???Ϣ
 *
 * @author lj
 * @email lj@gmail.com
 * @date 2023-05-27 22:18:08
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

