<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Sede - ONG</title>
    </head>
    <body>
        <h1>Sede</h1>
        <form action="sede-create-confirm" method="get">
            <p>Nome: <input name="nome" type="text" /></p>
            <p>Estado: <input name="estado" type="text" /></p>
            <p>Cidade: <input name="cidade" type="text" /></p>
            <p>Bairro: <input name="bairro" type="text" /></p>
            <p>Telefone: <input name="telefone" type="text" /></p>
            <p>Site: <input name="site" type="text" /></p>
            <button type="submit">Criar</button>
        </form>
        <br />
        <p><a href="index">Home</a></p>
    </body>
</html>