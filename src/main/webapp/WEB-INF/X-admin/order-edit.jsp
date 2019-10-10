<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!doctype html>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>后台登录-X-admin2.2</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="stylesheet" href="css/font.css">
    <link rel="stylesheet" href="css/xadmin.css">
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <base href="<%=basePath%>" >
    <!-- <link rel="stylesheet" href="./css/theme5.css"> -->
    <script src="lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="js/xadmin.js"></script>
    <script src="~/layui-v2.4.5/layui/layui.js"></script>
    <script src="~/layui-v2.4.5/layui/layui.all.js"></script>
    <link href="~/layui-v2.4.5/layui/css/layui.css" rel="stylesheet" />
    <script src="~/layui-v2.4.5/layui/lay/modules/layer.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->




</head>
<body class="index">

<!-- 顶部开始 -->
<%@ include file="top.jsp"%>
<!-- 顶部结束 -->
<!-- 中部开始 -->
<!-- 左侧菜单开始 -->
<%@include file="left.jsp"%>
<!-- 左侧菜单结束 -->
<!-- 右侧主体开始 -->
<div class="page-content">
    <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
        <ul class="layui-tab-title">
            <li class="home">
                <i class="layui-icon">&#x/e68e;</i>我的桌面</li></ul>
        <div class="layui-unselect layui-form-select layui-form-selected" id="tab_right">
            <dl>
                <dd data-type="this">关闭当前</dd>
                <dd data-type="other">关闭其它</dd>
                <dd data-type="all">关闭全部</dd></dl>
        </div>



        <!--huan-->
        <div class="layui-fluid">
            <div class="layui-row">
                <form class="layui-form" action="/order/updates" method="post">

                    <div class="layui-form-item">
                        <label class="layui-form-label">总价</label>
                        <div class="layui-input-block">
                            <input type="text" id="totalprice" value="${order.totalprice}" name="totalprice" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">日期</label>
                            <div class="layui-input-inline">
                                <input type="text" class="layui-input" name="orderdate" id="orderdate" placeholder="yyyy-MM-dd">
                            </div>
                        </div>


                            <div class="layui-input-block">
                                <label class="layui-form-label"><span>订单状态：</span></label>
                                <select name="select_base_cityname" id="orderstateid" lay-filter="select_base_cityname" xm-select="select_base_cityname" xm-select-type="1">
                                    <option value="">${order.orderstateid}</option>
                                    <option value="0">已付款</option>
                                    <option value="1">未付款</option>
                                    <option value="2">已发货</option>
                                    <option value="3">未发货</option>
                                </select>
                            </div>
                                <div class="layui-form-item">
                                    <label  class="layui-form-label"></label>
                                    <button class="layui-btn" type="submit">提交</button></div>
                </form>

            </div>
        </div>

    </div>
</div>
<div class="page-content-bg"></div>
<style id="theme_style"></style>
<!-- 右侧主体结束 -->


<!-- 中部结束 -->

</body>

</html>
