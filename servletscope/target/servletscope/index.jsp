<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<html>
<body>
<h2>Servlet Scope Demo</h2>
<% String userName=request.getParameter("userName");
if(userName!=null){
}%>
UserName is <%=request.getAttribute("userName")%><br>
UserName is <%=session.getAttribute("userName")%><br>
UserName is <%=application.getAttribute("userName")%><br>

<form action="save" method="post">
    Enter the UserName=<input type="text" name="name">
    <input type="submit">
</form>
</body>
</html>
