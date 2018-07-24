<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>登录</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<style type="text/css">
			* {
				margin: 0px;
				padding: 0px;;
			}
			#backgroud,#login {
				position: absolute;
				top: 50%;
				left: 50%;
				-webkit-transform: translate(-50%, -50%);
				-moz-transform: translate(-50%, -50%);
				-ms-transform: translate(-50%, -50%);
				-o-transform: translate(-50%, -50%);
				transform: translate(-50%, -50%);
				width: 550px;
				heigth: 371px;
			}
			#login {
				margin-top:145px;
				margin-left: 15px; 
			}
		</style>
	</head>

	<body>
		<form action="login.do" method="Post">
			<div id="backgroud">
				<img src="images/managerLand.jpg" />
			</div>
			<div id="login">
				<span>账号：<input type="text" name="account" size=15> </span>
				<span>密码：<input type="password" name="password" size=15> </span>
				<select name="managerlevel">
					<option value="">请选择<option>
					<option value="0">用户</option>
					<option value="1">管理员</option>
				</select>
				<input type="image" src="images/land.gif" />
			</div>
		</form>
	</body>
	
</html>
