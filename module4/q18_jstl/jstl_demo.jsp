<%@ page language="java" contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
    <h2>JSTL Standard Tag Library Demo</h2>

    <c:set var="marks" value="75" />
    <p>Student Marks: ${marks}</p>

    <h3>1. c:if Tag</h3>
    <c:if test="${marks >= 50}">
        <p>Result: Passed (Marks >= 50)</p>
    </c:if>

    <h3>2. c:choose, c:when, c:otherwise Tags</h3>
    <c:choose>
        <c:when test="${marks >= 80}">
            <p>Grade: Distinction</p>
        </c:when>
        <c:when test="${marks >= 60}">
            <p>Grade: First Class</p>
        </c:when>
        <c:otherwise>
            <p>Grade: Second Class</p>
        </c:otherwise>
    </c:choose>

    <h3>3. c:forEach Tag (Iteration)</h3>
    <p>Printing numbers 1 to 5:</p>
    <ul>
        <c:forEach var="i" begin="1" end="5">
            <li>Number: ${i}</li>
        </c:forEach>
    </ul>
</body>
</html>
