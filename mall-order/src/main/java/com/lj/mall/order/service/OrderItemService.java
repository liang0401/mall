package com.lj.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lj.common.utils.PageUtils;
import com.lj.mall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * ????????Ϣ
 *
 * @author lj
 * @email lj@gmail.com
 * @date 2023-05-27 22:12:18
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

