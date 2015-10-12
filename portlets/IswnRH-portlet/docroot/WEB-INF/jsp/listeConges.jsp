
 
<div id="container">

<div id="demo_jui">
<table id="example" class="display" cellspacing="0" width="100%">
		            <thead>
		                <tr>
		                    <th style="text-align:left;">Name</th>
		                    <th style="text-align:left;">Email</th>
		                    <th style="text-align:left;">Telephone</th>
		                    <th style="text-align:left;">Action</th>
		                </tr>
		            </thead>
		            <tbody>
	<c:forEach items="${contactList}" var="contact">
	<tr>
		<td>${contact.lastname}, ${contact.firstname} </td>
		<td>${contact.email}</td>
		<td>${contact.telephone}</td>
		<td><a href="${deleteContactURL}&contactId=${contact.id}">delete</a></td>
	</tr>
	
	</c:forEach>
	</tbody>	            
		        </table>
		        </div>
 </div>