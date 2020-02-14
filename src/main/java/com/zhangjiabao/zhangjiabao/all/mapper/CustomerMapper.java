package com.zhangjiabao.zhangjiabao.all.mapper;

import com.zhangjiabao.zhangjiabao.all.bean.Customer;
import com.zhangjiabao.zhangjiabao.all.bean.Customer_info;
import com.zhangjiabao.zhangjiabao.all.bean.Customer_addr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 *
 * @deprecated 这是登陆者dao层接口
 *
 *
 *
 * */


@Mapper
public interface CustomerMapper {
    //增
    public void addCustomer(Customer customer);
    //删
    public void deleteCustomerById(Integer id);

    //查
    public Customer selectCustomerById(Integer id);
    public List<Customer> selectCustomers();
    public Customer selectCustomerByloginName(String LoginName);
    //改
    public void upDateCustomerById(Customer customer);

    //增加客户信息（添加到两个表中）
    public void addCustomer_info(Customer_info Customer_info);
    public void addCustomer_addr(Customer_addr customer_addr);

}
