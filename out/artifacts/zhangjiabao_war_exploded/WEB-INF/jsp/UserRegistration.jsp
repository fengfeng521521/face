<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户注册</title>
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
        	<div class="zc_one">注册COURANT-JET</div>
            <div class="zc_two">
            	<span>邮箱注册</span>
                <span class="sel">商城用户注册</span>
            </div>
            <ul class="zc_three">
                <form method="post" action="/userRegAction">
            	<li><input type="text" class="txt txt_tell" name="LoginName" placeholder="请输入用户名" id="uid" onblur="CheckUserName();"/></li>

                <li><input type="text" class="txt txt_yzm"  id="verCode" placeholder="请输入验证码"  onblur="yanzheng()"/>
                	<!--<input type="button" class="btn_yzm" value="获取验证码" />-->
                    <!--<button id="validImage">验证</button>-->
                    <img id="img" src="/image"  onclick="changeImg()"/>
                    <%--<button  type="button" onclick="yanzheng();" >验证</button>--%>
                    <label type="button" onclick="changeImg();" style="background-color: #B16569">点我换图片</label>
                </li>

                <li><input type="password" name="PassWord" class="txt txt_pwd pwd" placeholder="请输入密码" /></li>
                <li><input type="password" class="txt txt_pwd pwd2" placeholder="请再次输入密码" /></li>
                <li><input type="submit" class="btn btn_zc" value="注 册" id="validImage"/>

                </li>
                <li><a href="/SignIn" class="a">已有账号？立即登录</a></li>
                </form>
            </ul>
        </div>    
    </div>

</div>
<script type="text/javascript" src="../../static/js/layer/layer.js"></script>
<script type="text/javascript" src="../../static/js/jQuery.js"></script>

<script type="text/javascript">
     function changeImg(){
         $.ajax({
             //5个key-value
             //alert(obj)因为页面上不能显示成功失败，所以弹框显示
             "url":"${pageContext.request.contextPath}/image",
             "type":"GET",

             "success":function(data){
                 /!* alert(data.attr(data));*!/

                 $("#img").attr("src","/image?date=" + new Date().getTime());

             }
         });

         //alert("asdadsasd");
     }





	$(function(){
		//手机号码
		$(".txt_tell").blur(function(){
			if ($(".txt_tell").val() == "") { 
				layer.msg('用户名不能为空');
			}
			/*else if (!$(".txt_tell").val().match(/^1([23578])\d{9}$/)) {
				layer.msg('手机号码格式不正确');
			} */
		})
		//密码
		$(".pwd").blur(function(){
			if ($(".pwd").val() == "") { 
				layer.msg('密码不能为空');
			}
		})
		$(".pwd2").blur(function(){
			if ($(".pwd2").val() == "") 
				layer.msg('再次输入密码不能为空');
			else if($(".pwd2").val()!=$(".pwd").val()){

                layer.msg('两次输入的密码不一致');
            }

			
		})
		$(".btn_zc").click(function(){
			if ($(".txt_tell").val() == "") {
				layer.msg('用户名不能为空');
				return false;
			}
			/*else if (!$(".txt_tell").val().match(/^1([23578])\d{9}$/)) {
				layer.msg('手机号码格式不正确');
				return false;
			}*/
		/*else if($(".txt_yzm").val() == "") {

				layer.msg('验证码不能为空');


				return false;
			}
*/



			else if ($(".pwd").val() == "") { 
				layer.msg('密码不能为空');
				return false;
			}

			else if ($(".pwd2").val() == "") {
				layer.msg('再次输入密码不能为空');
				return false;
			}
			else if($(".pwd2").val()!=$(".pwd").val()){
				layer.msg('两次输入的密码不一致');
				return false;
			}
		});
		
		/*//获取验证码 倒计时
		var timer;
		var i;
		function jishi(){
			i=i-1;
			if(i>=1)
				$(".btn_yzm").val(i+"秒后重新获取");
			else{
				$(".btn_yzm").val("免费获取手机验证码");
				$(".btn_yzm").css("background","#F96F41");
				$(".btn_yzm").attr("disabled",false);
				clearInterval(timer);
			}
		}*/
		$(".btn_yzm").click(function(){
			if($(".txt_tell").val()=="")
				layer.msg('用户名不能为空，请重新输入',{time: 2000},function(){$(".txt_tell").focus();});
			else if(!$(".txt_tell").val().match(/^1([23578])\d{9}$/))
				layer.msg('手机号码格式不正确，请重新输入',{time: 2000},function(){$(".txt_tell").focus();});
			else{
				$(".btn_yzm").val("60秒后重新获取");
				$(".btn_yzm").css("background","#CCC");
				$(".btn_yzm").attr("disabled","disabled");
				timer=setInterval(jishi, 1000);
				i=60;
			}
		})
	});


    //获取动态验证码的js
    /*function changeImg() {
        // var img = document.getElementById("img");
        //$("#img").attr("src","/image?date=" + new Date().getTime());
        alert("车");
        $.ajax({
            //5个key-value
            //alert(obj)因为页面上不能显示成功失败，所以弹框显示
            "url":"image?date=+"+new Date().getTime(),

            "type":"GET",

            "success":function(data){
                /!* alert(data.attr(data));*!/
                if(data.state==1){}
                //$("#img").attr("src","/image?date=" + new Date().getTime());
                alert(data.message);
            }
        });


    }*/

    $("#validImage").click(function () {





        $.get("/valid",
            {
                code:$("#verCode").val()
            },
            function (data) {
                console.log(data.CODEMAP.meg);
            });


    });



  /*  $.ajax(

        "URL"
        "data":$("#verCode").val(),
        "type":"POST",
        "dataType":"json",
        "success":function(data){
        alert(data.CODEMAP.meg);

    });*/



      /*$.post("/valid",
            {
                code:$("#verCode").val()
            },
            function (data) {
                console.log(data);
            });
    });*/

    function yanzheng(){

        $.ajax({
            //5个key-value
            //alert(obj)因为页面上不能显示成功失败，所以弹框显示
            "url":"${pageContext.request.contextPath}/valid",
            "data":"code="+$("#verCode").val(),
            "type":"POST",
            "dataType":"json",
            "success":function(data){
               /* alert(data.attr(data));*/
                console.log(data.codemap.meg);
                layer.msg(data.codemap.meg);
            }
        });





       if($("#verCode").val()=="") {
            layer.msg("验证码不能为空");

        }

    }
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
               if(obj.state==1){

                   layer.msg(obj.message);
               }
            }
        });






    }






</script>
<!--main end-->

<!--footer start-->
<jsp:include page="footer.jsp"></jsp:include>
<!--footer end-->

</body>
</html>
