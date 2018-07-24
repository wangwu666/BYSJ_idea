<%@page import="com.ww.model.Department"%>
<%@page import="com.ww.model.Manager"%>
<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 导入去掉超链接的jsp -->
<jsp:include page="/style/a.jsp" flush="true" />
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>部门列表</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	</head>

	<body>
		<center>
		<form action="selectDepartmentByName.do">
			<select name="dtName">
				<%
					List<Department> selectList = (List) request.getAttribute("list");					
					for (Department department : selectList){
				%>
				<option value="<%=department.getDtName()%>"><%=department.getDtName()%></option>
				<%
					}
				%>
			</select>
			<input type="submit" value="部门查询">
			<a href="jsp/department/InsertDepartment.jsp">添加部门</a>
			<a href="./jsp/index.jsp">首页</a>
			<br><br>
			<table border="1" style="width:80%">
				<tr>
					<th>
						部门编号
					</th>
					<th>
						部门名称
					</th>
					<th>
						开始时间
					</th>
					<th>
						责任模块
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
							${s.getDtName()}
						</td>
						<td>
							${s.getDtCreatetime() }
						</td>
						<td>
							${s.getDtBz()}
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
										style="width: 36px; height: 20px; border: 1px solid #E8E8E8; background: #EFEFEF; color: #666; text-decoration: none; border-radius: 2px; display: inline-block; text-align: center; font-size: 12px; line-height: 20px;">删除</a>

								</td>
							</s:when>
							<s:when test="${managerlevel==1}">
								<td>
									<a href="deleteDepartment.do?id=${s.id}">删除</a>
								</td>

							</s:when>
							<s:otherwise>请选择登录状态</s:otherwise>
						</s:choose>

					</tr>
				</s:forEach>
			</table>
		</form>
		</center>
	</body>

</html>
