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
                <c:if test="${customer!=null }"><a href="${pageContext.request.contextPath}/past/exit">退出!</a></c:if>
            </div>
        </div>

    </div>
    <div class="main">
        <div class="logo"><a href="/showAllProductInfo"><img src="../../static/images/logo.jpg" /></a></div>
        <div class="search">
            <div class="left">
                <a href="#">超值</a>|<a href="#">九成新</a>|<a href="#">老板打折</a>|<a href="#">购买抽奖</a>|<a href="#">自行车</a>
            </div>
            <input type="text" class="txt" placeholder="搜索你需要的商品" />
            <input type="button" class="btn" />
        </div>
    </div>
    <div class="nav">
        <a href="#" class="all">全部分类</a>
        <a href="#">IT 用品</a>
        <a href="#">日常用品</a>
        <a href="#">出行用品</a>
        <a href="#">生活常备</a>
        <a href="#">新品上市</a>
        <a href="#">其他</a>
    </div>
</div>
<!--header end-->
