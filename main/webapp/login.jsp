<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 14/08/2018
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<h1 style="text-align: center">Login form</h1>
<div class="container">
    <div class="row">
        <div class="col-4"></div>
        <div class="col-4">
            <%
                Cookie[] listCookie = request.getCookies();
                String user = "";
                String pass = "";
                int count = 0;
                if(listCookie != null){
                    while(count < listCookie.length){
                        if(listCookie[count].getName().equals("user")){
                            user = listCookie[count].getValue();
                        }
                        if(listCookie[count].getName().equals("pass")){
                            pass = listCookie[count].getValue();
                        }
                        count++;
                    }
                }
            %>
            <form action="/login" method="post">
                <div class="form-group">
                    <label>User id</label>
                    <input type="text" class="form-control" name="user"  placeholder="Enter username...">
                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" class="form-control" name="pass" placeholder="Password...">
                </div>
                <div class="form-group form-check">
                    <input type="checkbox" class="form-check-input" name="check" id="exampleCheck1">
                    <label class="form-check-label" for="exampleCheck1">Remember me</label>
                </div>
                <button type="submit" class="btn btn-primary">Login</button>
                <h1>${error}</h1>
            </form>
        </div>
        <div class="col-4"></div>
    </div>
</div>
</body>
</html>
