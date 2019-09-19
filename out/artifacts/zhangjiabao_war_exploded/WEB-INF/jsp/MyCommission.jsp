<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link rel="stylesheet" type="text/css" href="../../static/css/css.css"/>
<script type="text/javascript" src="../../static/js/jQuery.js"></script>
</head>

<body class="bg_hui">
<!--header start-->
<jsp:include page="header.jsp"></jsp:include>
<!--header end-->

<!--main start-->
<div class="main">
	<div class="menu">
    	<h1>订单中心</h1>
        <a href="${pageContext.request.contextPath }/OrderPaymentSuccessful">我的订单</a>
        <a href="${pageContext.request.contextPath }/GoodsPurchased">已购商品</a>
        <a href="${pageContext.request.contextPath }/MyCommission">我的佣金</a>
        <a href="${pageContext.request.contextPath }/MyAfterSales">我的售后</a>
        <a href="${pageContext.request.contextPath }/MyCollection" class="sel">我的收藏</a>
        <a href="${pageContext.request.contextPath }/userInfo">个人信息</a>
        <a href="${pageContext.request.contextPath }/ReceivingAddress">收货地址</a>
        <a href="${pageContext.request.contextPath }/ChangePassword">修改密码</a>
    </div>
    <div class="user_main">
    	<div class="u_biao"><span>我的佣金</span></div>
        <ul class="u_six">
        	<li>
            	<span class="left">佣金金额（元）:<i>272.00</i></span>
                <input type="button" class="btn" value="提现" />
            </li>
        </ul>
    </div>
</div>
<!--main end-->

<!--footer start-->
<jsp:include page="footer.jsp"></jsp:include>
<!--footer end-->

</body>
</html>
