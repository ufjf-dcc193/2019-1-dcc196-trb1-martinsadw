<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Membro - ONG</title>
    </head>
    <body>
        <h1>Membro</h1>
        <p>Id: ${membro.id}</p>
        <p>Nome: ${membro.nome}</p>
        <p>Função: ${membro.funcao}</p>
        <p>E-mail: <a href="mailto:${membro.email}">${membro.email}</a></p>
        <p>Data de Entrada: ${membro.dataEntrada}</p>
        <p>Data de Saída: ${membro.dataSaida}</p>
        <br />
        <p><a href="index">Home</a></p>
    </body>
</html>