<%--
  Created by IntelliJ IDEA.
  User: charlesbrant-stec
  Date: 9/15/20
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! private String username = ""; %>
<%! private String password = ""; %>

<%
    if (request != null) {
        username = request.getParameter("username");
        password = request.getParameter("password");
        if (username != null && password != null) {
            if (username.equals("admin") && password.equals("password")) {
                response.sendRedirect("profile.jsp");
            } else {
                response.sendRedirect("partials/invalid.jsp");
            }
        }
    }
%>

<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<div>
    <form action="login.jsp" method="post">
        Username:<input type="text" name="username" id="username"/><br/><br/>
        Password:<input type="password" name="password" id="password"/><br/><br/>
        <input type="submit" value="login"/>"
    </form>
</div>
</body>
</html>
