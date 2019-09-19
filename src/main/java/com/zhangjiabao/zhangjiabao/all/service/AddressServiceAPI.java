package com.zhangjiabao.zhangjiabao.all.service;

import com.zhangjiabao.zhangjiabao.all.bean.AddressOnlyChengShi;
import com.zhangjiabao.zhangjiabao.all.bean.School;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressServiceAPI {
    //根据业务无通过任何东西即可获取省得到省信息
    public List<AddressOnlyChengShi> getProvinceInfo();
    //通过省 provinceCode 得到市信息
    public List<AddressOnlyChengShi> getCityInfo(String provinceCode);
    //通过cityId 城市id得到县信息
    public List<AddressOnlyChengShi> getCountyInfo(String cityCode);
    //无条件显示学校信息
    public List<School>getAllSchool();

}
