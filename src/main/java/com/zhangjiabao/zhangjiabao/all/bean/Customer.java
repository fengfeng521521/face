package com.zhangjiabao.zhangjiabao.all.bean;


import java.util.Date;
import java.util.Objects;

//用户登录实体类
public class Customer {
private Integer CustomerId;
private String LoginName;
private String PassWord;
private Integer UserStats;
private Date ModifiedTime;
private Integer UserStyle;


    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer customerId) {
        CustomerId = customerId;
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public Integer getUserStats() {
        return UserStats;
    }

    public void setUserStats(Integer userStats) {
        UserStats = userStats;
    }

    public Date getModifiedTime() {
        return ModifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        ModifiedTime = modifiedTime;
    }

    public Integer getUserStyle() {
        return UserStyle;
    }

    public void setUserStyle(Integer userStyle) {
        UserStyle = userStyle;
    }

    public Customer() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(CustomerId, customer.CustomerId) &&
                Objects.equals(LoginName, customer.LoginName) &&
                Objects.equals(PassWord, customer.PassWord) &&
                Objects.equals(UserStats, customer.UserStats) &&
                Objects.equals(ModifiedTime, customer.ModifiedTime) &&
                Objects.equals(UserStyle, customer.UserStyle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CustomerId, LoginName, PassWord, UserStats, ModifiedTime, UserStyle);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerId=" + CustomerId +
                ", LoginName='" + LoginName + '\'' +
                ", PassWord='" + PassWord + '\'' +
                ", UserStats=" + UserStats +
                ", ModifiedTime=" + ModifiedTime +
                ", UserStyle=" + UserStyle +
                '}';
    }
}
