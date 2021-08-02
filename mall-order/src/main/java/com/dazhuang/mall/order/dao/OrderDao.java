package com.dazhuang.mall.order.dao;

import com.dazhuang.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author dazhuang
 * @email 1743460289@qq.com
 * @date 2021-08-02 18:22:59
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
