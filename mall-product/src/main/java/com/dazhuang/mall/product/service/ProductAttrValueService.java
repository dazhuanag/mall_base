package com.dazhuang.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dazhuang.common.utils.PageUtils;
import com.dazhuang.mall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author dazhuangf
 * @email 1743460289@qq.com
 * @date 2021-08-02 14:22:45
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

