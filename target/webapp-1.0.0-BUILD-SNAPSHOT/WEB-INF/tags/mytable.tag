<%@ attribute name="cell1" required="true" type="java.lang.String" description="Text to use in the first cell." %>
<%@ attribute name="cell2" required="false" type="java.lang.String" description="Text to use in the second cell." %>

<table>
 <tr>
  <td id = "cell1">${cell1}</td>
  <td id = "cell2">${cell2}</td>
 </tr>
</table>
