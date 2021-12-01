<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>상품목록</h2>
	<hr>
	<%
		ArrayList<String> list = new ArrayList<String>();
		list.add("ball1.jpg");
		list.add("ball2.jpg");
		list.add("ball3.jpg");
		list.add("ball4.jpg");
		list.add("ball5.jpg");
		
		for(String data:list){
	%>
		<img src="images/<%=data %>" width="100" height="100">	
	<% 
		}
	%>

</body>
</html>