<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Sede - ONG</title>
    </head>
    <body>
        <h1>Sede</h1>
        <p>Id: ${sede.id}</p>
        <p>Nome: ${sede.nome}</p>
        <p>Estado: ${sede.estado}</p>
        <p>Cidade: ${sede.cidade}</p>
        <p>Bairro: ${sede.bairro}</p>
        <p>Telefone: ${sede.telefone}</p>
        <p>Site: <a href="${sede.site}">${sede.site}</a></p>
        <br />
        <p><a href="index">Home</a></p>
    </body>
</html>