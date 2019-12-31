package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Objects;

public class OneMenu {
    private String supplier_name;//供应商名字
    private String pic_url;//商品图片
    private String product_name;//商品名字
    private String pic_desc;//商品描述

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getPic_desc() {
        return pic_desc;
    }

    public void setPic_desc(String pic_desc) {
        this.pic_desc = pic_desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OneMenu oneMenu = (OneMenu) o;
        return Objects.equals(supplier_name, oneMenu.supplier_name) &&
                Objects.equals(pic_url, oneMenu.pic_url) &&
                Objects.equals(product_name, oneMenu.product_name) &&
                Objects.equals(pic_desc, oneMenu.pic_desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplier_name, pic_url, product_name, pic_desc);
    }

    @Override
    public String toString() {
        return "OneMenu{" +
                "supplier_name='" + supplier_name + '\'' +
                ", pic_url='" + pic_url + '\'' +
                ", product_name='" + product_name + '\'' +
                ", pic_desc='" + pic_desc + '\'' +
                '}';
    }
}
