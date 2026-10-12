<%@ page language="java" contentType="text/html" errorPage="error_page.jsp" %>
<html>
<body>
    <h2>JSP Implicit Objects Demonstration</h2>

    <p><b>request:</b> Method = <%= request.getMethod() %>, URI = <%= request.getRequestURI() %></p>
    <p><b>response:</b> Character Encoding = <%= response.getCharacterEncoding() %></p>
    <p><b>session:</b> Session ID = <%= session.getId() %></p>
    <p><b>application:</b> Server Info = <%= application.getServerInfo() %></p>
    <p><b>config:</b> Servlet Name = <%= config.getServletName() %></p>
    <p><b>pageContext:</b> Session Scope ID = <%= pageContext.getSession().getId() %></p>
    <p><b>page:</b> Class = <%= page.getClass().getName() %></p>

    <%
        out.println("<p><b>out:</b> Written using out.println() implicit object.</p>");
    %>

    <p><a href="implicit_objects.jsp?err=1">Trigger exception implicit object demo</a></p>
    <%
        if (request.getParameter("err") != null) {
            int x = 10 / 0;
        }
    %>
</body>
</html>
