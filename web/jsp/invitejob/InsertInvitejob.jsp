<%@page import="java.io.PrintWriter"%>
<%@page import="com.ww.model.Manager"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	if (null == session.getAttribute("manager")) {
		response.sendRedirect("session/login.jsp");
		//System.out.println("用户未登录");
		return;
	}

	Manager manager = (Manager) session.getAttribute("manager");
	//普通用户
	if ("0".equals(manager.getManagerlevel())) {
		//System.out.println("普通用户不能操作此功能！");
		PrintWriter o = response.getWriter();
		//路径：  （.表示当前目录，  ..表示上级目录
		o.println("<script>alert('普通用户不能操作此功能');window.location.href='../../selectInvitejob.do?pageSize=6&curPage=1';</script>");
	}
	//管理员
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'InsertInvitejob.jsp' starting page</title>

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
		<form action="insertInvitejob.do" method="post">
			<center>
				<table height="500px" width="600px" style="border: 1px solid">
					<tr>
						<td>
							招聘编号
							<input type="text" name="id">
						</td>
						<td>
							招聘姓名
							<input type="text" name="name">
						</td>
					</tr>
					<tr>
						<td>
							性别
							<input type="radio" name="sex" value="男">
							男
							<input type="radio" name="sex" value="女">
							女
						</td>
						<td>
							应聘职务
							<input type="text" name="job">
						</td>

					</tr>
					<tr>
						<td>
							文化程度
							<select name="teachschool">
								<option value="">
									请选择
								</option>
								<option value="研究生">
									研究生
								</option>
								<option value=本科生>
									本科生
								</option>
								<option value=专科生>
									专科生
								</option>
							</select>
						</td>
						<td>
							工作经验
							<input type="text" name="experience">
						</td>

					</tr>
					</tr>
					<td>
						<input type="submit" value="提交">
						<input type="reset" value="重置">
						<input type="button" value="返回">
					</td>
					<tr>
				</table>
			</center>

		</form>
	</body>
</html>
