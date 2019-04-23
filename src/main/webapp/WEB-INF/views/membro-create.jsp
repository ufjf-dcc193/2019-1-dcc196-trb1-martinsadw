<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Membro - Sede ${sede.id} - ONG</title>
    </head>
    <body>
        <h1>Membro - Sede ${sede.id}</h1>
        <form action="membro-create-confirm" method="get">
            <input name="sedeid" type="hidden" value="${sede.id}" />
            <p>Nome: <input name="nome" type="text" /></p>
            <p>Função: <input name="funcao" type="text" /></p>
            <p>E-mail: <input name="email" type="text" /></p>
            <p>Data de Entrada: <input name="dataEntrada" type="date" /></p>
            <p>Data de Saída: <input name="dataSaida" type="date" /></p>
            <button type="submit">Cadastrar</button>
        </form>
        <br />
        <p><a href="index">Home</a></p>
    </body>
</html>