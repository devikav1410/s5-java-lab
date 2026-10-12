<%@ page import="java.util.List, Student" %>
<html>
<body>
    <h2>Student CRUD (MVC View)</h2>

    <form action="StudentCRUDController" method="get">
        ID: <input type="text" name="id">
        Name: <input type="text" name="name"><br><br>
        <button type="submit" name="action" value="add">Add</button>
        <button type="submit" name="action" value="update">Update</button>
        <button type="submit" name="action" value="delete">Delete</button>
    </form>

    <h3>Student List</h3>
    <table border="1">
        <tr><th>ID</th><th>Name</th></tr>
        <%
            List<Student> list = (List<Student>) request.getAttribute("students");
            if (list != null) {
                for (Student s : list) {
        %>
        <tr>
            <td><%= s.getId() %></td>
            <td><%= s.getName() %></td>
        </tr>
        <%
                }
            }
        %>
    </table>
</body>
</html>
