<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<div class="container">
    <div class="mx-auto">
        <form action="/login" method="post">
            Username:<br>
            <input type="text" name="username" id="username"/><br/><br/>
            Password:<br>
            <input type="password" name="password" id="password"/><br/><br/>
            <input type="submit" value="login"/>
        </form>
    </div>
</div>
</body>
</html>
