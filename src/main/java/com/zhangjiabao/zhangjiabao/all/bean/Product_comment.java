package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Objects;

public class Product_comment {
     private Integer comment_id;
    private Integer order_id;
    private Integer product_id;
    private Integer customer_id;
    private String content;
    private Integer audit_status;
    private String time;


    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAudit_status() {
        return audit_status;
    }

    public void setAudit_status(Integer audit_status) {
        this.audit_status = audit_status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product_comment that = (Product_comment) o;
        return Objects.equals(comment_id, that.comment_id) &&
                Objects.equals(order_id, that.order_id) &&
                Objects.equals(product_id, that.product_id) &&
                Objects.equals(customer_id, that.customer_id) &&
                Objects.equals(content, that.content) &&
                Objects.equals(audit_status, that.audit_status) &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment_id, order_id, product_id, customer_id, content, audit_status, time);
    }

    @Override
    public String toString() {
        return "Product_comment{" +
                "comment_id=" + comment_id +
                ", order_id=" + order_id +
                ", product_id=" + product_id +
                ", customer_id=" + customer_id +
                ", content='" + content + '\'' +
                ", audit_status=" + audit_status +
                ", time='" + time + '\'' +
                '}';
    }
}
