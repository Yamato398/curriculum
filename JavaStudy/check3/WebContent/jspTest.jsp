<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/jspTest.css">

</head>
<body>

<%@ include file="header.jsp"%> 
<!-- name、idの入力エリアを作成しなさい -->
<div class = "name1">
<label for="name1">name</label>
<input type="text" name="namae1" id="name1">
</div>

<div class ="name2">
<label for="name2">id</label>
<input type="text" name="namae2" id="name2">
</div>
<%@ include file="footer.jsp"%> 

</body>
</html>