package com.dazhuang.mall.order.dao;

import com.dazhuang.mall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author dazhuang
 * @email 1743460289@qq.com
 * @date 2021-08-02 18:23:00
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
