<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>



<html>
	<head>
		<title>JSP for WorkStationForm form</title>
		<script type="text/javascript">
	var xmlHttp;
	function getFloorIds(value) {
		if (value != 'select') {
			xmlHttp = new XMLHttpRequest();
			xmlHttp.onreadystatechange = handleResponse;
			xmlHttp.open("GET", "workStationAjax.do?floorId=" + value, true);
			xmlHttp.send(null);
		} else {
			document.getElementById('zoneId').innerHTML = "";
		}
	}

	function handleResponse() {
		if (xmlHttp.readyState == 4) {
			var options = xmlHttp.responseText.split(',');
			var optionsHTML;
			for ( var i = 0; i < options.length; i++) {
				optionsHTML += '<option>' + options[i] + '</option>';
			}
			document.getElementById('zoneId').innerHTML = optionsHTML;
		}
	}
</script>

	</head>
	<body>
		<html:form action="/workStationCreate">

			<table align="center">

				<tr>
					<td>
						<bean:message key="type" />
						:
					</td>
					<td>
						<html:select property="type">
							<option value="0">
								select
							</option>
							<
							<html:optionsCollection name="typeList" label="value" value="key" />
						</html:select>
						<html:errors property="type" />
					</td>
				</tr>
				<tr>
					<td>
						<bean:message key="extension" />
						:

					</td>
					<td>
						<html:text property="extension" />
						<html:errors property="extension" />
					</td>
				</tr>
				<tr>
					<td>
						<bean:message key="description" />
						:
					</td>
					<td>
						<html:text property="description" />
						<html:errors property="description" />
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<bean:message key="floorId" />
						:

					</td>
					<td>
						<html:select property="floorId" onchange="getFloorIds(this.value)">
							<option value="0">
								select
							</option>
							<html:optionsCollection name="floorIdList" label="floor.floorId"
								value="floor.floorId" />
							<html:errors property="floorId" />
						</html:select>
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
						<bean:message key="zoneId" />
						:
					</td>
					<td>
						<html:select property="zoneId" styleId="zoneId">
							<option value="0">
								select
							</option>
						</html:select>
					</td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<html:submit />
						<html:cancel />
					</td>
				</tr>
				<logic:messagesPresent name="status">
				<bean:write name="status"/>
				</logic:messagesPresent>
			</table>
		</html:form>
	</body>
</html>

