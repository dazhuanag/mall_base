package com.dazhuang.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dazhuang.common.utils.PageUtils;
import com.dazhuang.common.utils.Query;

import com.dazhuang.mall.product.mapper.SkuInfoDao;
import com.dazhuang.mall.product.entity.SkuInfoEntity;
import com.dazhuang.mall.product.service.SkuInfoService;


@Service()
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfoEntity> implements SkuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuInfoEntity> page = this.page(
                new Query<SkuInfoEntity>().getPage(params),
                new QueryWrapper<SkuInfoEntity>()
        );

        return new PageUtils(page);
    }

}