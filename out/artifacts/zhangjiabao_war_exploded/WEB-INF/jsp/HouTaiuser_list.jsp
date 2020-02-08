<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>后台管理系统</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="../../static/css/style.css">
<!--[if lt IE 9]>
 <script src="../../static/js/html5.js"></script>
 <![endif]-->
<script src="../../static/js/jquery.js"></script>
<script src="../../static/js/jquery.mCustomScrollbar.concat.min.js"></script>
<script>

	(function($){
		$(window).load(function(){
			
			$("a[rel='load-content']").click(function(e){
				e.preventDefault();
				var url=$(this).attr("href");
				$.get(url,function(data){
					$(".content .mCSB_container").append(data); //load new content inside .mCSB_container
					//scroll-to appended content 
					$(".content").mCustomScrollbar("scrollTo","h2:last");
				});
			});
			
			$(".content").delegate("a[href='top']","click",function(e){
				e.preventDefault();
				$(".content").mCustomScrollbar("scrollTo",$(this).attr("href"));
			});
			
		});
	})(jQuery);
</script>
</head>
<body>
<!--header-->
<header>
 <h1><img src="../../static/images/admin_logo.png"/></h1>
 <ul class="rt_nav">
  <li><a href="http://www.mycodes.net" target="_blank" class="website_icon">站点首页</a></li>
  <li><a href="#" class="clear_icon">清除缓存</a></li>
  <li><a href="#" class="admin_icon">DeathGhost</a></li>
  <li><a href="#" class="set_icon">账号设置</a></li>
  <li><a href="HouTailogin" class="quit_icon">安全退出</a></li>
 </ul>
</header>
<!--aside nav-->
<!--aside nav-->
<aside class="lt_aside_nav content mCustomScrollbar">
 <h2><a href="houTaiIndex">起始页</a></h2>
 <ul>
  <li>
   <dl>
    <dt>常用布局示例</dt>
    <!--当前链接则添加class:active-->
    <dd><a href="HouTaiproduct_list" class="active">商品列表示例</a></dd>
    <dd><a href="HouTaiproduct_detail">商品详情示例</a></dd>
    <dd><a href="HouTairecycle_bin">商品回收站示例</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>订单信息</dt>
    <dd><a href="HouTaiorder_list">订单列表示例</a></dd>
    <dd><a href="HouTaiorder_detail">订单详情示例</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>会员管理</dt>
    <dd><a href="HouTaiuser_list">会员列表示例</a></dd>
    <dd><a href="HouTaiuser_detail">添加会员（详情）示例</a></dd>
    <dd><a href="HouTaiuser_rank">会员等级示例</a></dd>
    <dd><a href="HouTaiadjust_funding">会员资金管理示例</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>基础设置</dt>
    <dd><a href="HouTaisetting">站点基础设置示例</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>配送与支付设置</dt>
    <dd><a href="HouTaiexpress_list">配送方式</a></dd>
    <dd><a href="HouTaipay_list">支付方式</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>在线统计</dt>
    <dd><a href="HouTaidischarge_statistic">流量统计</a></dd>
    <dd><a href="HouTaisales_volume">销售额统计</a></dd>
   </dl>
  </li>
  <li>
   <p class="btm_infor">© DeathGhost.cn 版权所有</p>
  </li>
 </ul>
</aside>

<section class="rt_wrap content mCustomScrollbar">
 <div class="rt_content">
      <div class="page_title">
       <h2 class="fl">会员列表</h2>
       <a href="HouTaiuser_detail" class="fr top_rt_btn add_icon">添加新会员</a>
      </div>
      <section class="mtb">
       <select class="select">
        <option>会员等级</option>
        <option>普通会员</option>
        <option>高级会员</option>
       </select>
       <input type="text" class="textbox textbox_225" placeholder="输入会员号/手机/电子邮件查询..."/>
       <input type="button" value="查询" class="group_btn"/>
      </section>
      <table class="table">
       <tr>
        <th>Id</th>
        <th>会员头像</th>
        <th>会员账号</th>
        <th>手机号码</th>
        <th>电子邮件</th>
        <th>验证</th>
        <th>会员等级</th>
        <th>账户余额</th>
        <th>冻结资金</th>
        <th>操作</th>
       </tr>
       <tr>
        <td class="center">001</td>
        <td class="center"><img src="../../static/upload/user_002.png" width="50" height="50"/></td>
        <td>DeathGhost</td>
        <td class="center">18300000000</td>
        <td class="center">deathghost@sina.cn</td>
        <td class="center"><a title="已验证" class="link_icon">&#89;</a></td>
        <td class="center">普通会员</td>
        <td class="center">
         <strong class="rmb_icon">5559.00</strong>
        </td>
        <td class="center">
         <strong class="rmb_icon">59.00</strong>
        </td>
        <td class="center">
         <a href="HouTaiuser_detail" title="编辑" class="link_icon">&#101;</a>
         <a href="#" title="删除" class="link_icon">&#100;</a>
        </td>
       </tr>
       <tr>
        <td class="center">002</td>
        <td class="center"><img src="../../static/upload/user_001.png" width="50" height="50"/></td>
        <td>DeathGhost02</td>
        <td class="center">15800000000</td>
        <td class="center">232650413@sina.cn</td>
        <td class="center"><a title="未验证" class="link_icon">&#88;</a></td>
        <td class="center">高级会员</td>
        <td class="center">
         <strong class="rmb_icon">199.00</strong>
        </td>
        <td class="center">
         <strong class="rmb_icon">15.00</strong>
        </td>
        <td class="center">
         <a href="HouTaiuser_detail" title="编辑" class="link_icon">&#101;</a>
         <a href="#" title="删除" class="link_icon">&#100;</a>
        </td>
       </tr>
      </table>
      <aside class="paging">
       <a>第一页</a>
       <a>1</a>
       <a>2</a>
       <a>3</a>
       <a>…</a>
       <a>1004</a>
       <a>最后一页</a>
      </aside>
 </div>
</section>
</body>
</html>
