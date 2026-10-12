<%@ page language="java" contentType="text/html" %>
<%! 
    public void jspInit() {
        System.out.println("jspInit() called: JSP translated and compiled into Servlet class");
    }

    public void jspDestroy() {
        System.out.println("jspDestroy() called: JSP servlet unloaded");
    }
%>
<html>
<body>
    <h2>JSP Life Cycle & Dynamic Student Information</h2>
    <%
        int id = 101;
        String name = "Alice";
        java.util.Date loginTime = new java.util.Date();
    %>
    <p>Student ID: <%= id %></p>
    <p>Student Name: <%= name %></p>
    <p>Current Server Time: <%= loginTime %></p>
</body>
</html>
