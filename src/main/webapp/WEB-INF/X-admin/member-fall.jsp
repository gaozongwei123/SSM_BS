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

                <table class="layui-table layui-form">
                    <thead>

                        <tr>
                            <th>属性</th>
                            <th>属性值</th>
                        </tr>
                        <tr>
                            <td>用户id:</td>
                            <td>${user.uid}</td>
                        </tr>
                        <tr>
                            <td>用户昵称:</td>
                            <td>${user.username}</td>
                        </tr>
                        <tr>
                            <td>用户头像:</td>
                            <td><img src="${user.username}"></td>
                        </tr>
                        <tr>
                            <td>用户性别:</td>
                            <td>${user.sex}</td>
                        </tr>
                        <tr>
                            <td>用户姓名:</td>
                            <td>${user.uname}</td>
                        </tr>
                        <tr>
                            <td>用户身份证号:</td>
                            <td>${user.numberid}</td>
                        </tr>
                        <tr>
                            <td>登录密码:</td>
                            <td>${user.password}</td>
                        </tr>
                        <tr>
                            <td>联系方式:</td>
                            <td>${user.tel}</td>
                        </tr>
                        <tr>
                            <td>用户住址</td>
                            <td>${user.addr}</td>
                        </tr>
                        <tr>
                            <td>创建时间:</td>
                            <td>${user.createdate}</td>
                        </tr>

                    </tbody>
                </table>

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
