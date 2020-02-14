package com.zhangjiabao.zhangjiabao.all.service;

import com.zhangjiabao.zhangjiabao.all.bean.Customer;
import com.zhangjiabao.zhangjiabao.all.bean.Customer_info;
import com.zhangjiabao.zhangjiabao.all.bean.Customer_addr;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerServiceAPI {

    public List<Customer> getAllCustomer();
    public void insertCustomer(Customer customer);
    public boolean isCheckUserLoginName(String loginName);

    public Customer toSignIn(String LoginName,String PassWord);
    public void InsertCustomerIfo(Customer_info Customer_info, Customer_addr customer_addr);


}
