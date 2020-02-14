package com.zhangjiabao.zhangjiabao;

import com.zhangjiabao.zhangjiabao.all.mapper.CustomerMapper;
import com.zhangjiabao.zhangjiabao.all.mapper.ProductMapperAPI;
import com.zhangjiabao.zhangjiabao.all.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZhangjiabaoApplicationTests {

/*
*
*
* github账号：邮箱xieyaru0810@163.com  用户名:onlyOneYR 密码：xieyaru123*
*
*
*
* */
    @Resource
    UserService userService;

    @Resource
    CustomerMapper customerMapper;

    @Resource
    ProductMapperAPI productAPI;


    @Test
    public void contextLoads() {

        System.out.println(userService.getUserInfoService());


    }
    @Test
    public void showallTestProductMapper() {

        System.out.println(productAPI.selectAllProductInfo().get(0).getProduct_name());


    }


}
