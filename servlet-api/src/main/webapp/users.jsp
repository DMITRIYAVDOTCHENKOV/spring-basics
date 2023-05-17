<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>

<table>
    <tr>
        <th>Id</th>
        <th>Username</th>
    </tr>
    <% for (User user : (List<User>) request.getAttribute("users")) { %>
    <tr>
        <td><%= user.getId()%></td>
        <a href="<%= application.getContextPath() + "/user/" + user.getId() %>"><%= user.getUsername() %></a>
    </tr>
    <% } %>
</table>

</body>
</html>