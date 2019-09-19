package com.zhangjiabao.zhangjiabao.all.controller.houTai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HouTaiUserController {

@RequestMapping("houTaiActionIndex")
public String showHouTaiIndex(){



    return "houTaiIndex";
}





}
