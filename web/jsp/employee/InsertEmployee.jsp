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
		System.out.println("用户未登录");
		return;
	}

	Manager manager = (Manager) session.getAttribute("manager");
	//普通用户
	if ("0".equals(manager.getManagerlevel())) {
		System.out.println("普通用户不能操作此功能！");
		PrintWriter o = response.getWriter();
		//路径：  （.表示当前目录，  ..表示上级目录
		o.println("<script>alert('普通用户不能操作此功能');window.location.href='../../selectEmployee.do?pageSize=2&curPage=1';</script>");
	}
	//管理员
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'InsertEmployee.jsp' starting page</title>

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
		<!-- 表单提交最好用Post -->
		<center>
			<form action="insertEmployee.do" method="post">
				<table height="500px" width="600px" style="border: 1px solid">
					<tr>
						<td>
							编号
							<input type="text" name="emSerialnumber">
						</td>
						<td>
							姓名
							<input type="text" name="emName">
						</td>
					</tr>
					<tr>
						<td>
							婚姻
							<input type="radio" name="emMarriage" value="已婚">
							已婚
							<input type="radio" name="emMarriage" value="未婚">
							未婚
						</td>
						<td>
							性别
							<input type="radio" name="emSex" value="男">
							男
							<input type="radio" name="emSex" value="女">
							女
						</td>
					</tr>
					<tr>
						<td>
							名族
							<input type="text" name="emNation">
						</td>
						<td>
							籍贯
							<input type="text" name="emAncestralhome">
						</td>
					</tr>
					<tr>
						<td>
							专业
							<input type="text" name="emSpeciality">
						</td>
						<td>
							年龄
							<input type="text" name="emAge"">
						</td>
					</tr>
					<tr>
						<td>
							政治面貌
							<input type="radio" name="emVisage" value="党员">
							党员
							<input type="radio" name="emVisage" value="团员">
							团员
							<input type="radio" name="emVisage" value="无">
							无
						</td>
						<td>
							身份证号
							<input type="text" name="emIdcard">
						</td>
					</tr>
					<tr>
						<td>
							联系电话
							<input type="text" name="emTel">
						</td>
						<td>
							家庭住址
							<input type="text" name="emAddress">
						</td>
					</tr>
					<tr>
						<td>
							毕业学校
							<input type="text" name="emAfterschool">
						</td>
						<td>
							出生日期
							<input type="date" name="emBorn">
						</td>
					</tr>
					<tr>
						<td>
							文化程度
							<select name="emCulture">
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
							上岗时间
							<input type="date" name="emStartime">
						</td>
					</tr>
					<tr>
						<td>
							部门名称
							<select name="emDepartmentid">
								<option value="">
									请选择
								<option value="2">
									java web
								<option value="3">
									ASP.net
								<option value="4">
									c#
								<option value="5">
									vc
								<option value="6">
									vb
								<option value="7">
									ASP
								<option value="8">
									PHP
								<option value="9">
									基础部
								<option value="10">
									人力资源
								<option value="11">
									C#部门
							</select>
						</td>
						<td>
							部门工种
							<input type="text" name="emTypework">
						</td>
					</tr>
					<tr>
						<td>
							登记人名
							<input type="text" name="emCreatename">
						</td>
						<td>
							登记时间
							<input type="date" name="emCreatime">
						</td>
					</tr>
				</table>
				备注信息
				<textarea name="emBz" cols="50" rows="3"></textarea>

				<input type="submit" value="提交">
				<input type="reset" value="重置">
				<input type="button" name="Submit"
					onclick="javascript:history.back(-1);" value="返回">
			</form>
		</center>
	</body>
</html>
