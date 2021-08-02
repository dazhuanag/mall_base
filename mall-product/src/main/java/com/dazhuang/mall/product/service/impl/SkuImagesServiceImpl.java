package com.dazhuang.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dazhuang.common.utils.PageUtils;
import com.dazhuang.common.utils.Query;

import com.dazhuang.mall.product.mapper.SkuImagesDao;
import com.dazhuang.mall.product.entity.SkuImagesEntity;
import com.dazhuang.mall.product.service.SkuImagesService;


@Service()
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesDao, SkuImagesEntity> implements SkuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuImagesEntity> page = this.page(
                new Query<SkuImagesEntity>().getPage(params),
                new QueryWrapper<SkuImagesEntity>()
        );

        return new PageUtils(page);
    }

}