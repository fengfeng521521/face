package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Objects;

public class Product_info {
    private Integer product_id;
    private String product_name;
    private Integer brand_id;
    private Integer category_id;
    private Integer supplier_id;
    private String picurl;
    private Double price;
    private Integer state;
    private String descript;
    private String modified_time;


    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
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
        Product_info that = (Product_info) o;
        return Objects.equals(product_id, that.product_id) &&
                Objects.equals(product_name, that.product_name) &&
                Objects.equals(brand_id, that.brand_id) &&
                Objects.equals(category_id, that.category_id) &&
                Objects.equals(supplier_id, that.supplier_id) &&
                Objects.equals(picurl, that.picurl) &&
                Objects.equals(price, that.price) &&
                Objects.equals(state, that.state) &&
                Objects.equals(descript, that.descript) &&
                Objects.equals(modified_time, that.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_id, product_name, brand_id, category_id, supplier_id, picurl, price, state, descript, modified_time);
    }
}
