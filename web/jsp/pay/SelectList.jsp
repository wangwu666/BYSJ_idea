<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'SelectList.jsp' starting page</title>
    
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
     <table>
   			<tr><th>员工编号</th><th>员工姓名</th><th>当前月份</th><th>基本工资</th><th>加班费</th>
   			<th>工龄费</th><th>考勤费</th><th>旷工费</th><th>保险费</th><th>实发工资</th>
   			<th>操作</th></tr>
   			
   			<s:forEach items="${list}" var="s">
   				<tr>
   					<td>${s.getId()}</td>
   					<td>${s.getPayEmname()}</td>
   					<td>${s.getPayMonth() }</td>
   					<td>${s.getPayBasemoney()}</td>
   					<td>${s.getPayOvertime()}</td>
   					<td>${s.getPayAge()}</td>
   					<td>${s.getPayCheck()}</td>
   					<td>${s.getPayAbsent()}</td>
   					<td>${s.getPaySafety()}</td>
   					<td>${s.getPay()}</td>
   					<td>	 
   						<a href="deletePay.do?id=${s.id}">删除</a> 	
   					</td>
   				</tr>
   			</s:forEach>
   		</table>
  </body>
</html>
