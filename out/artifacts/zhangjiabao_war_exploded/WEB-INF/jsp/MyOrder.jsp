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
    	<div class="u_biao"><span>我的订单</span></div>
        <ul class="u_one">
        	<li>待付款 <i>（0）</i></li>
            <li>待发货 <i>（0）</i></li>
            <li>待收货 <i>（0）</i></li>
            <li>退款 <i>（0）</i></li>
        </ul>
        <div class="u_two">
        	<input type="text" class="txt" placeholder="输入商品订单号进行搜索" />
            <input type="button" class="btn" value="查询" />
        </div>
        <table class="tb_two" cellpadding="0" cellspacing="0">
        	<tr class="tr">
            	<th width="123" class="th_ll">订单号</th>
                <th width="137">商品图片</th>
                <th width="229">商品名称</th>
                <th width="134">购买时间</th>
                <th width="102">购买数量</th>
                <th width="93">商品价格</th>
                <th width="110" class="th_rr">操作</th>
			</tr>
            <tr>
            	<td>020882200</td>
                <td><div class="img"><img src="../../static/images/004.jpg" /></div></td>
                <td>cometiques 纯色奢金唇膏 属于精致的你</td>
                <td>2016-12-1</td>
                <td>1</td>
                <td>¥ 480</td>
                <td>物流运输中<br /><a href="#" class="a">查看物流</a></td>
            </tr>
            <tr>
            	<td>020882200</td>
                <td><div class="img"><img src="../../static/images/004.jpg" /></div></td>
                <td>cometiques 纯色奢金唇膏 属于精致的你</td>
                <td>2016-12-1</td>
                <td>1</td>
                <td>¥ 480</td>
                <td>物流运输中<br /><a href="#" class="a">查看物流</a></td>
            </tr>
            <tr>
            	<td>020882200</td>
                <td><div class="img"><img src="../../static/images/004.jpg" /></div></td>
                <td>cometiques 纯色奢金唇膏 属于精致的你</td>
                <td>2016-12-1</td>
                <td>1</td>
                <td>¥ 480</td>
                <td>物流运输中<br /><a href="#" class="a">查看物流</a></td>
            </tr>
            <tr>
            	<td>020882200</td>
                <td><div class="img"><img src="../../static/images/004.jpg" /></div></td>
                <td>cometiques 纯色奢金唇膏 属于精致的你</td>
                <td>2016-12-1</td>
                <td>1</td>
                <td>¥ 480</td>
                <td>物流运输中<br /><a href="#" class="a">查看物流</a></td>
            </tr>
            <tr>
            	<td>020882200</td>
                <td><div class="img"><img src="../../static/images/004.jpg" /></div></td>
                <td>cometiques 纯色奢金唇膏 属于精致的你</td>
                <td>2016-12-1</td>
                <td>1</td>
                <td>¥ 480</td>
                <td>物流运输中<br /><a href="#" class="a">查看物流</a></td>
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
