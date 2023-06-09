package com.lj.mall.Product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * spuͼƬ
 * 
 * @author lj
 * @email lj@gmail.com
 * @date 2023-05-27 20:25:08
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * ͼƬ??
	 */
	private String imgName;
	/**
	 * ͼƬ??ַ
	 */
	private String imgUrl;
	/**
	 * ˳?
	 */
	private Integer imgSort;
	/**
	 * ?Ƿ?Ĭ??ͼ
	 */
	private Integer defaultImg;

}
