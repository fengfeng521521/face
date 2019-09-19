package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Date;
import java.util.Objects;

public class Product_comment {

    private Integer comment_id;
    private Integer product_id;
    private Long order_id;
    private Integer customer_id;
    private String title;
    private String content;
    private Integer audit_status;
    private Date audit_time;
    private Date modified_time;

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Date getAudit_time() {
        return audit_time;
    }

    public void setAudit_time(Date audit_time) {
        this.audit_time = audit_time;
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
        Product_comment that = (Product_comment) o;
        return Objects.equals(comment_id, that.comment_id) &&
                Objects.equals(product_id, that.product_id) &&
                Objects.equals(order_id, that.order_id) &&
                Objects.equals(customer_id, that.customer_id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(content, that.content) &&
                Objects.equals(audit_status, that.audit_status) &&
                Objects.equals(audit_time, that.audit_time) &&
                Objects.equals(modified_time, that.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment_id, product_id, order_id, customer_id, title, content, audit_status, audit_time, modified_time);
    }

    @Override
    public String toString() {
        return "Product_comment{" +
                "comment_id=" + comment_id +
                ", product_id=" + product_id +
                ", order_id=" + order_id +
                ", customer_id=" + customer_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", audit_status=" + audit_status +
                ", audit_time=" + audit_time +
                ", modified_time=" + modified_time +
                '}';
    }
}
