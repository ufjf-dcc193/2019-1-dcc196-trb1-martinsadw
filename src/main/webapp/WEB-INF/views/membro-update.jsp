<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Sede - ONG</title>
    </head>
    <body>
        <h1>Sede</h1>
        <form action="membro-update-confirm" method="get">
            <input name="id" type="hidden" value="${membro.id}" />
            <p>Id: ${membro.id}</p>
            <p>Nome: <input name="nome" type="text" value="${membro.nome}" /></p>
            <p>Função: <input name="funcao" type="text" value="${membro.funcao}" /></p>
            <p>E-mail: <input name="email" type="text" value="${membro.email}" /></p>
            <p>Data de Entrada: <input name="dataEntrada" type="date" value="${membro.dataEntrada}" /></p>
            <p>Data de Saída: <input name="dataSaida" type="date" value="${membro.dataSaida}" /></p>
            <button type="submit">Atualizar</button>
        </form>
        <br />
        <p><a href="index">Home</a></p>
    </body>
</html>