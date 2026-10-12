<%@ page language="java" contentType="text/html" import="StudentBean" %>
<html>
<body>
    <h2>JSP Expression Language (EL) Demo</h2>

    <%
        request.setAttribute("student", new StudentBean(101, "Alice"));
        session.setAttribute("user", "AdminUser");
    %>

    <h3>1. Accessing JavaBean Properties</h3>
    <p>Student ID: ${student.id}</p>
    <p>Student Name: ${student.name}</p>

    <h3>2. Accessing Request Parameter</h3>
    <p>Department Parameter (?dept=...): ${param.dept}</p>

    <h3>3. Accessing Session Scope</h3>
    <p>Logged In User: ${sessionScope.user}</p>

    <h3>4. EL Arithmetic & Logical Operators</h3>
    <p>Calculation 10 + 20 = ${10 + 20}</p>
    <p>Is student empty? ${empty student}</p>
</body>
</html>
