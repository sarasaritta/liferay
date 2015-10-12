<%@include file="include.jsp"%>
<portlet:renderURL var="congerViewUrl">
    <portlet:param name="render" value="conger-view" />
</portlet:renderURL>

<portlet:renderURL var="absenceViewUrl">
    <portlet:param name="render" value="absence-view" />
</portlet:renderURL>

<portlet:actionURL var="addContactURL">
<portlet:param name="action" value="add"></portlet:param>
</portlet:actionURL>
<portlet:actionURL var="deleteContactURL">
<portlet:param name="action" value="delete"></portlet:param>
</portlet:actionURL>


<form:form name="conge" modelAttribute="conge" method="post" action="${addContactURL}" >
	<table>
	<tr>
		
		
		<td><input type="date" name="dateDeb"></td>
	</tr>
	<tr>
		
		<td><input type="date" name="dateFin"></td>
	</tr>
	
	<tr>
		<select id="typeConge" name="typeConge">
		   <option value="US">United Stated</option>
		   <option value="CHINA">China</option>
		   <option value="SG">Singapore</option>
		   <option value="MY">Malaysia</option>
		</select>
	
	</tr>
	
	
	
	<tr>
		<td colspan="2">
			<input type="submit" value="<spring:message code="label.addcontact"/>"/>
		</td>
	</tr>
</table>	
</form:form>
<%@include file="listeConges.jsp"%>
</body>
</html>
