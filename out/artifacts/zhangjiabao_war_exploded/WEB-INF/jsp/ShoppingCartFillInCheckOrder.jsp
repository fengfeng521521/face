<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link rel="stylesheet" type="text/css" href="../../static/css/css.css"/>
<script type="text/javascript" src="../../static/js/jQuery.js"></script>
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
        <li class="sel">
        	<em>2</em>
            <span><i>填写核对订单</i><br />Delivery & Payment</span>
        </li>
        <li class="li">
        	<em>3</em>
            <span><i>订单支付成功</i><br />Complete Order</span>
        </li>
    </ul>
</div>
<div class="main">
	<div class="gw_two">送货地址</div>
    <ul class="gw_six">
    	<li>
        	<label>
        	<div class="top">
            	<span>陈语晗女士</span>
                <input type="checkbox" class="ck" />
            </div>
            <div class="bottom">
            	<p>广东省   广州市</p>
                <p>市辖区</p>
                <p>天河区体育中心B栋111室（512000）</p>
                <p>手机: 18825051390</p>
                <p>电话号码: 020-8611100</p>
            </div>
            </label>
        </li>
        <li>
        	<label>
        	<div class="top">
            	<span>陈语晗女士</span>
                <input type="checkbox" class="ck" />
            </div>
            <div class="bottom">
            	<p>广东省   广州市</p>
                <p>市辖区</p>
                <p>天河区体育中心B栋111室（512000）</p>
                <p>手机: 18825051390</p>
                <p>电话号码: 020-8611100</p>
            </div>
            </label>
        </li>
        <li>
        	<label>
        	<div class="top">
            	<span>陈语晗女士</span>
                <input type="checkbox" class="ck" />
            </div>
            <div class="bottom">
            	<p>广东省   广州市</p>
                <p>市辖区</p>
                <p>天河区体育中心B栋111室（512000）</p>
                <p>手机: 18825051390</p>
                <p>电话号码: 020-8611100</p>
            </div>
            </label>
        </li>
    </ul>
    <input type="button" class="gw_btn" value="+添加新地址" />
    <div class="gw_two">商品信息</div>
  	<table class="gw_three" cellpadding="0" cellspacing="0">
    	<tr>
        	<th width="147" height="53">订单号</th>
            <th width="542">商品名称</th>
            <th width="116">数量</th>
            <th width="223">小计</th>
            <th width="150">操作</th>
        </tr>
        <tr>
        	<td class="cz">020882200</td>
            <td>
            	<a href="3" class="img"><img src="../../static/images/004.jpg" /></a>
                <div class="left">
                	<a href="#">COMETIQUES 纯色奢金唇膏 属于精致的你</a><br />
                    颜色 : 浅棕色
                </div>
            </td>
            <td class="cz">1</td>
            <td class="price">¥ 480</td>
            <td class="cz">2016-12-1</td>
        </tr>
        <tr>
        	<td class="cz">020882200</td>
            <td>
            	<a href="3" class="img"><img src="../../static/images/004.jpg" /></a>
                <div class="left">
                	<a href="#">COMETIQUES 纯色奢金唇膏 属于精致的你</a><br />
                    颜色 : 浅棕色
                </div>
            </td>
            <td class="cz">1</td>
            <td class="price">¥ 480</td>
            <td class="cz">2016-12-1</td>
        </tr>
        <tr>
        	<td class="cz">020882200</td>
            <td>
            	<a href="3" class="img"><img src="../../static/images/004.jpg" /></a>
                <div class="left">
                	<a href="#">COMETIQUES 纯色奢金唇膏 属于精致的你</a><br />
                    颜色 : 浅棕色
                </div>
            </td>
            <td class="cz">1</td>
            <td class="price">¥ 480</td>
            <td class="cz">2016-12-1</td>
        </tr>
    </table>
    <div class="gw_two">付款方式</div>
    <div class="gw_seven">
    	<label><input type="radio" name="rad" checked="checked"/> <img src="../../static/images/img_14.jpg" /></label>
        <label><input type="radio" name="rad" /> 网银支付</label>
        <label><input type="radio" name="rad" /> 货到付款</label>
    </div>
</div>
<div class="gw_four">
	<div class="main">
    	<div class="left">
            <br /><br /><br />
            <input type="button" class="btn" value="上一步" />
        </div>
        <div class="right">
        	<p>商品数量总计 : 1件</p>
            <p>商品金额总计（不含运费）:<span>¥ 480</span></p>
            <input type="button" class="btn" value="下一步" />
        </div>
    </div>
</div>
<!--main end-->


<!--footer start-->
<jsp:include page="footer.jsp"></jsp:include>
<!--footer end-->

</body>
</html>
