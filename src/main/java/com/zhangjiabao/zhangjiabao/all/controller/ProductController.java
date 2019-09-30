package com.zhangjiabao.zhangjiabao.all.controller;

import com.zhangjiabao.zhangjiabao.all.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
//显示所有信息
    @RequestMapping("/showAllProductInfo")
    public String showAllProductInfo(HttpSession session){
        productService.getAllInfo(session);

        return  "ProductList";
    }







}
