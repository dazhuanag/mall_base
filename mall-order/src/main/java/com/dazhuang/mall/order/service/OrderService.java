package com.dazhuang.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dazhuang.common.utils.PageUtils;
import com.dazhuang.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author dazhuang
 * @email 1743460289@qq.com
 * @date 2021-08-02 18:22:59
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

