<%--
  Created by IntelliJ IDEA.
  User: haol
  Date: 2017/6/16
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="${ctx}/cssjs/bootstrap.min.css">
</head>
<body>
<div class="widget-content">
    <div style="width: 20%; margin: auto; min-width: 300px;">
        <div class="loginInter">
            <form action="${ctx}/user/login" method="post" id="submited">
                <div class="input-group" style="height: 20px; margin-top: 50px">
                    <span class="input-group-addon">请先登录</span>
                </div>
                <div class="input-group" style="margin: 5px">
                    <span class="input-group-addon">用户名</span>
                    <input type="text" class="form-control" placeholder="USERNAME" name="account"  value="${account}">
                </div>
                <div class="input-group" style="margin: 5px">
                    <span class="input-group-addon">密&nbsp;&nbsp;&nbsp;码</span>
                    <input type="password" class="form-control" placeholder="PASSWORD" name="password">
                </div>
                <div class="row text-center" style="margin: 5px" >
                    <button type="type" class="btn btn-default">测试登录</button>
                </div>
                <div class="row text-center" style="margin: 5px" >
                    <a  class="btn btn-primary" href="${ctx}/user/skip">直接跳转</a>
                </div>
                <div class="input-group" style="margin:5px auto;">
                    <p class="bg-info">${error}</p>
                </div>
            </form>
        </div>
    </div>
</div>
<script type="text/javascript" src="${ctx}/cssjs/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
    $(function(){
        $("#submitpro").click(function(){
            var inunm =$("[name=account]").val();
            var inpwd =$("[name=password]").val();
            if(inunm == ""){
                art.dialog.tips('用户名不能为空!!!');
                return false;
            }
            else if(inpwd == ""){
                art.dialog.tips('密码不能为空!!!');
                return false;
            }else{
                $("#submited").submit;
            }
        })
    })

</script>

</body>
</html>
