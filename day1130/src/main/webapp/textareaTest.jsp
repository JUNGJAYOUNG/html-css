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
	String info = request.getParameter("info");
	
	String info2 = info.replace("\n","<br>");
%>
입력한 내용은 다음과 같습니다.<br>
<%=info %><!-- 줄바꿈한걸 화면에서도 출력되게 하려면 \n을 br태그로 전부 바꿔주던가 
					textarea를 readonly로 설정해줘야한다. -->
<%=info2 %>
<textarea name="info" rows="5" cols="60" readonly="readonly"><%=info %></textarea>
</body>
</html>