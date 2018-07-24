<%@page import="java.io.PrintWriter"%>
<%@page import="com.ww.model.Manager"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
if (null == session.getAttribute("manager")) {
		response.sendRedirect("session/login.jsp");
		System.out.println("用户未登录");
		return;
	}

	Manager manager = (Manager) session.getAttribute("manager");
	//普通用户
	if ("0".equals(manager.getManagerlevel())) {
		System.out.println("普通用户不能操作此功能！");
		PrintWriter o = response.getWriter();
		//路径：  （.表示当前目录，  ..表示上级目录
		o.println("<script>alert('普通用户不能操作此功能');window.location.href='../../selectCj.do';</script>");
	}
	//管理员
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'InsertCj.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   		<form action="insertCj.do" method="post">
			<center>
				<table height="500px" width="600px" style="border: 1px solid">
					<tr>
						
						<td>
							奖惩标题
							<input type="text" name="cjTitle">
						</td>
						<td>
							奖惩类型
							<input type="text" name="cjType">
						</td>
					</tr>
					<tr>
						
						<td>
							奖惩内容
							<input type="text" name="cjContent">
						</td>
						<td>
							奖惩金额
							<input type="text" name="cjMoney">
						</td>
						
						

					</tr>
					<tr>
						<td>
							奖惩时间
							<input type="date" name="cjTime">
						</td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="提交">
							<input type="reset" value="重置">
							<input type="button" value="返回" id="back">
						</td>
					<tr>
				</table>
			</center>

		</form>
   		
  </body>
  <script type="text/javascript" src="./js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
	$(function() {
		$('#back').click(function() {
			window.location.href = "selectDepartment.do";
		});
	});
</script>
</html>
