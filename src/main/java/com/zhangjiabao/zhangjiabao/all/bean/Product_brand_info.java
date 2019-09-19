package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Date;
import java.util.Objects;

public class Product_brand_info {

    private Integer brand_id;
    private String brand_name;
    private String telephone;
    private String brand_web;
    private String brand_logo;
    private String brand_desc;
    private Boolean brand_status;
    private Boolean brand_order;
    private Date modified_time;

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getBrand_web() {
        return brand_web;
    }

    public void setBrand_web(String brand_web) {
        this.brand_web = brand_web;
    }

    public String getBrand_logo() {
        return brand_logo;
    }

    public void setBrand_logo(String brand_logo) {
        this.brand_logo = brand_logo;
    }

    public void setModified_time(Date modified_time) {
        this.modified_time = modified_time;
    }

    public String getBrand_desc() {
        return brand_desc;
    }

    public void setBrand_desc(String brand_desc) {
        this.brand_desc = brand_desc;
    }

    public Boolean getBrand_status() {
        return brand_status;
    }

    public void setBrand_status(Boolean brand_status) {
        this.brand_status = brand_status;
    }

    public Boolean getBrand_order() {
        return brand_order;
    }

    public void setBrand_order(Boolean brand_order) {
        this.brand_order = brand_order;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product_brand_info that = (Product_brand_info) o;
        return Objects.equals(brand_id, that.brand_id) &&
                Objects.equals(brand_name, that.brand_name) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(brand_web, that.brand_web) &&
                Objects.equals(brand_logo, that.brand_logo) &&
                Objects.equals(brand_desc, that.brand_desc) &&
                Objects.equals(brand_status, that.brand_status) &&
                Objects.equals(brand_order, that.brand_order) &&
                Objects.equals(modified_time, that.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand_id, brand_name, telephone, brand_web, brand_logo, brand_desc, brand_status, brand_order, modified_time);
    }

    @Override
    public String toString() {
        return "Product_brand_info{" +
                "brand_id=" + brand_id +
                ", brand_name='" + brand_name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", brand_web='" + brand_web + '\'' +
                ", brand_logo='" + brand_logo + '\'' +
                ", brand_desc='" + brand_desc + '\'' +
                ", brand_status=" + brand_status +
                ", brand_order=" + brand_order +
                ", modified_time=" + modified_time +
                '}';
    }
}
