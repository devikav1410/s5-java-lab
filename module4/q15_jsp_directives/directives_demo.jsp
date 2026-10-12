<%@ page language="java" contentType="text/html" import="java.util.Date" errorPage="error_page.jsp" %>
<html>
<body>
    <h2>JSP Page Directives Demo</h2>
    <p>Today's Date: <%= new Date() %></p>
    <p><a href="directives_demo.jsp?trigger=error">Click here to trigger errorPage</a></p>

    <%
        if ("error".equals(request.getParameter("trigger"))) {
            int err = 10 / 0;
        }
    %>
</body>
</html>
