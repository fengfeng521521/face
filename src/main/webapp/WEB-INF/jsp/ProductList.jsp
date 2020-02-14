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
<div class="cp_one"><a href="#"></a></div>
<div class="main">
	<div class="wei"><a href="#">首页</a>/<a href="#">产品分类</a>/<a href="#">彩妆</a>/<span>雅思兰黛</span></div>
    <ul class="cp_two">
    	<li>
        	<h3>电   器</h3>
            <div class="right">     
            	<a href="#">官网畅销</a><a href="#">眼影</a><a href="#">眼线</a>
                <a href="#">睫毛膏</a><a href="#">眉毛</a><a href="#">流云系列</a>
                <a href="#">眉毛</a><a href="#">流云系列</a><a href="#">查看全部</a>
            </div>
        </li>
        <li>
        	<h3>生活用品</h3>
            <div class="right">     
            	<a href="#">官网畅销</a><a href="#">眼影</a><a href="#">眼线</a>
                <a href="#">睫毛膏</a><a href="#">眉毛</a><a href="#">流云系列</a>
                <a href="#">眉毛</a><a href="#">流云系列</a><a href="#">查看全部</a>
            </div>
        </li>
        <li>
        	<h3>学习用品</h3>
            <div class="right">     
            	<a href="#">官网畅销</a><a href="#">眼影</a><a href="#">眼线</a>
                <a href="#">睫毛膏</a><a href="#">眉毛</a><a href="#">流云系列</a>
                <a href="#">眉毛</a><a href="#">流云系列</a><a href="#">查看全部</a>
            </div>
        </li>
        <li>
        	<h3>休闲娱乐</h3>
            <div class="right">     
            	<a href="#">官网畅销</a><a href="#">眼影</a><a href="#">眼线</a>
                <a href="#">睫毛膏</a><a href="#">眉毛</a><a href="#">流云系列</a>
                <a href="#">眉毛</a><a href="#">流云系列</a><a href="#">查看全部</a>
            </div>
        </li>
        <li>
        	<h3>眼 妆</h3>
            <div class="right">     
            	<a href="#">官网畅销</a><a href="#">眼影</a><a href="#">眼线</a>
                <a href="#">睫毛膏</a><a href="#">眉毛</a><a href="#">流云系列</a>
                <a href="#">眉毛</a><a href="#">流云系列</a><a href="#">查看全部</a>
            </div>
        </li>
        <li>
        	<h3>眼 妆</h3>
            <div class="right">     
            	<a href="#">官网畅销</a><a href="#">眼影</a><a href="#">眼线</a>
                <a href="#">睫毛膏</a><a href="#">眉毛</a><a href="#">流云系列</a>
                <a href="#">眉毛</a><a href="#">流云系列</a><a href="#">查看全部</a>
            </div>
        </li>
    </ul>
    <div class="cp_three">
    	<div class="left">
        	<a href="#" class="sel">综合</a>
            <a href="#">人气</a>
            <a href="#">销量</a>
            <a href="#">价格</a>
        </div>
        <div class="right">
        	1 / 34 <a href="#"><</a><a href="#">></a>
        </div>
    </div>
    <ul class="cp_four">


        <c:forEach var="p" items="${product_infos}" >
            <li>
                <div class="img">
                    <span class="da"></span>
                    <a href="#"><img src="../../${p.picurl}" /></a>
                </div>
                <h1><a href="#">${p.product_name}</a></h1>
                <p>¥${p.price}</p>
            </li>


        </c:forEach>


        <li>
        	<div class="img">
            	<span class="da"></span>
            	<a href="#"><img src="../../static/images/002.jpg" /></a>
            </div>
        	<h1><a href="#">LUXE LIP 纯色奢金唇膏</a></h1>
            <p>¥25000000000000.00</p>
        </li>
    </ul>
    <div class="page">
    	<a href="#" class="sel">1</a>
        <a href="#">2</a>
        <a href="#">3</a>
        <a href="#">4</a>
        <a href="#">5</a>
        <a href="#">></a>
        页面
        <select>
        	<option>第1页</option>
        </select>
    </div>
</div>
<!--main end-->
<script type="text/javascript">
    $(function(){

        getAllproductInfo();



    });

  function  getAllproductInfo(){
      $.ajax({
          "url":"${pageContext.request.contextPath}/showAddress",
          "data":"",
          "type":"post",
          "dataType":"json",
          "success":function(obj) {
            if(obj.state==1){
            alert(obj.mesg);


            }


          }  });

  }




</script>
<!--footer start-->
<jsp:include page="footer.jsp"></jsp:include>
<!--footer end-->

</body>
</html>
