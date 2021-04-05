<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, model.entity.UserBean"%>
<%
	List<UserBean> userList = (List)request.getAttribute("userList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>表示します</h2>
<%
	for(UserBean user : userList){
%>
	<%= user.getUserId() %><hr>
	<%= user.getUserName() %><hr>
	<%= user.getPassword() %><hr>
<%
	}
%>
</body>
</html>