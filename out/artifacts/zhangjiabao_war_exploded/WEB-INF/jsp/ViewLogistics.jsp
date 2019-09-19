<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
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
	<div class="wl_one"><span>物流详情</span></div>
    <div class="wl_main">
        <div class="wl_two">包裹信息</div>
        <table class="wl_three">
        	<tr>
            	<th width="157">运单号码：</th><td width="238">1123578099609</td>
                <th width="138">物流公司：</th><td width="134">EMS </td>
                <th width="157">客服电话：</th><td width="328">11183</td>
            </tr>
            <tr>
            	<th>订单号：</th>
                <td colspan="5">020888820</td>
            </tr>
            <tr>
            	<th>收货地址：</th>
                <td colspan="5">广东省广州市 天河区体育中心B栋111室内 （51200）    陈语晗    188****1390</td>
            </tr>
            <tr>
            	<td colspan="3">
                	<div class="img"><img src="../../static/images/006.jpg"/></div>
                    <p>cometiques 纯色奢金唇膏<br />属于精致的你</p>
                </td>
                <td colspan="3"><input type="button" class="btn" value="返回上一步" /></td>
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
