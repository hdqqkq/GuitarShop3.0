<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>结果显示</title>
</head>
<body>
<h3>查询结果：</h3>
	<table width="640" border="1">
		<tr>
			<td>编号</td>
			<td>价格</td>
			<td>制造商</td>
			<td>model</td>
			<td>类型</td>
			<td>后木</td>
			<td>前木</td>
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
			<td><a href="deleteGuitar?serialNumber=${requestScope.guitar.serialNumber}">删除</a></td>
			
		</tr>
</table>
</body>
</html>
