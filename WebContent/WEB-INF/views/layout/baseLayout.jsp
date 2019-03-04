<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<div class="container">
		<div style="width: 100%">
			<tiles:insertAttribute name="header" ignore="false" />
		</div>
		<div style="width: 100%;">
			<tiles:insertAttribute name="body" ignore="false" />
		</div>
		<div style="width: 100%">
			<tiles:insertAttribute name="footer" ignore="false" />
		</div>
	</div>
</body>
</html>