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
    
    <title>My JSP 'SelectInvitejobById.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <input type="button" name="Submit"
			onclick="javascript:history.back(-1);" value="返回">
  <!--  通过招聘id详细查询记录 -->
  <body>
    <table>
   			<tr><th>编号</th><th>姓名</th><th>性别</th><th>年龄</th><th>出生日期</th><th>应聘职务</th>
   			<th>专业</th><th>工作经验</th><th>文化程度</th><th>毕业学校</th><th>电话</th><th>地址</th>
   			<th>上班时间</th><th>描述</th><th>状态</th></tr>
   			<s:forEach items="${list}" var="s">
   				<tr>
   				
   					<td>${s.getId()}</td>
   					<td>${s.getName()}</td>
   					<td>${s.getSex() }</td>
   					<td>${s.getAge() }</td>
   					<td>${s.getBorn()}</td>
   					<td>${s.getJob()}</td>
   					<td>${s.getSpecialty()}</td>
   					<td>${s.getExperience()}</td>
   					<td>${s.getTeachschool()}</td>
   					<td>${s.getAfterschool()}</td>
   					<td>${s.getTel()}</td>
   					<td>${s.getAddress()}</td>
   					<td>${s.getCreatetime()}</td>
   					<td>${s.getContent()}</td>
   					<td>${s.getIsstock()}</td>
   					<td>
   					</td>
   				</tr>
   			</s:forEach>
   		</table>
  </body>
</html>
