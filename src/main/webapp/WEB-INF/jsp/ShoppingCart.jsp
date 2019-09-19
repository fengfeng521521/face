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
<div class="gw_one">
	<ul>
    	<li class="sel">
        	<em>1</em>
            <span><i>购物车</i><br />Shopping Cart</span>
        </li>
        <li>
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
	<div class="gw_two">购物车列表</div>
  <table class="gw_three" cellpadding="0" cellspacing="0">
    	<tr>
        	<th width="92" height="53"><label><input type="checkbox" class="ck_all" /> 全选</label></th>
            <th width="574">商品名称</th>
            <th width="108">数量</th>
            <th width="254">小计</th>
            <th width="150">操作</th>
        </tr>
        <tr>
        	<td><input type="checkbox" class="ck" /></td>
            <td>
            	<a href="3" class="img"><img src="../../static/images/004.jpg" /></a>
                <div class="left">
                	<a href="#">COMETIQUES 纯色奢金唇膏 属于精致的你</a><br />
                    颜色 : 浅棕色
                </div>
            </td>
            <td>
            	<input type="button" class="btn_jian num_jian" value="-" />
                <input type="text" class="txt_num" value="1" />
                <input type="button" class="btn_jia num_jia" value="+" />
            </td>
            <td class="price">¥ 480</td>
            <td class="cz"><input type="button" class="btn_del" /></td>
        </tr>
        <tr>
        	<td><input type="checkbox" class="ck" /></td>
            <td>
            	<a href="3" class="img"><img src="../../static/images/004.jpg" /></a>
                <div class="left">
                	<a href="#">COMETIQUES 纯色奢金唇膏 属于精致的你</a><br />
                    颜色 : 浅棕色
                </div>
            </td>
            <td>
            	<input type="button" class="btn_jian num_jian" value="-" />
                <input type="text" class="txt_num" value="1" />
                <input type="button" class="btn_jia num_jia" value="+" />
            </td>
            <td class="price">¥ 480</td>
            <td class="cz"><input type="button" class="btn_del" /></td>
        </tr>
        <tr>
        	<td><input type="checkbox" class="ck" /></td>
            <td>
            	<a href="3" class="img"><img src="../../static/images/004.jpg" /></a>
                <div class="left">
                	<a href="#">COMETIQUES 纯色奢金唇膏 属于精致的你</a><br />
                    颜色 : 浅棕色
                </div>
            </td>
            <td>
            	<input type="button" class="btn_jian num_jian" value="-" />
                <input type="text" class="txt_num" value="1" />
                <input type="button" class="btn_jia num_jia" value="+" />
            </td>
            <td class="price">¥ 480</td>
            <td class="cz"><input type="button" class="btn_del" /></td>
        </tr>
        <tr>
        	<td><input type="checkbox" class="ck" /></td>
            <td>
            	<a href="3" class="img"><img src="../../static/images/004.jpg" /></a>
                <div class="left">
                	<a href="#">COMETIQUES 纯色奢金唇膏 属于精致的你</a><br />
                    颜色 : 浅棕色
                </div>
            </td>
            <td>
            	<input type="button" class="btn_jian num_jian" value="-" />
                <input type="text" class="txt_num" value="1" />
                <input type="button" class="btn_jia num_jia" value="+" />
            </td>
            <td class="price">¥ 480</td>
            <td class="cz"><input type="button" class="btn_del" /></td>
        </tr>
    </table>
</div>
<div class="gw_four">
	<div class="main">
    	<div class="left">
        	<label><input type="checkbox" class="ck" /> 全选</label>|<a href="#" class="del">删除</a>
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
<script type="text/javascript">
	$(function(){
		//数量加
		$(".num_jia").each(function(a){
		
			$(this).click(function(){
				var i=parseInt($(".txt_num").eq(a).val());
				i=i+1;
				$(".txt_num").eq(a).val(i);
			})
		})
		//数量减
		$(".num_jian").each(function(a){
			$(this).click(function(){
				var i=parseInt($(".txt_num").eq(a).val());
				if(i>0)
				{
					i=i-1;
					$(".txt_num").eq(a).val(i);
				}
				
			})
		})
	})
</script>

<!--footer start-->
<jsp:include page="footer.jsp"></jsp:include>
<!--footer end-->

</body>
</html>
