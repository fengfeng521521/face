package com.zhangjiabao.zhangjiabao.all.mapper;

import com.zhangjiabao.zhangjiabao.all.bean.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapperAPI {
    /**
     * 商品信息的数据dao
     *selectAllProductInfo 显示所有商品
     * */


    public List<Product_info>selectAllProductInfo();








































}
