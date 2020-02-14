package com.zhangjiabao.zhangjiabao.all.controller;

import com.zhangjiabao.zhangjiabao.all.bean.Product_info;
import com.zhangjiabao.zhangjiabao.all.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
//显示所有信息
    @RequestMapping("/showAllProductInfo")
    public String showAllProductInfo(Model model){
        List<Product_info> product_infos= productService.showAllProductInfoservice();
        model.addAttribute("product_infos",product_infos);
        return  "ProductList";
    }







}
