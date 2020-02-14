package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Objects;

public class Product_brand_info {

    private Integer brand_id;
    private String brand_name;

    private String brand_desc;

    private Integer brand_status;
    private String modified_time;

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

    public String getBrand_desc() {
        return brand_desc;
    }

    public void setBrand_desc(String brand_desc) {
        this.brand_desc = brand_desc;
    }

    public Integer getBrand_status() {
        return brand_status;
    }

    public void setBrand_status(Integer brand_status) {
        this.brand_status = brand_status;
    }

    public String getModified_time() {
        return modified_time;
    }

    public void setModified_time(String modified_time) {
        this.modified_time = modified_time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product_brand_info that = (Product_brand_info) o;
        return Objects.equals(brand_id, that.brand_id) &&
                Objects.equals(brand_name, that.brand_name) &&
                Objects.equals(brand_desc, that.brand_desc) &&
                Objects.equals(brand_status, that.brand_status) &&
                Objects.equals(modified_time, that.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand_id, brand_name, brand_desc, brand_status, modified_time);
    }

    @Override
    public String toString() {
        return "Product_brand_info{" +
                "brand_id=" + brand_id +
                ", brand_name='" + brand_name + '\'' +
                ", brand_desc='" + brand_desc + '\'' +
                ", brand_status=" + brand_status +
                ", modified_time='" + modified_time + '\'' +
                '}';
    }
}
