<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link rel="stylesheet" type="text/css" href="../../static/css/css.css"/>
<script type="text/javascript" src="../../static/js/jquery.js"></script>
</head>

<body>
<!--header start-->
<jsp:include page="header.jsp"></jsp:include>
<!--header end-->

<!--main start-->
<div class="gw_one">
	<ul>
    	<li>
        	<em>1</em>
            <span><i>购物车</i><br />Shopping Cart</span>
        </li>
        <li>
        	<em>2</em>
            <span><i>填写核对订单</i><br />Delivery & Payment</span>
        </li>
        <li class="li sel">
        	<em>3</em>
            <span><i>订单支付成功</i><br />Complete Order</span>
        </li>
    </ul>
</div>
<div class="gw_five">
	<img src="../../static/images/img_13.jpg" /><br /><br /><br />
    <a href="#">继续购物</a>
</div>
<!--main end-->

<!--footer start-->
<jsp:include page="footer.jsp"></jsp:include>
<!--footer end-->

</body>
</html>
