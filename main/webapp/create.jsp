<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 13/08/2018
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<h1 style="text-align: center">Create new product</h1>
<%--<div class="container">--%>
<div class="row">
    <div class="col-lg-4"></div>
    <div class="col-lg-4">
        <p><a href="/categories">Back to category</a></p>
        <c:if test='${requestScope["create"]!=null}'>
            <span>${requestScope["create"]}</span>
        </c:if>
        <form method="post" class="form-group">
            <table class="table" border="1">
                <tr>
                    <th>ID:</th>
                    <td><input type="text" name="id" class="form-control"></td>
                </tr>
                <tr>
                    <th>Name:</th>
                    <td><input type="text" name="name" class="form-control"></td>
                </tr>
            </table>
            <button class="btn btn-dark" type="submit">Create</button>
        </form>
    </div>
    <div class="col-lg-4"></div>
</div>
<%--</div>--%>
</body>
</html>
