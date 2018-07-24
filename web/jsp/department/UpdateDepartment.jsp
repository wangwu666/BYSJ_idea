<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>更新部门信息</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
    <center>
			<table height="500px" width="600px" style="border:1px solid">
				<tr>
    				<td>部门编号<input type="text" name="id" ></td>
    				<td>部门名称<input type="text" name="td_name"></td>
    			</tr>
					<tr></tr>
					<tr>
						<td>
						<input type="submit" value="提交">
   						<input type="reset" value="重置">
   						<input type="button" value="返回">
   						</td>
   					</tr>
			</table>
		</center>
  </body>
</html>
