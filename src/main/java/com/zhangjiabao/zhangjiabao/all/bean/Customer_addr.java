package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Date;
import java.util.Objects;

public class Customer_addr {
    private Integer customer_addr_id;
    //customer_login表的自增ID
    private Integer customer_id;
    //邮编
    private Integer zip;
    //省市id
    private Integer province;
    //城市id
    private Integer city;
    //区域id
    private Integer district;
    //详细地址
    private String address;
    //是否默认
    private Integer is_default;
    //修改时间
    private Date modified_time;


    public Integer getCustomer_addr_id() {
        return customer_addr_id;
    }

    public void setCustomer_addr_id(Integer customer_addr_id) {
        this.customer_addr_id = customer_addr_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIs_default() {
        return is_default;
    }

    public void setIs_default(Integer is_default) {
        this.is_default = is_default;
    }

    public Date getModified_time() {
        return modified_time;
    }

    public void setModified_time(Date modified_time) {
        this.modified_time = modified_time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer_addr that = (Customer_addr) o;
        return Objects.equals(customer_addr_id, that.customer_addr_id) &&
                Objects.equals(customer_id, that.customer_id) &&
                Objects.equals(zip, that.zip) &&
                Objects.equals(province, that.province) &&
                Objects.equals(city, that.city) &&
                Objects.equals(district, that.district) &&
                Objects.equals(address, that.address) &&
                Objects.equals(is_default, that.is_default) &&
                Objects.equals(modified_time, that.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer_addr_id, customer_id, zip, province, city, district, address, is_default, modified_time);
    }

    @Override
    public String toString() {
        return "Customer_addr{" +
                "customer_addr_id=" + customer_addr_id +
                ", customer_id=" + customer_id +
                ", zip=" + zip +
                ", province=" + province +
                ", city=" + city +
                ", district=" + district +
                ", address='" + address + '\'' +
                ", is_default=" + is_default +
                ", modified_time=" + modified_time +
                '}';
    }
}
