<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>�����ʾ</title>
</head>
<body>
<h3>��ѯ�����</h3>
	<table width="640" border="1">
		<tr>
			<td>���</td>
			<td>�۸�</td>
			<td>������</td>
			<td>model</td>
			<td>����</td>
			<td>��ľ</td>
			<td>ǰľ</td>
			<td>�༭</td>
			
		</tr>
		<tr>
			<td>${requestScope.guitar.serialNumber}</td>
			<td>${requestScope.guitar.price}</td>
			<td>${requestScope.guitar.getSpec().builder}</td>
			<td>${requestScope.guitar.getSpec().model}</td>
			<td>${requestScope.guitar.getSpec().type}</td>
			<td>${requestScope.guitar.getSpec().backWood}</td>
			<td>${requestScope.guitar.getSpec().topWood}</td>
			<td><a href="deleteGuitar?serialNumber=${requestScope.guitar.serialNumber}">ɾ��</a></td>
			
		</tr>
</table>
</body>
</html>
