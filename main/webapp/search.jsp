<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 13/08/2018
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Search product</title>--%>
    <%--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"--%>
          <%--integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">--%>
<%--</head>--%>
<%--<body>--%>
<%--<--%>
<%--<div class="container">--%>
    <%--<div class="row">--%>
        <%--<div class="col-2"></div>--%>
        <%--<div class="col-4">--%>
            <%--<form method="post" class="form-group">--%>
                <%--<h1>Search</h1>--%>
            <%--<input type="search" class="form-control ds-input" name="name" placeholder="Search . . . . . ." data-siteurl="http://localhost:8080/categories" spellcheck="false">--%>
            <%--</form>--%>
            <%--<p><a href="/categories">Back to category</a></p>--%>
        <%--</div>--%>
        <%--<div class="col-6"></div>--%>
    <%--</div>--%>
<%--</div>--%>

<%--</body>--%>
<%--</html>--%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<h1 style="text-align: center">Product's Information</h1>
<%--<div class="container">--%>
<div class="row">
    <div class="col-lg-4"></div>
    <div class="col-lg-4">
        <p><a href="/categories">Back to category</a></p>
        <form class="form-group" method="post">
            <table class="table" border="1">
                <tr>
                    <th>Name:</th>
                    <td><input type="text" name="name"></td>
                </tr>
            </table>
            <input type="submit" value="search">
        </form>
    </div>
    <div class="col-lg-4"></div>
</div>
<%--</div>--%>
</body>
</html>