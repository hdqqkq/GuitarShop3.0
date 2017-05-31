<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加Guitar</title>
</head>
<body>
<h3>添加吉他</h3>
	<s:form action="addGuitar">
		<s:textfield name="serialNumber" label="serialNumber" />
		<s:textfield name="price" label="price" />
		<s:textfield name="builder" label="builder" />
		<s:textfield name="model" label="model" />
		<s:textfield name="type" label="type" />
		<s:textfield name="backWood" label="backWood" />
		<s:textfield name="topWood" label="topWood" />
		<tr align="center">
			<td colspan="2"><s:submit value="添加" theme="simple" />
			 <s:reset value="重设" theme="simple" /></td>
		</tr>
</s:form>
</body>
</html>