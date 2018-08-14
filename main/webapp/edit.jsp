<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 13/08/2018
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update product</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<h1 style="text-align: center">Edit product</h1>

<%--<div class="container">--%>
<div class="row">
    <div class="col-lg-4"></div>
    <div class="col-lg-4">
        <p><a href="/categories">Back to category</a></p>
        <c:if test='${requestScope["message"]!=null}'>
            <span>${requestScope["message"]}</span>
        </c:if>
        <form method="post" class="form-group">
            <table class="table" border="1">
                <tr>
                    <th>ID:</th>
                    <td><input type="text" name="id" value="${requestScope["edit"].getId()}" class="form-control"></td>
                </tr>
                <tr>
                    <th>Name:</th>
                    <td><input type="text" name="name" value="${requestScope["edit"].getName()}" class="form-control"></td>
                </tr>
            </table>
            <button class="btn btn-dark" type="submit">Edit</button>
        </form>
    </div>
    <div class="col-lg-4"></div>
</div>
<%--</div>--%>
</body>
</html>
