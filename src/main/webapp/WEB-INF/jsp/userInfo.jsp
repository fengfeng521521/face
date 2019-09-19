<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link rel="stylesheet" type="text/css" href="../../static/css/css.css"/>
<script type="text/javascript" src="../../static/js/jquery.js"></script>
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
        <a href="${pageContext.request.contextPath }/MyCollection" class="sel" >我的收藏</a>
        <a href="${pageContext.request.contextPath }/userInfo">个人信息</a>
        <a href="${pageContext.request.contextPath }/ReceivingAddress">收货地址</a>
        <a href="${pageContext.request.contextPath }/ChangePassword">修改密码</a>
    </div>
    <div class="user_main">
        <form method="post" action="/toUpDateAction" id="MyForm">
    	<div class="u_biao"><span>个人信息</span></div>

        <table class="tb_one">
        	<tr>
            	<th>用户名：</th>
            	<td>${customer.loginName}
                <input id="customerId" type="hidden" name="customer_id" value="${customer.customerId}">
                </td>
            </tr>
            <tr>
                <th>校  名：</th>
                <td><select id="schoolId" name="school_name" class="school_name">
                    <option value="-1">----请选择----</option>
                </select></td>
            </tr>
            <tr>
            	<th>姓  名：</th>
            	<td><input type="text" id="customerNameId" class="txt customer_name" name="customer_name"/></td>
            </tr>
            <tr>
                <th>证件类型：</th>
                <td>
                    <label><input type="radio" name="identity_card_type" class="identity_card_type" value="0"/>学生证</label>
                    <label><input type="radio" name="identity_card_type" class="identity_card_type" value="1"/>身份证</label>
                </td>
            </tr>
            <tr>
                <th>证件号码：</th>
                <td><input type="text" class="txt" id="identityCardNoId" name="identity_card_no"/></td>
            </tr>
            <tr>
            	<th>性  别：</th>
            	<td>
                	<label><input type="radio" name="gender" class="gender" value="0"/>男</label>
                    <label><input type="radio" name="gender" class="gender" value="1"/>女</label>
                </td>
            </tr>
            <tr>
            	<th>邮  箱：</th>
            	<td><input type="text" class="txt" id="customerEmailId" name="customer_email"/></td>
            </tr>
            <tr>
            	<th>微  信：</th>
            	<td><input type="text" class="txt" id="weixinId" name="weixin"/></td>
            </tr>
            <tr>
            	<th>手机号：</th>
            	<td><input type="text" class="txt" id="mobilePhoneId" name="mobile_phone"/></td>
            </tr>
            <tr>
                <th>地  址：</th>
                <td>
                    <select id="receiverState" name="province" onchange="getCityFun(this.value,-1,-1)">
                    <option value="-1">---请选择---</option>
                    </select>
                    省
                    <select id="receiverCity" name="city" onchange="getAreaFun(this.value,-1)">
                        <option value="-1">---请选择---</option>
                    </select>
                    市
                    <select id="receiverDistrict" name="district" onchange="wanCheng(this.value)">
                        <option value="-1">---请选择---</option>
                    </select>
                    县(区)
                </td>

            </tr>

            <tr>
            	<th>详细地址：</th>
            	<td><textarea id="addressId" class="txt1" name="address"></textarea></td>
            </tr>
            <tr>
            	<th></th>
                <td><input type="submit" class="btn" value="确认"  onclick="javascript: return  check()"/></td>
            </tr>
        </table>
        </form>
    </div>



</div>
<!--main end-->
<script type="text/javascript">
    $(function(){
        checkAllIsNull();
        //省市区三级联动初始化
        getProvinceFun(-1,-1,-1);

        //刷新界面
        getAllAddress();
        getSchool();
        //提示提交信息为何出错

    });

