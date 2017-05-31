<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.Guitar,java.util.*"%>
<%@ page import="model.GuitarSpec"%>
<jsp:useBean id="Guitarlist" class="model.Guitar" />
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>删除Guitar</title>
</head>
<body>
 
	<table width="640" border="1">
		<tr>
			<td>serialNumber</td>
			<td>price</td>
			<td>builder</td>
			<td>model</td>
			<td>type</td>
			<td>backWood</td>
			<td>topWood</td>
			<td>编辑</td>

		</tr>
		<tr>
			<td>${requestScope.guitar.serialNumber}</td>
			<td>${requestScope.guitar.price}</td>
			<td>${requestScope.guitar.getSpec().builder}</td>
			<td>${requestScope.guitar.getSpec().model}</td>
			<td>${requestScope.guitar.getSpec().type}</td>
			<td>${requestScope.guitar.getSpec().backWood}</td>
			<td>${requestScope.guitar.getSpec().topWood}</td>
			<td><a href="delGuitar?serialNumber=${requestScope.guitar.serialNumber}">删除</a></td>

		</tr>
</table>

</body>
</html>