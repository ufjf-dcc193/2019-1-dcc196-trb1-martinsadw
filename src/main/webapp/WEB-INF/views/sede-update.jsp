<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Sede - ONG</title>
    </head>
    <body>
        <h1>Sede</h1>
        <form action="sede-update-confirm" method="get">
            <input name="id" type="hidden" value="${sede.id}" />
            <p>Id: ${sede.id}</p>
            <p>Nome: <input name="nome" type="text" value="${sede.nome}" /></p>
            <p>Estado: <input name="estado" type="text" value="${sede.estado}" /></p>
            <p>Cidade: <input name="cidade" type="text" value="${sede.cidade}" /></p>
            <p>Bairro: <input name="bairro" type="text" value="${sede.bairro}" /></p>
            <p>Telefone: <input name="telefone" type="text" value="${sede.telefone}" /></p>
            <p>Site: <input name="site" type="text" value="${sede.site}" /></p>
            <button type="submit">Atualizar</button>
        </form>
        <br />
        <p><a href="index">Home</a></p>
    </body>
</html>