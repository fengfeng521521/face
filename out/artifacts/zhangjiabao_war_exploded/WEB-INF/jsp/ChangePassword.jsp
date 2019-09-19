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
        <a href="${pageContext.request.contextPath}/OrderPaymentSuccessful">我的订单</a>
        <a href="${pageContext.request.contextPath}/GoodsPurchased">已购商品</a>
        <a href="${pageContext.request.contextPath}/MyCommission">我的佣金</a>
        <a href="${pageContext.request.contextPath}/MyAfterSales">我的售后</a>
        <a href="${pageContext.request.contextPath}/MyCollection" class="sel">我的收藏</a>
        <a href="${pageContext.request.contextPath}/userInfo">个人信息</a>
        <a href="${pageContext.request.contextPath}/ReceivingAddress">收货地址</a>
        <a href="${pageContext.request.contextPath}/ChangePassword">修改密码</a>
    </div>
    <div class="user_main">
    	<div class="u_biao"><span>修改密码</span></div>
        <table class="tb_one tb_four">
            <tr>
            	<th>*当前密码：</th>
            	<td><input type="password" class="txt txt_pwd" /></td>
            </tr>
            <tr>
            	<th>*新密码：</th>
            	<td><input type="password" class="txt txt_pwd" /></td>
            </tr>
            <tr>
            	<th>*确认密码：</th>
            	<td><input type="password" class="txt txt_pwd" /></td>
            </tr>
            <tr>
            	<th>*手机验证码：</th>
            	<td><input type="text" class="txt txt_yzm" /></td>
            </tr>
            <tr>
            	<th></th>
                <td><input type="button" class="btn_hui" value="确认修改" /></td>
            </tr>
        </table>
    </div>
</div>
<!--main end-->

<!--footer start-->
<jsp:include page="footer.jsp"></jsp:include>
<!--footer end-->

</body>
</html>
