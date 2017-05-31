<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%> 
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <title>吉他查询</title>
  </head>
     <h3>查询吉他</h3>
<body>
	<s:form action="searchGuitar ">

		<s:textfield name="builder" label="builder" />
		<s:textfield name="model" label="model" />
		<s:textfield name="type" label="type" />
		<s:textfield name="backWood" label="backWood" />
		<s:textfield name="topWood" label="topWood" />
		<tr align="center">
		<td colspan="2"><s:submit value="查询" theme="simple" /> <s:reset value="重设" theme="simple" /></td>
		</tr>
     </s:form>
	
</body>
</html>