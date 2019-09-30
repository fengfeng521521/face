package com.zhangjiabao.zhangjiabao.all.mapper;

import com.zhangjiabao.zhangjiabao.all.bean.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapperAPI {
    /**
     * 商品信息的数据dao
     *
     * */
    //录入商品品牌信息表（brand_info）
    public void insertProductBrandInfo(Product_brand_info product_brand_info);
    //查询商品品牌信息通过主键brand_id
    public List<Product_brand_info>selectProductBrandInfoByBrandInfo(int brand_id);













    //录入商品分类信息表(product_category)
    public void insertProductCategory(Product_category product_category);
    //查询商品分类信息表
    //查询商品分类信息表根据商品的3级菜单
    public List<Product_category>selectProductCategoryByThreeCategoryId(String category_code);

















    //录入商品供应商信息表（supplier_info）
    public void insertProductSupplierInfo(Product_supplierinfo product_supplierinfo);
    //查询关系ID供应商信息通过infosupid
    public List<Product_supplierinfo>selectProductSupplierinfobyInfosupid(int infosupid);
    //通过商品id查询关系表
    public List<Product_info_supp>selectProductInfoSupp(int product_id);











    //录入商品信息表(product_info)
    public void insertProductInfo(Product_info product_info);

    public List<Product_info>selectAllProductInfo();











    //录入商品商品图片表(productpicinfo)
    public void insertProductPicinfo(Product_pic_info product_pic_info);
    //查询商品图片表信息product_id
    public List<Product_pic_info>selectProductPicInfoByProductId(int product_id);















    //录入商品商品评论表（product_comment）
    public void insertProductComment(Product_comment product_comment);
    public List<Product_comment> selectProductCommentByProductId(Integer product_id);


}
