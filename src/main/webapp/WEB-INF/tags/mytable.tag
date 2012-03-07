<%@ attribute name="cell1" required="true" type="java.lang.String" description="Text to use in the first cell." %>
<%@ attribute name="cell2" required="false" type="java.lang.String" description="Text to use in the second cell." %>

<table border="1" cellpadding="20">
	<tr>
		<th>Cell1</th>
		<th>Cell2</th>
	</tr>
	<tr>
		<td>${cell1}</td>
		<td>${cell2}</td>
	</tr>
</table>

<a href="/TestMVC/">Back</a>
