<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Membros - ONG</title>
        <style>
            table {
                border-spacing: 0;
            }
        </style>
    </head>
    <body>
        <div>
            <h1>Membros</h1>
            <table border=1>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Função</th>
                    <th>E-mail</th>
                    <th>Data de Entrada</th>
                    <th>Data de Saída</th>
                </tr>
                <c:forEach items="${membros}" var="membro">
                    <tr>
                        <td>${membro.id}</td>
                        <td>${membro.nome}</td>
                        <td>${membro.funcao}</td>
                        <td><a href="mailto:${membro.email}">${membro.email}</a></td>
                        <td>${membro.dataEntrada}</td>
                        <td>${membro.dataSaida}</td>
                        <!-- <td><a href="delete?id=${sede.id}">X</a></td> -->
                    </tr>
                </c:forEach>
            </table>
        </div>
        <br />
        <p><a href="index">Home</a></p>
    </body>
</html>