<%@ page language="java" contentType="text/html" %>
<html>
<body>
    <jsp:include page="header.jsp" />

    <h2>JSP Standard Actions Demo</h2>

    <jsp:useBean id="student" class="StudentBean" scope="request" />
    <jsp:setProperty name="student" property="id" value="101" />
    <jsp:setProperty name="student" property="name" value="Alice" />

    <p>Student ID: <jsp:getProperty name="student" property="id" /></p>
    <p>Student Name: <jsp:getProperty name="student" property="name" /></p>

    <p><a href="actions_demo.jsp?go=forward">Test &lt;jsp:forward&gt; Action</a></p>

    <%
        if ("forward".equals(request.getParameter("go"))) {
    %>
        <jsp:forward page="forward_target.jsp" />
    <%
        }
    %>
</body>
</html>
