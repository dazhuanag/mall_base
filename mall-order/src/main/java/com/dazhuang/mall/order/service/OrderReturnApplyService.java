package com.dazhuang.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dazhuang.common.utils.PageUtils;
import com.dazhuang.mall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author dazhuang
 * @email 1743460289@qq.com
 * @date 2021-08-02 18:23:00
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

