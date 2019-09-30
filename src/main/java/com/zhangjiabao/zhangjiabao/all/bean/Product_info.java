package com.zhangjiabao.zhangjiabao.all.bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Product_info {
    private Integer product_id;
    private String product_core;
    private String product_name;
    private String bar_code;

    private Integer brand_id;
    private Integer one_category_id;
    private Integer two_category_id;
    private Integer three_category_id;
    private Integer supplier_id;

    private BigDecimal price;


    private BigDecimal average_cost;
    private Boolean publish_status;
    private Boolean audit_status;

    private Double weight;
    private Double length;
    private Double height;
    private Double width;
    //color_type
    private String color_type;
    private Date production_date;
    private Integer shelf_life;
    private String descript;
    private Date indate;
    private Date modified_time;

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_core() {
        return product_core;
    }

    public void setProduct_core(String product_core) {
        this.product_core = product_core;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public Integer getOne_category_id() {
        return one_category_id;
    }

    public void setOne_category_id(Integer one_category_id) {
        this.one_category_id = one_category_id;
    }

    public Integer getTwo_category_id() {
        return two_category_id;
    }

    public void setTwo_category_id(Integer two_category_id) {
        this.two_category_id = two_category_id;
    }

    public Integer getThree_category_id() {
        return three_category_id;
    }

    public void setThree_category_id(Integer three_category_id) {
        this.three_category_id = three_category_id;
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAverage_cost() {
        return average_cost;
    }

    public void setAverage_cost(BigDecimal average_cost) {
        this.average_cost = average_cost;
    }

    public Boolean getPublish_status() {
        return publish_status;
    }

    public void setPublish_status(Boolean publish_status) {
        this.publish_status = publish_status;
    }

    public Boolean getAudit_status() {
        return audit_status;
    }

    public void setAudit_status(Boolean audit_status) {
        this.audit_status = audit_status;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public String getColor_type() {
        return color_type;
    }

    public void setColor_type(String color_type) {
        this.color_type = color_type;
    }

    public Date getProduction_date() {
        return production_date;
    }

    public void setProduction_date(Date production_date) {
        this.production_date = production_date;
    }

    public Integer getShelf_life() {
        return shelf_life;
    }

    public void setShelf_life(Integer shelf_life) {
        this.shelf_life = shelf_life;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
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
        Product_info that = (Product_info) o;
        return Objects.equals(product_id, that.product_id) &&
                Objects.equals(product_core, that.product_core) &&
                Objects.equals(product_name, that.product_name) &&
                Objects.equals(bar_code, that.bar_code) &&
                Objects.equals(brand_id, that.brand_id) &&
                Objects.equals(one_category_id, that.one_category_id) &&
                Objects.equals(two_category_id, that.two_category_id) &&
                Objects.equals(three_category_id, that.three_category_id) &&
                Objects.equals(supplier_id, that.supplier_id) &&
                Objects.equals(price, that.price) &&
                Objects.equals(average_cost, that.average_cost) &&
                Objects.equals(publish_status, that.publish_status) &&
                Objects.equals(audit_status, that.audit_status) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(length, that.length) &&
                Objects.equals(height, that.height) &&
                Objects.equals(width, that.width) &&
                Objects.equals(color_type, that.color_type) &&
                Objects.equals(production_date, that.production_date) &&
                Objects.equals(shelf_life, that.shelf_life) &&
                Objects.equals(descript, that.descript) &&
                Objects.equals(indate, that.indate) &&
                Objects.equals(modified_time, that.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_id, product_core, product_name, bar_code, brand_id, one_category_id, two_category_id, three_category_id, supplier_id, price, average_cost, publish_status, audit_status, weight, length, height, width, color_type, production_date, shelf_life, descript, indate, modified_time);
    }

    @Override
    public String toString() {
        return "Product_info{" +
                "product_id=" + product_id +
                ", product_core='" + product_core + '\'' +
                ", product_name='" + product_name + '\'' +
                ", bar_code='" + bar_code + '\'' +
                ", brand_id=" + brand_id +
                ", one_category_id=" + one_category_id +
                ", two_category_id=" + two_category_id +
                ", three_category_id=" + three_category_id +
                ", supplier_id=" + supplier_id +
                ", price=" + price +
                ", average_cost=" + average_cost +
                ", publish_status=" + publish_status +
                ", audit_status=" + audit_status +
                ", weight=" + weight +
                ", length=" + length +
                ", height=" + height +
                ", width=" + width +
                ", color_type=" + color_type +
                ", production_date=" + production_date +
                ", shelf_life=" + shelf_life +
                ", descript='" + descript + '\'' +
                ", indate=" + indate +
                ", modified_time=" + modified_time +
                '}';
    }
}
