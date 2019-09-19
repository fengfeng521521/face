package com.zhangjiabao.zhangjiabao.all.bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class CustomerInfo {
    //自增主键ID
    private Integer customer_inf_id;
    //customer_login表的自增ID
    private Integer customer_id;
    //学校名称
    private String school_name;
    //用户真实姓名
    private String customer_name;
    //证件类型：1 身份证，2 学生证
    private Integer identity_card_type;
    //证件号码
    private String identity_card_no;
    //手机号
    private Integer mobile_phone;
    //邮箱
    private String customer_email;
    //性别
    private String gender;
    //用户积分
    private Integer user_point;
    //注册时间
    private Date register_time;
    //微信号
    private String weixin;
    //会员级别：1 普通会员，2 青铜，3白银，4黄金，5钻石
    private Integer customer_level;
    //用户余额
    private BigDecimal user_money;
    //最后修改时间
    private Date modified_time;

    public Integer getCustomer_inf_id() {
        return customer_inf_id;
    }

    public void setCustomer_inf_id(Integer customer_inf_id) {
        this.customer_inf_id = customer_inf_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Integer getIdentity_card_type() {
        return identity_card_type;
    }

    public void setIdentity_card_type(Integer identity_card_type) {
        this.identity_card_type = identity_card_type;
    }

    public String getIdentity_card_no() {
        return identity_card_no;
    }

    public void setIdentity_card_no(String identity_card_no) {
        this.identity_card_no = identity_card_no;
    }

    public Integer getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(Integer mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getUser_point() {
        return user_point;
    }

    public void setUser_point(Integer user_point) {
        this.user_point = user_point;
    }

    public Date getRegister_time() {
        return register_time;
    }

    public void setRegister_time(Date register_time) {
        this.register_time = register_time;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public Integer getCustomer_level() {
        return customer_level;
    }

    public void setCustomer_level(Integer customer_level) {
        this.customer_level = customer_level;
    }

    public BigDecimal getUser_money() {
        return user_money;
    }

    public void setUser_money(BigDecimal user_money) {
        this.user_money = user_money;
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
        CustomerInfo that = (CustomerInfo) o;
        return Objects.equals(customer_inf_id, that.customer_inf_id) &&
                Objects.equals(customer_id, that.customer_id) &&
                Objects.equals(school_name, that.school_name) &&
                Objects.equals(customer_name, that.customer_name) &&
                Objects.equals(identity_card_type, that.identity_card_type) &&
                Objects.equals(identity_card_no, that.identity_card_no) &&
                Objects.equals(mobile_phone, that.mobile_phone) &&
                Objects.equals(customer_email, that.customer_email) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(user_point, that.user_point) &&
                Objects.equals(register_time, that.register_time) &&
                Objects.equals(weixin, that.weixin) &&
                Objects.equals(customer_level, that.customer_level) &&
                Objects.equals(user_money, that.user_money) &&
                Objects.equals(modified_time, that.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer_inf_id, customer_id, school_name, customer_name, identity_card_type, identity_card_no, mobile_phone, customer_email, gender, user_point, register_time, weixin, customer_level, user_money, modified_time);
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "customer_inf_id=" + customer_inf_id +
                ", customer_id=" + customer_id +
                ", school_name='" + school_name + '\'' +
                ", customer_name='" + customer_name + '\'' +
                ", identity_card_type=" + identity_card_type +
                ", identity_card_no='" + identity_card_no + '\'' +
                ", mobile_phone=" + mobile_phone +
                ", customer_email='" + customer_email + '\'' +
                ", gender='" + gender + '\'' +
                ", user_point=" + user_point +
                ", register_time=" + register_time +
                ", weixin='" + weixin + '\'' +
                ", customer_level=" + customer_level +
                ", user_money=" + user_money +
                ", modified_time=" + modified_time +
                '}';
    }
}
