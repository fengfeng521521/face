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
       <h2 class="fl">商品列表示例</h2>
       <a href="HouTaiproduct_detail" class="fr top_rt_btn add_icon">添加商品</a>
      </div>
      <section class="mtb">
       <select class="select">
        <option>下拉菜单</option>
        <option>菜单1</option>
       </select>
       <input type="text" class="textbox textbox_225" placeholder="输入产品关键词或产品货号..."/>
       <input type="button" value="查询" class="group_btn"/>
      </section>
      <table class="table">
       <tr>
        <th>缩略图</th>
        <th>产品名称</th>
        <th>货号</th>
        <th>单价</th>
        <th>单位</th>
        <th>精品</th>
        <th>新品</th>
        <th>热销</th>
        <th>库存</th>
        <th>操作</th>
       </tr>
       <tr>
        <td class="center"><img src="../../static/upload/goods01.jpg" width="50" height="50"/></td>
        <td>这里是产品名称</td>
        <td class="center">A15902</td>
        <td class="center"><strong class="rmb_icon">59.00</strong></td>
        <td class="center">包</td>
        <td class="center"><a title="是" class="link_icon">&#89;</a></td>
        <td class="center"><a title="否" class="link_icon">&#88;</a></td>
        <td class="center"><a title="是" class="link_icon">&#89;</td>
        <td class="center">5559</td>
        <td class="center">
         <a href="http://www.mycodes.net" title="预览" class="link_icon" target="_blank">&#118;</a>
         <a href="HouTaiproduct_detail" title="编辑" class="link_icon">&#101;</a>
         <a href="#" title="删除" class="link_icon">&#100;</a>
        </td>
       </tr>
       <tr>
        <td class="center"><img src="../../static/upload/goods02.jpg" width="50" height="50"/></td>
        <td>这里是产品名称</td>
        <td class="center">A15902</td>
        <td class="center"><strong class="rmb_icon">59.00</strong></td>
        <td class="center">包</td>
        <td class="center"><a title="是" class="link_icon">&#89;</a></td>
        <td class="center"><a title="否" class="link_icon">&#88;</a></td>
        <td class="center"><a title="是" class="link_icon">&#89;</a></td>
        <td class="center">5559</td>
        <td class="center">
         <a href="http://www.mycodes.net" title="预览" class="link_icon" target="_blank">&#118;</a>
         <a href="HouTaiproduct_detail" title="编辑" class="link_icon">&#101;</a>
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
