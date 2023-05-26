package com.lj.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ??Ʒ???
 * 
 * @author lj
 * @email lj@gmail.com
 * @date 2023-05-27 22:18:08
 */
@Data
@TableName("wms_ware_sku")
public class WareSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * ?ֿ?id
	 */
	private Long wareId;
	/**
	 * ??????
	 */
	private Integer stock;
	/**
	 * sku_name
	 */
	private String skuName;
	/**
	 * ???????
	 */
	private Integer stockLocked;

}
