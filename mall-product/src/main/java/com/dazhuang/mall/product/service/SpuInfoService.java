package com.dazhuang.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dazhuang.common.utils.PageUtils;
import com.dazhuang.mall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author dazhuangf
 * @email 1743460289@qq.com
 * @date 2021-08-02 14:22:45
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

