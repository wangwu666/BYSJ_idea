<%@ page import="com.ww.model.Manager"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort() + path + "/";
	//获取manager对象
	Manager manager = (Manager) session.getAttribute("manager");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>首页</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<script type="text/javascript" src="./js/jquery-3.2.1.min.js"></script>
		<script type="text/javascript">
		   	$(document).ready(function() {
		   		//跳转至用户修改页面
			    $("#menu1").click(function() {
			        window.location.href =
			        "./jsp/employee/UpdateManager.jsp?account=${manager.getAccount()}&&password=${manager.getPassword()}";			
			    });	
			    //跳转至首页
			    $("#menu2").click(function() {
			        window.location.href = "./jsp/index.jsp";
			    });	
			    //跳转至员工表显示(指定分页的页数和每页的条数)
			    $("#addEmployee").click(function() {
			        window.location.href = "selectEmployee.do?pageSize=2&curPage=1";
			    });	 
			    //跳转至部门表显示
			    $("#addDepartment").click(function() {
			        window.location.href = "selectDepartment.do";
			    });	
			    //跳转至招聘信息表显示
			    $("#addInvite").click(function() {
			        window.location.href = "selectInvitejob.do?pageSize=6&curPage=1";
			    });
			    //制定薪资信息
			    $("#constituteCompensation").click(function() {
			        window.location.href = "selectPay.do";
			    });
			     //制定奖惩制度
			    $("#constituteDeal").click(function() {
			        window.location.href = "selectCj.do";
			    });
			});
		</script>
	</head>

	<body>
		<center>
		<!-- 首页信息 -->
		<div id=menu>
			<img src="images/top-1.gif" id="menu1" />
			<input type="image" src="images/top-2.gif" id="menu2" />
			<input type="image" src="images/top-3.gif" id="menu3" />
		</div>
		<div id=mainmenu>
			<table height="200px" width="300px">
				<tr>
					<!-- 添加部门信息-->
					<td>
						<input type="image" src="images/addDepartment.gif" id="addDepartment">
					</td>
					<!-- 添加员工 -->
					<td>
						<input type="image" src="images/addEmployee.gif" id="addEmployee">
					</td>
				<tr>
				<tr>
					<!-- 制定薪资信息 -->
					<td>
						<input type="image" src="images/constituteCompensation.gif" id="constituteCompensation">
					</td>
					<!-- 制定奖惩制度 -->
					<td>
						<input type="image" src="images/constituteDeal.gif" id="constituteDeal">
					</td>
				<tr>
				<tr>
					<!-- 制定培训计划 -->
					<td>
						<input type="image" src="images/constituteTrain.gif" id="constituteTrain">
					</td>
					<!-- 添加应聘信息 -->
					<td>
						<input type="image" src="images/addInvite.gif" id="addInvite">
					</td>
				<tr>
			</table>
		</div>
		</center>
	</body>
</html>
<!-- 路径问题 -->

