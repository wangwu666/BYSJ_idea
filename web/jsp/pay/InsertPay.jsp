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

		<title>My JSP 'InsertPay.jsp' starting page</title>

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
		<center>
			<form action="insertPay.do" method="post">
				<table height="500px" width="600px" style="border: 1px solid">
					<tr>
						<td>
							员工编号
							<input type="text" name="id">
						</td>
						<td>
							员工姓名
							<input type="text" name="payEmname">
						</td>
					</tr>

					<tr>
						<td>
							当前月份
							<input type="date" name="payMonth">
						</td>
						<td>
							基本工资
							<input type="text" name="payBasemoney">
						</td>
					</tr>
					<tr>
						<td>
							加班费
							<input type="text" name="payOvertime">
						</td>
						<td>
							工龄费
							<input type="text" name="payAge">
						</td>
					</tr>
					<tr>
						<td>
							考勤费
							<input type="text" name="payCheck">
						</td>
						<td>
							旷工费
							<input type="text" name="payAbsent">
						</td>
					</tr>
					<tr>
						<td>
							保险费
							<input type="text" name="paySafety">
						</td>
					</tr>

				</table>
				<input type="submit" value="提交">
				<input type="reset" value="重置">
				<input type="button" name="Submit"
			onclick="javascript:history.back(-1);" value="返回">
			</form>
		</center>
	</body>
</html>
