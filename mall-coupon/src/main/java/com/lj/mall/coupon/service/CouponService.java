package com.lj.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lj.common.utils.PageUtils;
import com.lj.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * ?Ż?ȯ??Ϣ
 *
 * @author lj
 * @email lj@gmail.com
 * @date 2023-05-27 21:51:54
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

