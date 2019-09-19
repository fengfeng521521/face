package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Date;
import java.util.Objects;

public class Product_pic_info {
    private Integer product_pic_id;
    private Integer product_id;
    private String pic_desc;
    private String pic_url;
    private Boolean is_master;
    private Boolean pic_order;
    private Boolean pic_status;
    private Date modified_time;

    public Integer getProduct_pic_id() {
        return product_pic_id;
    }

    public void setProduct_pic_id(Integer product_pic_id) {
        this.product_pic_id = product_pic_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getPic_desc() {
        return pic_desc;
    }

    public void setPic_desc(String pic_desc) {
        this.pic_desc = pic_desc;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public Boolean getIs_master() {
        return is_master;
    }

    public void setIs_master(Boolean is_master) {
        this.is_master = is_master;
    }

    public Boolean getPic_order() {
        return pic_order;
    }

    public void setPic_order(Boolean pic_order) {
        this.pic_order = pic_order;
    }

    public Boolean getPic_status() {
        return pic_status;
    }

    public void setPic_status(Boolean pic_status) {
        this.pic_status = pic_status;
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
        Product_pic_info that = (Product_pic_info) o;
        return Objects.equals(product_pic_id, that.product_pic_id) &&
                Objects.equals(product_id, that.product_id) &&
                Objects.equals(pic_desc, that.pic_desc) &&
                Objects.equals(pic_url, that.pic_url) &&
                Objects.equals(is_master, that.is_master) &&
                Objects.equals(pic_order, that.pic_order) &&
                Objects.equals(pic_status, that.pic_status) &&
                Objects.equals(modified_time, that.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_pic_id, product_id, pic_desc, pic_url, is_master, pic_order, pic_status, modified_time);
    }

    @Override
    public String toString() {
        return "Product_pic_info{" +
                "product_pic_id=" + product_pic_id +
                ", product_id=" + product_id +
                ", pic_desc='" + pic_desc + '\'' +
                ", pic_url='" + pic_url + '\'' +
                ", is_master=" + is_master +
                ", pic_order=" + pic_order +
                ", pic_status=" + pic_status +
                ", modified_time=" + modified_time +
                '}';
    }
}
