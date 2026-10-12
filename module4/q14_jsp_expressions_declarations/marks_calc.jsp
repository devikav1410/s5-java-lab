<%@ page language="java" contentType="text/html" %>
<%! 
    int getTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    double getAverage(int total) {
        return total / 3.0;
    }
%>
<html>
<body>
    <h2>Student Marks Calculation (JSP Declarations & Expressions)</h2>
    <%
        int mark1 = 85;
        int mark2 = 90;
        int mark3 = 78;
        int total = getTotal(mark1, mark2, mark3);
        double avg = getAverage(total);
    %>
    <p>Mark 1: <%= mark1 %></p>
    <p>Mark 2: <%= mark2 %></p>
    <p>Mark 3: <%= mark3 %></p>
    <p><b>Total Marks:</b> <%= total %></p>
    <p><b>Average:</b> <%= String.format("%.2f", avg) %></p>
</body>
</html>
