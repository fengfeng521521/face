package com.zhangjiabao.zhangjiabao.all.mapper;

import com.zhangjiabao.zhangjiabao.all.bean.AddressOnlyChengShi;
import com.zhangjiabao.zhangjiabao.all.bean.School;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
*
 *
 * @deprecated 用于个人信息的地址3级联动
 *
 *
* */

@Mapper
public interface AddressChengShiMapperAPI {

    public List<AddressOnlyChengShi> selectAllProvince();
    public List<AddressOnlyChengShi> selectAllCityByProvinceCode(String provinceCode );
    public List<AddressOnlyChengShi> selectAllCountyByCityCode(String cityCode);

    public List<School>selectAllSchool();










}
