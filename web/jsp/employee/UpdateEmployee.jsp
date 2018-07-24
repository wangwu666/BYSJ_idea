<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>员工修改</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<meta http-equiv="description" charset="utf-8">
		<meta charset="utf-8">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->



	</head>
	<%
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int id = Integer.valueOf(request.getParameter("id"));
		//将ISO-8859-1编码设置为utf-8
		String emName = request.getParameter("emName");
		emName = new String(emName.getBytes("ISO-8859-1"), "utf-8");
		String emTypework = request.getParameter("emTypework");
		emTypework = new String(emTypework.getBytes("ISO-8859-1"), "utf-8");
	%>

	<body>
		<form action="updateEployee.do" method="post">
			<center>
				<table height="500px" width="600px" style="border: 1px solid">
					<tr>
						<td>
							编号
							<input type="text" name="id" value="<%=id%>">
						</td>
						<td>
							姓名
							<input type="text" name="emName" value="<%=emName%>">
						</td>
					</tr>
					<tr>
						<td>
							性别
							<input type="radio" name="emSex" value="男">
							男
							<input type="radio" name="emSex" value="女">
							女
						</td>
						<td>
							文化程度
							<select name="emCulture">
								<option value="">
									请选择
								<option value="研究生">
									研究生
								<option value="本科生">
									本科生
								<option value="专科生">
									专科生
							</select>
						</td>
					</tr>
					<tr>
						<td>
							部门名称
							<select name="dtName">
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
							<input type="text" name="emTypeWork" value="<%=emTypework%>">
						</td>

					</tr>
					<tr>
						<td>
							登记时间
							<input type="date" name="emCreatime">
						</td>
						<td>
							<input type="submit" value="提交">
							<input type="reset" value="重置">
							<input type="button" name="Submit"
								onclick="javascript:history.back(-1);" value="返回">
						</td>
					</tr>

				</table>
			</center>
		</form>
	</body>
</html>
