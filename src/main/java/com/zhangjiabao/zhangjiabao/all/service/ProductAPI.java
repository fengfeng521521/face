package com.zhangjiabao.zhangjiabao.all.service;

import com.zhangjiabao.zhangjiabao.all.bean.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductAPI {
/**
 * 这个是个商品相关的业务接口
 *
 *
 *
 * */
    //显示商品信息
    public List<Product_info>showAllProductInfoservice();

    //显示商品信息通过店家supplier_id
    public List<Product_info>showAllProductInfoBySupplierIdservice(int supplier_id);










    //显示商品品牌信息通过brand_id
    public List<Product_brand_info>getProductBrandInfoByBrandIdService(int brand_id);
    //显示商品分类信息通过category_code
    public List<Product_category>getProductCategoryByCategoryCodeService(String category_code);
    //显示评论信息通过product_id
    public List<Product_comment>getProductCommentByProductId(int product_id);
    //显示商品图片信息通过product_id
    public List<Product_pic_info>getProductPicInfoByProductId(int product_id);
    //显示店家信息通过product_id
    public List<Product_supplierinfo>getProductSupplierInfoBy(int product_id);




}
