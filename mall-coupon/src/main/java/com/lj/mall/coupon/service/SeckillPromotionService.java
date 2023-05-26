package com.lj.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lj.common.utils.PageUtils;
import com.lj.mall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * ??ɱ?
 *
 * @author lj
 * @email lj@gmail.com
 * @date 2023-05-27 21:51:53
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

