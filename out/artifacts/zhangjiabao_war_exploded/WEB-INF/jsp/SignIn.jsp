<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html xmlns="http://www.w3.org/1999/xhtml">
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
<div class="dl_main">
	<div class="main">

    	<div class="zc_bai">
       <form method="post" action="${pageContext.request.contextPath}/toSinInAction">
        	<div class="zc_one dl_one">登录COURANT-JET</div>
            <ul class="zc_three dl_two">
            	<li><input type="text" class="txt txt_name" id="uid" onblur="CheckUserName();" placeholder="请输入用户名"  name="LoginName"  /></li>
                <li><input type="password" class="txt txt_pwd" placeholder="请输入密码" name="PassWord"/></li>
                <li><input type="submit" class="btn btn_zc" value="登 录" />
                <%--<input type="submit" value="登 录">--%>
                </li>
                <li><a href="${pageContext.request.contextPath}/UserRegistration" class="aa">没有账号？立即注册</a>
                	<a href="#" class="a">忘记密码</a>
                </li>
            </ul>
        </form>
        </div>

    </div>
</div>
<script type="text/javascript" src="../../static/js/layer/layer.js"></script>
<script type="text/javascript">
    function CheckUserName(){
        $.ajax({
            //5个key-value
            //alert(obj)因为页面上不能显示成功失败，所以弹框显示
            "url":"${pageContext.request.contextPath}/checkName",
            "data":"userName="+$("#uid").val(),
            "type":"POST",
            "dataType":"json",
            "success":function(obj){
                /* alert(data.attr(data));*/
                if(obj.state==0){

                    layer.msg("用户名存在可以使用");
                }
            }
        });



}

	$(function(){
		//手机号码
		$(".txt_name").blur(function(){
			if ($(".txt_name").val() == "") { 
				layer.msg('用户名不能为空');
			}
		})
		//密码
		$(".txt_pwd").blur(function(){
			if ($(".txt_pwd").val() == "") { 
				layer.msg('密码不能为空');
			}
		})
		$(".btn_zc").click(function(){
			if ($(".txt_name").val() == "") {
				layer.msg('用户名不能为空');
				return false;
			}
			else if ($(".pwd").val() == "") { 
				layer.msg('密码不能为空');
				return false;
			}
		})
		
		
	})
</script>
<!--main end-->

<!--footer start-->
<jsp:include page="footer.jsp"></jsp:include>
<!--footer end-->

</body>
</html>