//检查提交表单是否为空
    function check() {
        if(!($("#customerId").val()!=''&&$("#schoolId").val()!='-1'&&$("#customerNameId").val()!=''&&$(".identity_card_type").checked()=='checked'&&$(".gender").checked()=='checked'&&$("#customerEmailId").val()!=''&&$("#identityCardNoId").val()!=''&&$("#weixinId").val()!=''&&$("#mobilePhoneId").val()!=''&&$("#receiverState").val()!='-1'&&$("#receiverCity").val()!=''&&$("#receiverDistrict").val()!=''&&$("#addressId").val()!='')){
            //layer.msg('完整信息！！');
            //alert("提交");
            //$("#MyForm").submit();
            alert("有空值！请完整信息");
            return false;

        }else {
            return true;

        }

    };







    //检查各个输入项是否为空并提示
   function checkAllIsNull() {
            //手机号码
            $(".txt").blur(function(){
                if ($(".mobile_phone").val() == "") {
                    layer.msg('手机号码不能为空');
                    return false;
                }
               else if (!$(".mobile_phone").val().match(/^1([23578])\d{9}$/)) {
                    layer.msg('手机号码格式不正确');
                    return false;
                }
            });
            //验证输入框是否有值
            $(".txt").blur(function(){
           if ($(".txt").val() == "") {
               layer.msg('请填写完整信息！！');
               return false;
           }

            });






   }















    //获取用户已有地址列表
    function getAllAddress(){
        $.ajax({
            "url":"${pageContext.request.contextPath}/showAddress",
            "data":"",
            "type":"GET",
            "dataType":"json",
            "success":function(obj){
                if(obj.state==1){

                   /* var option = new Option(obj.data[i].provinceName, obj.data[i].provinceCode);
                    $("#receiverState").append(option);
*/

                    for (var i=0;i<=obj.data.length;i++){

                     console.log(obj.data[i]);
                       var option = new Option(obj.data[i].area_NAME,obj.data[i].area_ID);
                        $("#receiverState").append(option);

                    }


                }


    }  });



    }
    //获取省份列表
    function getProvinceFun(provinceCode,cityCode,areaCode) {
        $.ajax({
            "url": "../dict/getProvince.do",
            "data": "",
            "type": "GET",
            "dataType": "json",
            "success": function (obj) {
                $("#receiverState").html("<option>--请选择--</option>");
                for (i = 0; i < obj.data.length; i++) {
                    var option = new Option(obj.data[i].provinceName, obj.data[i].provinceCode);
                    $("#receiverState").append(option);
                }
                //回显省份信息
                if (provinceCode != -1) {
                    $("#receiverState").val(provinceCode);
                }
            }
        });

        getCityFun(provinceCode, cityCode, areaCode);
    }




    //通过选择省份触发事件获取城市列表
    function getCityFun(provinceCode,cityCode,areaCode){
        $.ajax({
            "url":"${pageContext.request.contextPath}/showAddress/city",
            "data":"AREAPARENTID="+provinceCode,
            "type":"GET",
            "dataType":"json",
            "success":function(obj){

                $("#receiverCity").html("<option>--请选择--</option>");
                for(var i=0;i<=obj.data.length;i++){
                    var option = new Option(obj.data[i].area_NAME,obj.data[i].area_ID);
                    $("#receiverCity").append(option);
                }
                //设置城市数据回显
                if(cityCode!=-1){
                    $("#receiverCity").val(cityCode);
                }
            }
        });
        getAreaFun(cityCode,areaCode);
    }





    //通过城市选择触发事件获取地区列表
    function getAreaFun(cityCode,areaCode){
        $.ajax({
            "url":"${pageContext.request.contextPath}/showAddress/county",
            "data":"county="+cityCode,
            "type":"GET",
            "dataType":"json",
            "success":function(obj){
                $("#receiverDistrict").html("<option>--请选择--</option>");
                for(var i=0;i<obj.data.length;i++){
                    var option = new Option(obj.data[i].area_NAME,obj.data[i].area_ID);
                    $("#receiverDistrict").append(option);
                }
                //设置区县回显
                if(areaCode!=-1){
                    $("#receiverDistrict").val(areaCode);
                }
            }
        });
    }
    //确定县区的val值
    function wanCheng( xianValCode) {
       if(xianValCode!=-1){

           $("#receiverDistrict").val(xianValCode);

       }



        
    };


    
    
    
    //处理异步学校
   function getSchool(schId){
       $.ajax({
           "url":"${pageContext.request.contextPath}/showAddress/school",
           "data":"",
           "type":"GET",
           "dataType":"json",
           "success":function(obj){
               if (obj.state==1) {
               $("#receiverDistrict").html("<option>--请选择--</option>");
               for(var i=0;i<obj.data.length;i++){
                   var option = new Option(obj.data[i].name,obj.data[i].id);
                   $("#schoolId").append(option);
               }

               }
               //
               if(schId!=-1){
                   $("#schoolId").val(schId);
               }
           }
       });


   }

</script>
<!--footer start-->
<jsp:include page="footer.jsp"></jsp:include>
<!--footer end-->

</body>
</html>
