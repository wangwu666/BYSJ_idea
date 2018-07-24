<%@page import="com.ww.model.Manager"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 导入去掉超链接的jsp -->
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

		<title>My JSP 'SelectEmployee.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<!-- 分页的布局 -->
		<style type="text/css">
#page {
	margin-left: 450px;
}
</style>

		<a href="./jsp/employee/InsertEmployee.jsp">添加员工</a>
		<a href="./jsp/index.jsp">首页</a>

	</head>

	<body>

		<table id="table">
			<tr>
				<th>
					员工编号
				</th>
				<th>
					姓名
				</th>
				<th>
					性别
				</th>
				<th>
					部门
				</th>
				<th>
					工种
				</th>
				<th>
					学历
				</th>
				<th>
					参加工种时间
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
						${s.getEmName()}
					</td>
					<td>
						${s.getEmSex() }
					</td>
					<!-- 没有值 -->
					<td>
						${s.getDtName()}
					</td>

					<td>
						${s.getEmTypework()}

					</td>
					<td>
						${s.getEmCulture()}
					</td>
					<td>
						${s.getEmCreatime()}
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
									style="width: 36px; height: 20px; border: 1px solid #E8E8E8; background: #EFEFEF; color: #666; text-decoration: none; border-radius: 2px; display: inline-block; text-align: center; font-size: 12px; line-height: 20px;">修改</a>

								<a href="javascript:0;"
									style="width: 36px; height: 20px; border: 1px solid #E8E8E8; background: #EFEFEF; color: #666; text-decoration: none; border-radius: 2px; display: inline-block; text-align: center; font-size: 12px; line-height: 20px;">删除</a>

							</td>
						</s:when>
						<s:when test="${managerlevel==1}">
							<td>
								<a
									href="./jsp/employee/UpdateEmployee.jsp?id=${s.id}&&emName=${s.emName}&&emSex=${s.emSex}&&dtName=
   						${s.dtName}&&emTypework=${s.emTypework}&&emCulture=${s.emCulture}&&emCreatime=${s.emCreatime}">修改</a>
								<a href="deleteEmployee.do?id=${s.id}">删除</a>
						</s:when>
						<s:otherwise>请选择登录状态</s:otherwise>
					</s:choose>
					</td>
				</tr>
			</s:forEach>
		</table>
		<div id="page">
			<s:forEach begin="1" end="${totalPage }" var="i">
				<a href="selectEmployee.do?pageSize=2&curPage=${i}">${i}</a>
			</s:forEach>
		</div>

	</body>
</html>
