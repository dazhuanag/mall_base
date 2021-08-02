package com.dazhuang.mall.product.mapper;

import com.dazhuang.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dazhuangf
 * @email 1743460289@qq.com
 * @date 2021-08-02 14:22:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
