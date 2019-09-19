package com.zhangjiabao.zhangjiabao.all.service;

import com.zhangjiabao.zhangjiabao.all.bean.Customer;
import com.zhangjiabao.zhangjiabao.all.bean.CustomerInfo;
import com.zhangjiabao.zhangjiabao.all.bean.Customer_addr;
import com.zhangjiabao.zhangjiabao.all.mapper.CustomerMapper;
import com.zhangjiabao.zhangjiabao.all.service.ex.CustomerLoginNameAlreayException;
import com.zhangjiabao.zhangjiabao.all.service.ex.PassWordErrorException;
import com.zhangjiabao.zhangjiabao.all.service.ex.UserNameDoesNotExistException;
import com.zhangjiabao.zhangjiabao.all.unitls.MD5unitls;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
//用户登录的业务
/**
 * 根据需求编写业务代码
 * 2019.8.12
 * @author myf
 *
 *
 *
 */
@Service
public class CustomerService implements CustomerServiceAPI{
    @Resource
    CustomerMapper customerMapper;




    /**
     *
     * @deprecated 查询所有的登陆者
     * @throws RuntimeException 运行时从dao层拿不到数据报异常
     *
     *
     *
     *
     * */
    public List<Customer> getAllCustomer(){

       List<Customer> customers=  customerMapper.selectCustomers();
    if (customers==null){
        throw new RuntimeException("没有拿到");

    }
     return  customers;
    }

    /**
     *
     * @deprecated 录入登入者信息
     * @param customer 这是登录着注册信息
     *
     */
    public void insertCustomer(Customer customer){
        Customer selectCustomer=  customerMapper.selectCustomerByloginName(customer.getLoginName());
        if(selectCustomer==null){
            //使用MD5加密密码
            try {
                String newpwd= MD5unitls.EncoderByMd5(customer.getPassWord());
                customer.setPassWord(newpwd);
            }catch (Exception e){

                System.out.println(e.getStackTrace());
            }

        customerMapper.addCustomer(customer);

        }else {
        throw new CustomerLoginNameAlreayException("用户名被占用");

        }



    }
    //检测用户名是否存在
    public boolean isCheckUserLoginName(String loginName){
       Customer customer= customerMapper.selectCustomerByloginName(loginName);
       if(customer!=null){
           return true;

       }else {
           return  false;
       }
    }

    /**
    *
     *
     * @deprecated 处理登录
     * 2019.8.14
     *
     * * */

    public Customer toSignIn(String LoginName,String PassWord)  {
       Customer customer= customerMapper.selectCustomerByloginName(LoginName);
        if (customer!=null){

                if(MD5unitls.checkpassword(PassWord,customer.getPassWord())) {
                    return customer;
                }

            else {
                throw new PassWordErrorException("密码错误");
            }

        }else {

            throw new UserNameDoesNotExistException("用户未注册");


        }




    }

    @Override
    public void InsertCustomerIfo(CustomerInfo customerInfo, Customer_addr customer_addr) {
       if (customerInfo!=null && customer_addr!=null) {
           customerMapper.addCustomer_addr(customer_addr);
           customerMapper.addCustomerInfo(customerInfo);
       }else{
           throw new RuntimeException("个人信息不存在");
       }

    }
}