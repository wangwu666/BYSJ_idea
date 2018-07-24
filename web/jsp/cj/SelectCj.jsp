<%@page import="com.ww.model.Manager"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 导入去掉超链接的jsp -->
<jsp:include page="/style/a.jsp" flush="true" />
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>奖惩制度</title>
    
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
  	<form action="selectListByCj.do" method="post">
    <!-- 通过奖惩标题查询 -->
    			<input type="text" name="cjTitle">
    			<input type="submit" value="标题查询">
    			<!-- 通过日期查询 -->
    			<input type = "date" name="date">
    			<input type="submit" value="日期查询">
    			
			<a href="jsp/cj/InsertCj.jsp">添加奖惩</a>
			<a href="./jsp/index.jsp">首页</a>
			<table>
				<tr>
					<th>
						奖惩编号
					</th>
					<th>
						奖惩标题
					</th>
					<th>
						奖惩类型
					</th>
					<th>
						奖惩内容
					</th>
					<th>
						奖惩金额
					</th>
					<th>
						奖惩时间
					</th>
					<th>
						操作
					</th>
				</tr>
				<s:forEach items="${list}" var="s">
					<tr>
						<td>
							${s.getId()}
						</td>
						<td>
							${s.getCjTitle()}
						</td>
						<td>
							${s.getCjType()}
						</td>
						<td>
							${s.getCjContent()}
						</td>
						<td>
							${s.getCjMoney()}
						</td>
						<td>
							${s.getCjTime()}
						</td>
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
										style="width: 36px; height: 20px; border: 1px solid #E8E8E8; background: #EFEFEF; color: #666; text-decoration: none; border-radius: 2px; display: inline-block; text-align: center; font-size: 12px; line-height: 20px;">完成</a>

								</td>
							</s:when>
							<s:when test="${managerlevel==1}">
								<td>
									<a href="deleteCj.do?id=${s.id}">完成</a>
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
