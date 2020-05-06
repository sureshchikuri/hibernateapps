<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for WorkStationForm form</title>
	</head>
	<body>
		<html:form action="/workStation">
			extension : <html:text property="extension"/><html:errors property="extension"/><br/>
			floorId : <html:text property="floorId"/><html:errors property="floorId"/><br/>
			description : <html:text property="description"/><html:errors property="description"/><br/>
			workStationId : <html:text property="workStationId"/><html:errors property="workStationId"/><br/>
			type : <html:text property="type"/><html:errors property="type"/><br/>
			zoneId : <html:text property="zoneId"/><html:errors property="zoneId"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>

