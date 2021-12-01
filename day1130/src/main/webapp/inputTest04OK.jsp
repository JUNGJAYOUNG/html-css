<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("euc-kr");
	String []bloodtype=request.getParameterValues("bloodtype");
	for(String data:bloodtype){
	%>
		입력한 혈액형은<%=data %>입니다.<br>
	<%
	}
%>
</body>
</html>