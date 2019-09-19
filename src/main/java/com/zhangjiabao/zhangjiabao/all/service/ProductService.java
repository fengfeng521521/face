package com.zhangjiabao.zhangjiabao.all.service;

import com.zhangjiabao.zhangjiabao.all.bean.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService implements ProductAPI {
    @Autowired
    ProductAPI productAPI;








    @Override
    public List<Product_info> showAllProductInfoservice() {




        return productAPI.showAllProductInfoservice();
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
