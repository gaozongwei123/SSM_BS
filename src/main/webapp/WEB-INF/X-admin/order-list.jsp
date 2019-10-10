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
                <i class="layui-icon">&#xe68e;</i>我的桌面</li></ul>
        <div class="layui-unselect layui-form-select layui-form-selected" id="tab_right">
            <dl>
                <dd data-type="this">关闭当前</dd>
                <dd data-type="other">关闭其它</dd>
                <dd data-type="all">关闭全部</dd></dl>
        </div>
        <!--huan-->
        <div class="layui-fluid">
            <div class="layui-row layui-col-space15">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-body ">
                            <form class="layui-form layui-col-space5">
                                <div class="layui-input-inline layui-show-xs-block">
                                    <input class="layui-input" placeholder="开始日" name="start" id="start"></div>
                                <div class="layui-input-inline layui-show-xs-block">
                                    <input class="layui-input" placeholder="截止日" name="end" id="end"></div>
                                <div class="layui-input-inline layui-show-xs-block">
                                    <select name="contrller">
                                        <option>支付方式</option>
                                        <option>支付宝</option>
                                        <option>微信</option>
                                        <option>货到付款</option></select>
                                </div>
                                <div class="layui-input-inline layui-show-xs-block">
                                    <select name="contrller">
                                        <option value="">订单状态</option>
                                        <option value="0">待确认</option>
                                        <option value="1">已确认</option>
                                        <option value="2">已收货</option>
                                        <option value="3">已取消</option>
                                        <option value="4">已完成</option>
                                        <option value="5">已作废</option></select>
                                </div>
                                <div class="layui-input-inline layui-show-xs-block">
                                    <input type="text" name="username" placeholder="请输入订单号" autocomplete="off" class="layui-input"></div>
                                <div class="layui-input-inline layui-show-xs-block">
                                    <button class="layui-btn" lay-submit="" lay-filter="sreach">
                                        <i class="layui-icon">&#xe615;</i></button>
                                </div>
                            </form>
                        </div>
                        <div class="layui-card-header">
                            <button class="layui-btn layui-btn-danger" onclick="delAll()">
                                <i class="layui-icon"></i>批量删除</button>
                            <button class="layui-btn">
                                <a href="/order/add">添加</a> </button></div>
                        <div class="layui-card-body ">
                            <table class="layui-table layui-form">
                                <thead>
                                <tr>

                                    <th> <input type="checkbox" name="" lay-skin="primary"></th>

                                    <th>订单编号</th>
                                    <th>收货人</th>
                                    <th>总金额</th>
                                    <th>应付金额</th>
                                    <th>订单状态</th>
                                    <th>支付方式</th>
                                    <th>配送方式</th>
                                    <th>下单时间</th>
                                    <th>操作</th></tr>
                                </thead>
                                <tbody>


                                <c:forEach items="${olist}" var="order">
                                <tr>
                                  <td><input type="checkbox" name="" lay-skin="primary"></td>

                                        <td>${order.orderid}</td>
                                        <td>${order.user.username}</td>
                                        <td>${order.totalprice}</td>
                                        <td>${order.totalprice}</td>
                                        <td>
                                            <c:if test="${order.orderstateid}=0">
                                            未付款
                                        </c:if>
                                            <c:if test="${order.orderstateid}=1">
                                                已付款
                                            </c:if>
                                            <c:if test="${order.orderstateid}=2">
                                            已付款未发货
                                        </c:if>
                                            <c:if test="${order.orderstateid}=4">
                                                已付款已发货
                                            </c:if>





                                        </td>

                                        <td>其他方式</td>

                                        <td>
                                            <c:if test="${order.shipment.mark}=0">
                                                申通快递
                                            </c:if>
                                            <c:if test="${order.shipment.mark}=1">
                                                圆通快递
                                            </c:if>
                                            <c:if test="${order.shipment.mark}=2">
                                                韵达快递
                                            </c:if>
                                            <c:if test="${order.shipment.mark}=3">
                                                顺丰快递
                                            </c:if>
                                            <c:if test="${order.shipment.mark}=2">
                                            百世快递
                                        </c:if>
                                        </td>

                                        <td>${order.orderdate}</td>
                                        <td class="td-manage">


                                            <a title="查看" href="/order/orderbyid/${order.orderid}">
                                                <i class="layui-icon">&#xe615;</i></a>
                                            <a title="编辑" href="/order/orderupdate/${order.orderid}">
                                                <i class="layui-icon">&#xe63c;</i></a>
                                            <a title="删除" href="/order/delete/${order.orderid}">
                                                <i class="layui-icon">&#xe640;</i></a>
                                        </td>
                                    </tr>

                                </c:forEach>


                                </tbody>
                            </table>
                        </div>
                        <div class="layui-card-body ">
                            <div class="page">
                                <div>
                                    <a class="prev" href="">&lt;&lt;</a>
                                    <a class="num" href="">1</a>
                                    <span class="current">2</span>
                                    <a class="num" href="">3</a>
                                    <a class="num" href="">489</a>
                                    <a class="next" href="">&gt;&gt;</a></div>
                            </div>
                        </div>
                    </div>
                </div>
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