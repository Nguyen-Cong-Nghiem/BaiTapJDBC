<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 13/08/2018
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<h1 style="text-align: center">Delete product</h1>
<%--<div class="container">--%>
<div class="row">
    <div class="col-lg-4"></div>
    <div class="col-lg-4">
        <p><a href="/categories">Back to category</a></p>
        <form method="post" class="form-group">
            <table class="table" border="1">
                <tr>
                    <th>ID:</th>
                    <td><p>${requestScope["delete"].getId()}</p></td>
                </tr>
                <tr>
                    <th>Name:</th>
                    <td><p>${requestScope["delete"].getName()}</p></td>
                </tr>
            </table>
            <h4>Are you sure? </h4>
            <button class="btn btn-dark" type="submit">Delete</button>
        </form>
    </div>
    <div class="col-lg-4"></div>
</div>
<%--</div>--%>
</body>
</html>
