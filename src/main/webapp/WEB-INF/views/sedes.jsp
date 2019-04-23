<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Sedes - ONG</title>
        <style>
            table {
                border-spacing: 0;
            }
        </style>
    </head>
    <body>
        <div>
            <h1>Sedes</h1>
            <table border=1>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Estado</th>
                    <th>Cidade</th>
                    <th>Bairro</th>
                    <th>Telefone</th>
                    <th>Site</th>
                </tr>
                <c:forEach items="${sedes}" var="sede">
                    <tr>
                        <td>${sede.id}</td>
                        <td>${sede.nome}</td>
                        <td>${sede.estado}</td>
                        <td>${sede.cidade}</td>
                        <td>${sede.bairro}</td>
                        <td>${sede.telefone}</td>
                        <td><a href="${sede.site}">${sede.site}</a></td>
                        <!-- <td><a href="delete?id=${sede.id}">X</a></td> -->
                    </tr>
                </c:forEach>
            </table>
        </div>
        <br />
        <p><a href="index">Home</a></p>
    </body>
</html>