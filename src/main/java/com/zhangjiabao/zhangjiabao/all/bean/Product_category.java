package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Objects;

public class Product_category {
    private Integer category_id;
    private String category_name;
    private String modified_time;

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
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
        Product_category that = (Product_category) o;
        return Objects.equals(category_id, that.category_id) &&
                Objects.equals(category_name, that.category_name) &&
                Objects.equals(modified_time, that.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category_id, category_name, modified_time);
    }

    @Override
    public String toString() {
        return "Product_category{" +
                "category_id=" + category_id +
                ", category_name='" + category_name + '\'' +
                ", modified_time='" + modified_time + '\'' +
                '}';
    }
}
