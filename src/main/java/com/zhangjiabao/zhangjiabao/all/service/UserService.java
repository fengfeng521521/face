package com.zhangjiabao.zhangjiabao.all.service;

import com.zhangjiabao.zhangjiabao.all.bean.User;
import com.zhangjiabao.zhangjiabao.all.mapper.UserMapperAPI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
  private UserMapperAPI userMapperAPI;

    public User getUserInfoService(){

        return  userMapperAPI.getUserInfo();


    }


}
