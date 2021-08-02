package com.dazhuang.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dazhuang.common.utils.PageUtils;
import com.dazhuang.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author dazhuangf
 * @email 1743460289@qq.com
 * @date 2021-08-02 14:22:45
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

