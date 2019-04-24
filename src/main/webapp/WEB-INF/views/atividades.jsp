<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Atividades - Sede ${sede.id} - ONG</title>
        <style>
            table {
                border-spacing: 0;
            }
        </style>
    </head>
    <body>
        <div>
            <h1>Atividades - Sede ${sede.id}</h1>
            <p><a href="atividade-create?sedeid=${sede.id}">Cadastrar atividade</a></p>
            <table border=1>
                <tr>
                    <th>ID</th>
                    <th>Título</th>
                    <th>Descrição</th>
                    <th>Data de Início</th>
                    <th>Data de Fim</th>
                    <th>Horas Assistenciais</th>
                    <th>Horas Jurídicas</th>
                    <th>Horas Financeiras</th>
                    <th>Horas Executiva</th>
                    <th>Ações</th>
                </tr>
                <c:forEach items="${atividades}" var="atividade">
                    <tr>
                        <td>${atividade.id}</td>
                        <td>${atividade.titulo}</td>
                        <td>${atividade.descricao}</td>
                        <td>${atividade.dataInicio}</td>
                        <td>${atividade.dataFim}</td>
                        <td>${atividade.horasAssistencial}</td>
                        <td>${atividade.horasJuridica}</td>
                        <td>${atividade.horasFinanceira}</td>
                        <td>${atividade.horasExecutiva}</td>
                        <td><a href="atividade-read?id=${atividade.id}">Ver</a> <a href="atividade-update?id=${atividade.id}">Atualizar</a> <a href="atividade-delete?id=${atividade.id}">Apagar</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <br />
        <p><a href="index">Home</a></p>
    </body>
</html>