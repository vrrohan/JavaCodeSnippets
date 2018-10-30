<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:form action="regis">
	<s:textfield name="person.personName" label = "Username"></s:textfield>
	<s:textfield name="person.emailId" label = "Email id"></s:textfield>
	<s:textfield name="person.age" label="Age"></s:textfield>
	<s:textfield name="person.country" label="Country"></s:textfield>
	<s:submit name="Submit" value="Submit"></s:submit>
</s:form>
</body>
</html>