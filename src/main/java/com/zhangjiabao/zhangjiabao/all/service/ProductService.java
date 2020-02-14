package com.zhangjiabao.zhangjiabao.all.service;

import com.zhangjiabao.zhangjiabao.all.bean.Product_info;
import com.zhangjiabao.zhangjiabao.all.mapper.ProductMapperAPI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductService implements ProductServiceAPI {
    @Resource
    ProductMapperAPI productMapperAPI;








    @Override
    public List<Product_info> showAllProductInfoservice() {




        return productMapperAPI.selectAllProductInfo();
    }


}
