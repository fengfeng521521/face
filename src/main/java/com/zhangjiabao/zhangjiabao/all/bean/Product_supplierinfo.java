package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Date;
import java.util.Objects;

public class Product_supplierinfo {

    private Integer supplier_id;
    private Integer infosupid;
    private String supplier_code;
    private String supplier_name;
    private String supplier_type;
    private String link_man;
    private String phone_number;
    private String bank_name;
    private String bank_account;
    private String address;
    private Boolean supplier_status;
    private Date modified_time;

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSupplier_code() {
        return supplier_code;
    }

    public void setSupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getSupplier_type() {
        return supplier_type;
    }

    public void setSupplier_type(String supplier_type) {
        this.supplier_type = supplier_type;
    }

    public String getLink_man() {
        return link_man;
    }

    public void setLink_man(String link_man) {
        this.link_man = link_man;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_account() {
        return bank_account;
    }

    public void setBank_account(String bank_account) {
        this.bank_account = bank_account;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getSupplier_status() {
        return supplier_status;
    }

    public void setSupplier_status(Boolean supplier_status) {
        this.supplier_status = supplier_status;
    }

    public Date getModified_time() {
        return modified_time;
    }

    public void setModified_time(Date modified_time) {
        this.modified_time = modified_time;
    }

    public Integer getInfosupid() {
        return infosupid;
    }

    public void setInfosupid(Integer infosupid) {
        this.infosupid = infosupid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product_supplierinfo that = (Product_supplierinfo) o;
        return Objects.equals(supplier_id, that.supplier_id) &&
                Objects.equals(infosupid, that.infosupid) &&
                Objects.equals(supplier_code, that.supplier_code) &&
                Objects.equals(supplier_name, that.supplier_name) &&
                Objects.equals(supplier_type, that.supplier_type) &&
                Objects.equals(link_man, that.link_man) &&
                Objects.equals(phone_number, that.phone_number) &&
                Objects.equals(bank_name, that.bank_name) &&
                Objects.equals(bank_account, that.bank_account) &&
                Objects.equals(address, that.address) &&
                Objects.equals(supplier_status, that.supplier_status) &&
                Objects.equals(modified_time, that.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplier_id, infosupid, supplier_code, supplier_name, supplier_type, link_man, phone_number, bank_name, bank_account, address, supplier_status, modified_time);
    }

    @Override
    public String toString() {
        return "Product_supplierinfo{" +
                "supplier_id=" + supplier_id +
                ", infosupid=" + infosupid +
                ", supplier_code='" + supplier_code + '\'' +
                ", supplier_name='" + supplier_name + '\'' +
                ", supplier_type='" + supplier_type + '\'' +
                ", link_man='" + link_man + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", bank_name='" + bank_name + '\'' +
                ", bank_account='" + bank_account + '\'' +
                ", address='" + address + '\'' +
                ", supplier_status=" + supplier_status +
                ", modified_time=" + modified_time +
                '}';
    }
}
