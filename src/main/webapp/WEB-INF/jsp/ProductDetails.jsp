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
<div class="main">
	<div class="wei"><a href="#">首页</a>/<a href="#">产品分类</a>/<a href="#">彩妆</a>/<span>雅思兰黛</span></div>
    <div class="cp_five">
    	<table class="top"><tr><td><img src="../../static/images/004.jpg" /></td></tr></table>
        <ul>
        	<li class="sel"><img src="../../static/images/004.jpg" /></li>
            <li><img src="../../static/images/002.jpg"/></li>
            <li><img src="../../static/images/004.jpg" /></li>
            <li><img src="../../static/images/002.jpg"/></li>
            <li><img src="../../static/images/004.jpg" /></li>
            <li><img src="../../static/images/002.jpg"/></li>
        </ul>
        <script type="text/javascript">
        	$(function(){
				$(".cp_five ul li").click(function(){
					$(".cp_five ul li").removeClass("sel");
					$(this).addClass("sel");
					$(".cp_five .top img").attr("src",$(this).find("img").attr("src"));
					return false;
				})
			})
        </script>
    </div>
    <div class="cp_six">
    	<h1>纯色恒彩唇膏</h1>
        <h5># 30810</h5>
        <h3>高饱和度唇膏，多款缤纷色泽。尽情挥洒，诠释不褪色的唇色艺术！</h3>
        <div class="price">
        	<span>¥ 520.00</span>专柜价 ：¥ 680.00
        </div>
        <div class="xiala">
        	<select>
            	<option>10 Pearly Cold Pink</option>
            </select>
            <select>
            	<option>3.5g</option>
            </select>
        </div>
        <ul>
        	<li><span>购买数量</span>
            	<input type="button" class="btn" value="-" />
                <input type="text" class="txt" value="1" />
                <input type="button" class="btn" value="+" />
            </li>
            <li><span>所有色号</span>
            	<p class="yanse">
                	<i style="background:#D47F92" class="sel"></i>
                    <i style="background:#F1A78A"></i>
                    <i style="background:#B16569"></i>
                    <i style="background:#EB553C"></i>
                    <i style="background:#F574AA"></i>
                    <i style="background:#A81D34"></i>
                    <i style="background:#865C9C"></i>
                </p>
                <script type="text/javascript">
                	$(".yanse i").click(function(){
						$(".yanse i").removeClass("sel");
						$(this).addClass("sel");
					})
                </script>
            </li>
        </ul>
        <div class="desc">
        	发送门店 &nbsp; &nbsp; &nbsp; 此货品将由法国商城为您发货，预计1-3个工作日送达<br />
            温馨提示 &nbsp; &nbsp; &nbsp; 本商品支持7天无理由退换货品 支持货到付款
        </div>
        <input type="button" class="btn_gwc" value="添加购物车" />
        <input type="button" class="btn_gm" value="立即购买" />
    </div>
    <div class="cp_br"></div>
    <div class="cp_seven">
    	<div class="top">同品牌推荐</div>
        <ul>
        	<li>
            	<a class="img" href="#"><img src="../../static/images/006.jpg" /></a>
                <div class="right">
                	<a href="#">法国商城纯色恒彩唇膏</a><br />
                    ¥ 520.00
                </div>
            </li>
            <li>
            	<a class="img" href="#"><img src="../../static/images/006.jpg" /></a>
                <div class="right">
                	<a href="#">法国商城纯色恒彩唇膏</a><br />
                    ¥ 520.00
                </div>
            </li>
            <li>
            	<a class="img" href="#"><img src="../../static/images/006.jpg" /></a>
                <div class="right">
                	<a href="#">法国商城纯色恒彩唇膏</a><br />
                    ¥ 520.00
                </div>
            </li>
            <li>
            	<a class="img" href="#"><img src="../../static/images/006.jpg" /></a>
                <div class="right">
                	<a href="#">法国商城纯色恒彩唇膏</a><br />
                    ¥ 520.00
                </div>
            </li>
            <li>
            	<a class="img" href="#"><img src="../../static/images/006.jpg" /></a>
                <div class="right">
                	<a href="#">法国商城纯色恒彩唇膏</a><br />
                    ¥ 520.00
                </div>
            </li>
        </ul>
    </div>
    <div class="cp_eight">
    	商品品牌：法国商城旗下彩妆系列<br />
        产品颜色：10 Pearly Cold Pink<br />
        产品材质：100%环保材质<br />
        产品容量：3.5g，4g，5g，6g，6.5，<br />
        产品产地：法国<br />
        产品类型：彩妆香水<br />
        产品型号：#30810<br />
        产品状态：全新正品 法国直邮<br />
        产品来源：法国商城
    </div>
</div>
<!--main end-->

<!--footer start-->
<jsp:include page="footer.jsp"></jsp:include>
<!--footer end-->

</body>
</html>
