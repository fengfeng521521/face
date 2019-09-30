package com.zhangjiabao.zhangjiabao.all.service;

import com.zhangjiabao.zhangjiabao.all.bean.*;
import com.zhangjiabao.zhangjiabao.all.mapper.ProductMapperAPI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class ProductService implements ProductAPI {
    @Resource
    ProductMapperAPI productMapperAPI;








    @Override
    public List<Product_info> showAllProductInfoservice() {




        return productMapperAPI.selectAllProductInfo();
    }

    /***
     *
     * 显示商品列表信息 包括商家库存
     *应该设计一个商品与店铺的关系表 然后中间有个字段保存库存信息
     *
     * */


    public void getAllInfo(HttpSession session){
        //商品信息
       List<Product_info> Product_infoList =productMapperAPI.selectAllProductInfo();
        if (Product_infoList!=null){
        for (Product_info product_info:Product_infoList){

            //商品图片放入session
          List<Product_pic_info> Product_pic_infolist= productMapperAPI.selectProductPicInfoByProductId(product_info.getProduct_id());
            session.setAttribute("Product_pic_infolist",Product_pic_infolist);
          //供应商放入session
           List<Product_supplierinfo> Product_supplierinfolist= productMapperAPI.selectProductSupplierinfobyInfosupid(productMapperAPI.selectProductInfoSupp(product_info.getProduct_id()).indexOf(0));
            session.setAttribute("Product_supplierinfolist",Product_supplierinfolist);
          //品牌信息
          List<Product_brand_info> Product_brand_infoList= productMapperAPI.selectProductBrandInfoByBrandInfo(product_info.getBrand_id());
            session.setAttribute("Product_brand_infoList",Product_brand_infoList);
            //分类信息
           /* productMapperAPI.selectProductCategoryByCategoryIdCategoryId(product_info.getThree_category_id());
*/

        }


        }


    }




    @Override
    public List<Product_info> showAllProductInfoBySupplierIdservice(int supplier_id) {
        return null;
    }

    @Override
    public List<Product_brand_info> getProductBrandInfoByBrandIdService(int brand_id) {
        return null;
    }

    @Override
    public List<Product_category> getProductCategoryByCategoryCodeService(String category_code) {
        return null;
    }

    @Override
    public List<Product_comment> getProductCommentByProductId(int product_id) {
        return null;
    }

    @Override
    public List<Product_pic_info> getProductPicInfoByProductId(int product_id) {
        return null;
    }

    @Override
    public List<Product_supplierinfo> getProductSupplierInfoBy(int product_id) {
        return null;
    }
}
