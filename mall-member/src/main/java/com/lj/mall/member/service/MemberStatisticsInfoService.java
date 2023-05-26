package com.lj.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lj.common.utils.PageUtils;
import com.lj.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * ??Աͳ????Ϣ
 *
 * @author lj
 * @email lj@gmail.com
 * @date 2023-05-27 22:04:30
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

