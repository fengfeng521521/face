package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Objects;

public class Product_info_supp {
    /**
     *
     * 这个是商家与商品的关联表
     *
     *
     * */
    private Integer infosupid;
    private Integer supplier_id;
    private Integer product_id;
    private Integer stock_sum;
    private String modified_time;

    public Integer getInfosupid() {
        return infosupid;
    }

    public void setInfosupid(Integer infosupid) {
        this.infosupid = infosupid;
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getStock_sum() {
        return stock_sum;
    }

    public void setStock_sum(Integer stock_sum) {
        this.stock_sum = stock_sum;
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
        Product_info_supp that = (Product_info_supp) o;
        return Objects.equals(infosupid, that.infosupid) &&
                Objects.equals(supplier_id, that.supplier_id) &&
                Objects.equals(product_id, that.product_id) &&
                Objects.equals(stock_sum, that.stock_sum) &&
                Objects.equals(modified_time, that.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infosupid, supplier_id, product_id, stock_sum, modified_time);
    }
}
