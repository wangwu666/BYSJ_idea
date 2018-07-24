<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>注册</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<%
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String account = request.getParameter("account");
		account=new String(account.getBytes("ISO-8859-1"),"utf-8");
		String password = request.getParameter("password");
		password=new String(password.getBytes("ISO-8859-1"),"utf-8");
		System.out.print(account+"      "+password);
		
	
	 %>
		<style type="text/css">
.divAll {
	width: 800px;
	font-family: '黑体';
	margin: 50px auto;
}

#titles {
	font-weight: bold;
	font-size: 18px;
	height: 50px;
	line-height: 50px;
	background: #FFF9F3;
	text-align: center;
	border: 1px solid #CCC;;
}

#contents {
	margin-top: 20px;
	background: #FFF9F3;
	border: 1px solid #CCC;;
}

#form-itemGroup {
	padding: 10px;
}

#form-itemGroup label {
	display: inline-block;
	width: 100px;
	height: 32px;
	line-height: 32px;
	color: #666;
	text-align: right;
}

#form-itemGroup .userName {
	width: 200px;
	height: 40px;
	line-height: 40px;
	border: 1px solid #CCC;
}

#form-itemGroup .default {
	width: 200px;
	height: 32px;
	line-height: 32px;
	color: #999;
}

#form-itemGroup .error {
	height: 32px;
	line-height: 32px;
	color: #F00;
}

#form-itemGroup .success {
	height: 32px;
	line-height: 32px;
	color: #096;
}

.divBtn {
	margin-top: 20px;
	margin-left: 100px;
	width: 100px;
	height: 32px;
	line-height: 32px;
	background-color: #F93;
	margin-bottom: 10px;
	color: #ffffff;
	font-weight: bold;
	border: none;
}
</style>


	</head>

	<body>

		<div class="divAll">
			<div id="titles">
				用户修改
			</div>
			<div id="contents">
				<h3>
					基本信息
				</h3>
				<hr width="95%" color="#f2f2f2" />
				<form action="updateManager.do" onSubmit="return checkForm()">
					<div id="form-itemGroup">
						<label for="userName">
							账号：
						</label>
						<input type="text" id="userName" class="userName" name="account" 
							onBlur="checkUserName()" oninput="checkUserName()" value="<%=account%>">
						<span class="default" id="nameErr">请输入至少2位的用户名</span>
					</div>
					<div id="form-itemGroup">
						<label for="userConfirmPasword">
							旧密码：
						</label>
						<input type="password" id="oldpassword" class="userName" name="userpassword"
							onBlur="old()" oninput="old()" value="<%=password%>">
						<span class="default" id="oldErr">请再输入旧密码</span>
					</div>
					<div id="form-itemGroup">
						<label for="userPasword">
							密码：
						</label>
						<input type="password" id="userPasword" class="userName" name="password"
							onBlur="checkPassword()" oninput="checkPassword()">
						<span class="default" id="passwordErr">请输入2到8位的密码</span>
					</div>
					<div id="form-itemGroup">
						<label for="userConfirmPasword">
							确认密码：
						</label>
						<input type="password" id="userConfirmPasword" class="userName"
							onBlur="ConfirmPassword()" oninput="ConfirmPassword()">
						<span class="default" id="conPasswordErr">请再输入一遍密码</span>
					
					</div>
					
					<div>
						<button type="submit" class="divBtn">
							保存
						</button>
						<button type="reset" class="divBtn">
							重置
						</button>
						<button type="button"  class="divBtn" id="divBtn">
							返回
						</button>
					</div>
				</form>
			</div>
		</div>
		<!-- 实现跳转 -->
		<script type="text/javascript" src="./js/jquery-3.2.1.min.js"></script>
		<!--  -->
		<script type="text/javascript" src="./jquery-1.11.0.min.js"></script>
		<script type="text/javascript">
			   	$(document).ready(function() {
   		//TODO:处理按钮跳转
   		
	    //跳转至首页
	    $("#divBtn").click(function() {
	        window.location.href = "./jsp/index.jsp";
	    });	
	    
	    
	});
	function checkForm() {
		var nametip = checkUserName();
		var passtip = checkPassword();
		var conpasstip = ConfirmPassword();
		var phonetip = old();
		return nametip && passtip && conpasstip && phonetip;
	}
	//验证用户名      
	function checkUserName() {
		var username = document.getElementById('userName');
		var errname = document.getElementById('nameErr');
		var pattern = /^\w{2,}$/;
		//用户名格式正则表达式：用户名要至少两位   
		if (username.value.length == 0) {
			errname.innerHTML = "用户名不能为空"
			errname.className = "error"
			return false;
		}
		if (!pattern.test(username.value)) {
			errname.innerHTML = "用户名不合规范"
			errname.className = "error"
			return false;
		} else {
			errname.innerHTML = "OK"
			errname.className = "success";
			return true;
		}
	}
	//验证密码    
	function checkPassword() {
		var userpasswd = document.getElementById('userPasword');
		var errPasswd = document.getElementById('passwordErr');
		var pattern = /^\w{2,8}$/;
		//密码要在2-8位   
		if (!pattern.test(userpasswd.value)) {
			errPasswd.innerHTML = "密码不合规范"
			errPasswd.className = "error"
			return false;
		} else {
			errPasswd.innerHTML = "OK"
			errPasswd.className = "success";
			return true;
		}
	}
	//确认密码  
	function ConfirmPassword() {
		var userpasswd = document.getElementById('userPasword');
		var userConPassword = document.getElementById('userConfirmPasword');
		var errConPasswd = document.getElementById('conPasswordErr');
		if ((userpasswd.value) != (userConPassword.value)
				|| userConPassword.value.length == 0) {
			errConPasswd.innerHTML = "上下密码不一致";
			errConPasswd.className = "error";
			return false;
		} else {
			errConPasswd.innerHTML = "OK";
			errConPasswd.className = "success";
			return true;
		}
	}
	//验证旧密码 
	function old() {
		var userphone = document.getElementById('oldpassword');
		var phonrErr = document.getElementById('oldErr');
		var pattern = /^\w{2,}$/;
		//验证手机号正则表达式    
		if (!pattern.test(userphone.value)) {
			phonrErr.innerHTML = "字符不合规范";
			phonrErr.className = "error";
			return false;
		} else {
			phonrErr.innerHTML = "OK";
			phonrErr.className = "success";
			return true;
		}
	}
</script>
	</body>
</html>
