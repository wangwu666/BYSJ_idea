<%@page import="java.io.PrintWriter"%>
<%@page import="com.ww.model.Manager"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/style/a.jsp" flush="true" />
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	//List list = (List)request.getAttribute("list");
	//System.out.println(list.size());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'SelectInvitejobFalse.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<meta charset="utf-8">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<input type="button" name="Submit"
			onclick="javascript:history.back(-1);" value="返回">
	</head>

	<body>
		<table>
			<tr>
				<th>
					编号
				</th>
				<th>
					姓名
				</th>
				<th>
					性别
				</th>
				<th>
					应聘职务
				</th>
				<th>
					文化程度
				</th>
				<th>
					工作经验
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
						${s.getName()}
					</td>
					<td>
						${s.getSex() }
					</td>

					<td>
						${s.getJob()}
					</td>

					<td>
						${s.getTeachschool()}
					</td>
					<td>
						${s.getExperience()}
					</td>
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
									style="width: 36px; height: 20px; border: 1px solid #E8E8E8; background: #EFEFEF; color: #666; text-decoration: none; border-radius: 2px; display: inline-block; text-align: center; font-size: 12px; line-height: 20px;">录用</a>

							</td>
						</s:when>
						<s:when test="${managerlevel==1}">
							<td>
								<a href="updateInvitejob.do?id=${s.id}">录用</a>
							</td>
						</s:when>
						<s:otherwise>请选择登录状态</s:otherwise>
					</s:choose>

				</tr>

			</s:forEach>
		</table>
	</body>
</html>
