package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Date;
import java.util.Objects;

public class Product_category {
    private Integer category_id;
    private String category_name;
    private String category_code;
    private Integer parent_id;
    private Boolean category_level;
    private Boolean category_status;
    private Date modified_time;

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

    public String getCategory_code() {
        return category_code;
    }

    public void setCategory_code(String category_code) {
        this.category_code = category_code;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Boolean getCategory_level() {
        return category_level;
    }

    public void setCategory_level(Boolean category_level) {
        this.category_level = category_level;
    }

    public Boolean getCategory_status() {
        return category_status;
    }

    public void setCategory_status(Boolean category_status) {
        this.category_status = category_status;
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
        Product_category that = (Product_category) o;
        return Objects.equals(category_id, that.category_id) &&
                Objects.equals(category_name, that.category_name) &&
                Objects.equals(category_code, that.category_code) &&
                Objects.equals(parent_id, that.parent_id) &&
                Objects.equals(category_level, that.category_level) &&
                Objects.equals(category_status, that.category_status) &&
                Objects.equals(modified_time, that.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category_id, category_name, category_code, parent_id, category_level, category_status, modified_time);
    }

    @Override
    public String toString() {
        return "Product_category{" +
                "category_id=" + category_id +
                ", category_name='" + category_name + '\'' +
                ", category_code='" + category_code + '\'' +
                ", parent_id=" + parent_id +
                ", category_level=" + category_level +
                ", category_status=" + category_status +
                ", modified_time=" + modified_time +
                '}';
    }
}
