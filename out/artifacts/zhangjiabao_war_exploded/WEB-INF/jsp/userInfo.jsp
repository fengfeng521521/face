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
    	<div class="u_biao"><span>个人信息</span></div>
        <table class="tb_one">
        	<tr>
            	<th>用户名：</th>
            	<td>${customer.loginName}</td>

            </tr>
            <tr>
                <th>校  名：</th>
                <td><select >
                    <option>--请选择--</option>
                    <option>郑州大学</option>
                    <option>河南大学</option>
                    <option></option>
                    <option></option>
                    <option></option>

                </select></td>
            </tr>
            <tr>
            	<th>姓  名：</th>
            	<td><input type="text" class="txt" /></td>
            </tr>
            <tr>
                <th>证件类型：</th>
                <td>
                    <label><input type="radio" name="identityCardType" checked="checked" />学生证</label>
                    <label><input type="radio" name="identityCardType" />身份证</label>
                </td>
            </tr>
            <tr>
                <th>证件号码：</th>
                <td><input type="text" class="txt" /></td>
            </tr>
            <tr>
            	<th>性  别：</th>
            	<td>
                	<label><input type="radio" name="sex" checked="checked" />男</label>
                    <label><input type="radio" name="sex" />女</label>
                </td>
            </tr>
            <tr>
            	<th>邮  箱：</th>
            	<td><input type="text" class="txt" /></td>
            </tr>
            <tr>
            	<th>微  信：</th>
            	<td><input type="text" class="txt" /></td>
            </tr>
            <tr>
            	<th>手机号：</th>
            	<td><input type="text" class="txt" /></td>
            </tr>
            <tr>
                <th>地  址：</th>
                <td>
                    <!--收货人所在城市等信息-->
                    <%--<div  class="address_content">
                        <span class="red">*</span>
                        <span class="kuan">省&nbsp;&nbsp;份：</span>
                        <select data-province="---- 选择省 ----" id="receiverState" name="receiverState" onchange="getCityFun(this.value,-1,-1)"></select>
                        城市：<select data-city="---- 选择市 ----" id="receiverCity" name="receiverCity" onchange="getAreaFun(this.value,-1)"></select>
                        区/县：<select data-district="---- 选择区 ----" id="receiverDistrict" name="receiverDistrict" ></select>
                    </div>--%>








                <select id="receiverState" name="receiverState" onchange="getCityFun(this.value,-1,-1)">
                    <option value="-1">--请选择--</option>
                    <%--<option>河南</option>
                    <option>河北</option>
                    <option>北京</option>--%>
                   <%-- <option></option>
                    <option></option>--%>

                    </select>
                    省
                    <select id="receiverCity" name="receiverCity" onchange="getAreaFun(this.value,-1)">
                        <option value="-1">--请选择--</option>
                        <option>开封</option>
                        <option>郑州</option>
                        <option></option>
                        <option></option>
                        <option></option>

                    </select>
                    市
                    <select id="receiverDistrict" name="receiverDistrict">
                        <option value="-1">--请选择--</option>
                        <option>兰考县</option>
                        <option>商丘县</option>
                        <option></option>
                        <option></option>
                        <option></option>

                    </select>
                    县(区)
                </td>

            </tr>

            <tr>
            	<th>详细地址：</th>
            	<td><textarea class="txt1"></textarea></td>
            </tr>
            <tr>
            	<th></th>
                <td><input type="button" class="btn" value="确认" /></td>
            </tr>
        </table>
    </div>
</div>
<!--main end-->
<script type="text/javascript">
    $(function(){
        //省市区三级联动初始化
        getProvinceFun(-1,-1,-1);
        //刷新界面
        getAllAddress();
    });

    //获取用户已有地址列表
    function getAllAddress(){
        $.ajax({
            "url":"${pageContext.request.contextPath}/showAddress",
            "data":"",
            "type":"GET",
            "dataType":"json",
            "success":function(obj){
                if(obj.state==1){
                    alert("成功");
                   /* var option = new Option(obj.data[i].provinceName, obj.data[i].provinceCode);
                    $("#receiverState").append(option);
*/

                    for (var i=0;i<=obj.data.length;i++){

                     console.log(obj.data[i]);
                       var option = new Option(obj.data[i].area_NAME);
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
            "url":"${pageContext.request.contextPath}/dict/getCity.do",
            "data":"provinceCode="+provinceCode,
            "type":"GET",
            "dataType":"json",
            "success":function(obj){
                $("#receiverCity").html("<option>--请选择--</option>");
                for(i=0;i<obj.data.length;i++){
                    var option = new Option(obj.data[i].cityName,obj.data[i].cityCode);
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
            "url":"${pageContext.request.contextPath}/dict/getArea.do",
            "data":"cityCode="+cityCode,
            "type":"GET",
            "dataType":"json",
            "success":function(obj){
                $("#receiverDistrict").html("<option>--请选择--</option>");
                for(i=0;i<obj.data.length;i++){
                    var option = new Option(obj.data[i].areaName,obj.data[i].areaCode);
                    $("#receiverDistrict").append(option);
                }
                //设置区县回显
                if(areaCode!=-1){
                    $("#receiverDistrict").val(areaCode);
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
