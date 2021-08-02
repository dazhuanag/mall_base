package com.dazhuang.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dazhuang.common.utils.PageUtils;
import com.dazhuang.common.utils.Query;

import com.dazhuang.mall.product.mapper.BrandDao;
import com.dazhuang.mall.product.entity.BrandEntity;
import com.dazhuang.mall.product.service.BrandService;


@Service()
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageUtils(page);
    }

}