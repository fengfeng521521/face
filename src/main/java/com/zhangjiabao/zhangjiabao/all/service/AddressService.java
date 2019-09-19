package com.zhangjiabao.zhangjiabao.all.service;

import com.zhangjiabao.zhangjiabao.all.bean.AddressOnlyChengShi;
import com.zhangjiabao.zhangjiabao.all.bean.School;
import com.zhangjiabao.zhangjiabao.all.mapper.AddressChengShiMapperAPI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressService implements AddressServiceAPI{

    @Resource
    AddressChengShiMapperAPI addressChengShiMapperAPI;



    @Override
    public List<AddressOnlyChengShi> getProvinceInfo( ) {
        return   addressChengShiMapperAPI.selectAllProvince();

    }

    @Override
    public List<AddressOnlyChengShi> getCityInfo(String provinceCode) {
        return addressChengShiMapperAPI.selectAllCityByProvinceCode(provinceCode);
    }
    @Override

    public List<AddressOnlyChengShi> getCountyInfo(String cityCode) {
        return addressChengShiMapperAPI.selectAllCountyByCityCode(cityCode);
    }

    @Override
    public List<School> getAllSchool() {
        return addressChengShiMapperAPI.selectAllSchool();
    }
}
