package com.zhangjiabao.zhangjiabao.all.controller;

import com.zhangjiabao.zhangjiabao.all.bean.AddressOnlyChengShi;
import com.zhangjiabao.zhangjiabao.all.bean.ResponseResult;
import com.zhangjiabao.zhangjiabao.all.bean.School;
import com.zhangjiabao.zhangjiabao.all.service.AddressServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class AddressController {
    @Autowired
    AddressServiceAPI addressService;



    /**
     * @deprecated 完善个人信息中的地址的三级联动 address
     * 2019.8.19
     *
     *
     * */
    @RequestMapping("/past/showAddress")
    @ResponseBody
    public ResponseResult<List<AddressOnlyChengShi>> getAddressOnlyChengShi(){
        ResponseResult<List<AddressOnlyChengShi>> rr=new ResponseResult<>();
        rr.setState(1);
        List<AddressOnlyChengShi> addresslist =addressService.getProvinceInfo();
        rr.setData(addresslist);
        rr.setMessage("查询成功");


        return  rr;

    }

    @RequestMapping("/past/showAddress/city")
    @ResponseBody
    public ResponseResult<List<AddressOnlyChengShi>> getCityAddressOnlyChengShi(String AREAPARENTID){

        ResponseResult<List<AddressOnlyChengShi>> rr=new ResponseResult<>();
        List<AddressOnlyChengShi> addresslist =addressService.getCityInfo(AREAPARENTID);
        rr.setData(addresslist);
        rr.setMessage("查询成功");


        return  rr;
//county
    }


    @RequestMapping("/past/showAddress/county")
    @ResponseBody
    public ResponseResult<List<AddressOnlyChengShi>> getCountyAddressOnlyChengShi(String county){

        ResponseResult<List<AddressOnlyChengShi>> rr=new ResponseResult<>();
        List<AddressOnlyChengShi> addresslist =addressService.getCountyInfo(county);
        rr.setData(addresslist);
        rr.setMessage("查询成功");


        return  rr;
//county
    }



    /**
     * @deprecated 异步显示学校的方法
     *
     *
     * */
    @RequestMapping("/past/showAddress/school")
    @ResponseBody
    public ResponseResult<List<School>>getAllSchoolInfo(){
        ResponseResult<List<School>> rr=new ResponseResult<>();
        List<School> Schools= addressService.getAllSchool();

        rr.setData(Schools);
        rr.setMessage("查询学校成功");
        rr.setState(1);

        return  rr;
    }




}
