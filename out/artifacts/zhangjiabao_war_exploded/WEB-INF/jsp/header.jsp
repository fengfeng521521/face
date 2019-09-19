<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/8/12
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%><%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!--header start-->
<div class="header">
    <div class="header_top">
        <div class="main">
            <div class="left">欢迎光临安阳学院跳蚤市场官网！<span>您的昵称:${customer.loginName}</span>
                <c:if test="${customer==null}">

                <span> top: ${topMeg}</span> &nbsp; <a href="${pageContext.request.contextPath }/UserRegistration">注册</a>|<a href="${pageContext.request.contextPath }/SignIn">登录</a>
                    </c:if>  </div>
            <div class="right">
                <a href="${pageContext.request.contextPath }/ShoppingCart" class="agwc">购物车</a>|<a href="${pageContext.request.contextPath }/MyCollection" class="azh">我的账户</a>
                <c:if test="${customer!=null }"><a href="${pageContext.request.contextPath}/exit">退出!</a></c:if>
            </div>
        </div>

    </div>
    <div class="main">
        <div class="logo"><a href="#"><img src="../../static/images/logo.jpg" /></a></div>
        <div class="search">
            <div class="left">
                <a href="#">防晒</a>|<a href="#">兰蔻</a>|<a href="#">雅思兰黛</a>|<a href="#">兰芝</a>|<a href="#">眼霜</a>
            </div>
            <input type="text" class="txt" placeholder="搜索你需要的商品" />
            <input type="button" class="btn" />
        </div>
    </div>
    <div class="nav">
        <a href="#" class="all">全部分类</a>
        <a href="#">面部护肤</a>
        <a href="#">彩妆香水</a>
        <a href="#">限时特卖</a>
        <a href="#">贵宾专享</a>
        <a href="#">新品上市</a>
        <a href="#">清仓特卖</a>
    </div>
</div>
<!--header end-->
