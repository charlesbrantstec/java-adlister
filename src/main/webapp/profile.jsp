<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />

<%--TODO: Add a message on your profile page that welcomes the currently logged in user--%>
    <div class="container">
        <h1>Viewing your profile.</h1>
        <h2>Welcome, ${user}!</h2>
    </div>

</body>
</html>
