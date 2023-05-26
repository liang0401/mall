package com.lj.mall.order.dao;

import com.lj.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * ????
 * 
 * @author lj
 * @email lj@gmail.com
 * @date 2023-05-27 22:12:18
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
