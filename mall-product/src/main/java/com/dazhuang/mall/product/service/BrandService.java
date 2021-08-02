package com.dazhuang.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dazhuang.common.utils.PageUtils;
import com.dazhuang.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author dazhuangf
 * @email 1743460289@qq.com
 * @date 2021-08-02 14:22:44
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

