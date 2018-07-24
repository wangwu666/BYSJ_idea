<%@page import="com.ww.model.Manager"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%> 
<jsp:include page="/style/a.jsp" flush="true" />
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'SelectPay.jsp' starting page</title>
    
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
  <form action="selectList.do" method="post">&nbsp; 
  				<!-- 通过员工姓名查询 -->
    			<input type="text" name="name">
    			<input type="submit" value="员工查询">
    			<!-- 通过日期查询 -->
    			<input type = "date" name="date">
    			<input type="submit" value="日期查询">
    			<a href="./jsp/index.jsp">首页</a>
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
   					<!-- jstl判断管理员和用户登录状态 -->
					<%
						Manager manager = (Manager) session.getAttribute("manager");
					%>
					<s:set var="managerlevel">
						<%=manager.getManagerlevel()%>
					</s:set>
					<s:choose>
						<s:when test="${managerlevel==0}">
							<td>
								<a href="javascript:0;"
									style="width: 36px; height: 20px; border: 1px solid #E8E8E8; background: #EFEFEF; color: #666; text-decoration: none; border-radius: 2px; display: inline-block; text-align: center; font-size: 12px; line-height: 20px;">添加</a>

								<a href="javascript:0;"
									style="width: 36px; height: 20px; border: 1px solid #E8E8E8; background: #EFEFEF; color: #666; text-decoration: none; border-radius: 2px; display: inline-block; text-align: center; font-size: 12px; line-height: 20px;">删除</a>

							</td>
						</s:when>
						<s:when test="${managerlevel==1}">
							<td>	 
   						<a href="deletePay.do?id=${s.id}">删除</a> 
   						<a href="./jsp/pay/InsertPay.jsp">添加</a> 	
   					</td>
						</s:when>
						<s:otherwise>请选择登录状态</s:otherwise>
					</s:choose>
   					
   				</tr>
   			</s:forEach>
   		</table>
   		</form>
  </body>
</html>
