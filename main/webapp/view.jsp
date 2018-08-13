<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 13/08/2018
  Time: 4:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <form class="form-group">
            <table class="table" border="1">
                <tr>
                    <th>ID:</th>
                    <td><p>${requestScope["view"].getId()}</p></td>
                </tr>
                <tr>
                    <th>Name:</th>
                    <td><p>${requestScope["view"].getName()}</p></td>
                </tr>
            </table>
        </form>
    </div>
    <div class="col-lg-4"></div>
</div>
<%--</div>--%>
</body>
</html>
