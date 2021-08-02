package com.dazhuang.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dazhuang.common.utils.PageUtils;
import com.dazhuang.common.utils.Query;

import com.dazhuang.mall.product.mapper.CommentReplayDao;
import com.dazhuang.mall.product.entity.CommentReplayEntity;
import com.dazhuang.mall.product.service.CommentReplayService;


@Service()
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommentReplayEntity> page = this.page(
                new Query<CommentReplayEntity>().getPage(params),
                new QueryWrapper<CommentReplayEntity>()
        );

        return new PageUtils(page);
    }

}