<%@ page import="Student" %>
<html>
<body>
    <h2>Student Details (MVC View)</h2>
    <%
        Student s = (Student) request.getAttribute("student");
    %>
    <p>ID: <%= s.getId() %></p>
    <p>Name: <%= s.getName() %></p>
</body>
</html>
