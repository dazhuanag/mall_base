package com.dazhuang.mall.order.dao;

import com.dazhuang.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author dazhuang
 * @email 1743460289@qq.com
 * @date 2021-08-02 18:23:00
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
