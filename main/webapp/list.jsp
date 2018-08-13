<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 13/08/2018
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Category</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<h1 style="text-align: center">Category</h1>
<div class="container">
    <div class="row">
        <div class="col-4">
            <form method="post" class="form-group" action="categories?action=search">
                <input type="text" class="form-control ds-input" name="name" placeholder="Search . . . . . .">
            </form>
        </div>
        <div class="col-8"></div>
    </div>
    <div class="row">
        <div class="col-12">
            <form>
                <p><a href="/categories?action=create">Create new product</a></p>
                <table class="table" border="1">
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                    <c:forEach items='${requestScope["show"]}' var="tuan">
                        <tr>
                            <td><a href="/categories?action=view&id=${tuan.getId()}">${tuan.getId()}</a></td>
                            <td>${tuan.getName()}</td>
                            <td><a href="/categories?action=edit&id=${tuan.getId()}">Edit</a></td>
                            <td><a href="/categories?action=delete&id=${tuan.getId()}">Delete</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </form>
        </div>
    </div>
</div>
</body>
</html>
