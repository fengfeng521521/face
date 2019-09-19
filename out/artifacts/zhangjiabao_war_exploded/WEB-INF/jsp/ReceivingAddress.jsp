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
    	<div class="u_biao"><span>收货地址</span></div>
        <div class="mm_one">
        	<span>新增收货地址</span>
            电话号码、手机号码选填一项，其余均为必须填项
        </div>
        <table class="mm_two" cellpadding="0" cellspacing="0">
        	<tr>
            	<th>所在地区<i>*</i></th>
                <td>
                	<select><option>所在地区*</option></select>
                    <input type="text" class="txt txt_address" placeholder="请选择省市区" />
                </td>
            </tr>
            <tr>
            	<th>详细地址<i>*</i></th>
                <td><textarea class="txt txt_xx" placeholder="建议您如实填写详细收货地址，例如街道名称，没牌号码，楼层和房间号等信息"></textarea></td>
            </tr>
            <tr>
            	<th>邮政编码</th>
                <td>
                    <input type="text" class="txt" placeholder="如您不清楚，请填写000" />
                </td>
            </tr>
            <tr>
            	<th>收货人姓名<i>*</i></th>
                <td>
                    <input type="text" class="txt" placeholder="长度不超过15字符" />
                </td>
            </tr>
            <tr>
            	<th>手机号码<i>*</i></th>
                <td>
                    <input type="text" class="txt txt_tell" placeholder="电话号码、手机号码必须填一项" />
                </td>
            </tr>
            <tr>
            	<th>电话号码</th>
                <td>
                    <input type="text" class="txt txt_qu" placeholder="区号" />- &nbsp;
                    <input type="text" class="txt txt_hao" placeholder="电话号码" />- &nbsp;
                    <input type="text" class="txt txt_fen" placeholder="分机" />
                </td>
            </tr>
            <tr>
            	<th></th>
                <td><label><input type="checkbox" /> 设置为默认收货地址</label></td>
            </tr>
            <tr>
            	<th></th>
                <td><input type="button" class="btn" value="保存" /></td>
            </tr>
        </table>
        <h1 class="mm_three">送货地址</h1>
        <ul class="mm_four">
        	<li>
            	<h1>陈语晗女士</h1>
                <p>广东省   广州市</p>
                <p>市辖区</p>
                <p>天河区体育中心B栋111室（512000）</p>
                <p>手机: 18825051390</p>
                <p>电话号码: 020-8611100</p>
                <p class="p"><a href="#">修改</a> | <a href="#">删除</a></p>
                <input type="button" class="btn sel" value="设为默认" />
            </li>
            <li>
            	<h1>陈语晗女士</h1>
                <p>广东省   广州市</p>
                <p>市辖区</p>
                <p>天河区体育中心B栋111室（512000）</p>
                <p>手机: 18825051390</p>
                <p>电话号码: 020-8611100</p>
                <p class="p"><a href="#">修改</a> | <a href="#">删除</a></p>
                <input type="button" class="btn" value="设为默认" />
            </li>
            <li>
            	<h1>陈语晗女士</h1>
                <p>广东省   广州市</p>
                <p>市辖区</p>
                <p>天河区体育中心B栋111室（512000）</p>
                <p>手机: 18825051390</p>
                <p>电话号码: 020-8611100</p>
                <p class="p"><a href="#">修改</a> | <a href="#">删除</a></p>
                <input type="button" class="btn" value="设为默认" />
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
