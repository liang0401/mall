package com.lj.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lj.common.utils.PageUtils;
import com.lj.mall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * ??ҳר???�jd??ҳ?????ܶ?ר?⣬ÿ??ר???????µ?ҳ?棬չʾר????Ʒ??Ϣ??
 *
 * @author lj
 * @email lj@gmail.com
 * @date 2023-05-27 21:51:54
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

