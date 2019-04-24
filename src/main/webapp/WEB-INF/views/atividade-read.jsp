<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Atividade - ONG</title>
    </head>
    <body>
        <h1>Atividade</h1>
        <p>Id: ${atividade.id}</p>
        <p>Título: ${atividade.titulo}</p>
        <p>Descrição: ${atividade.descricao}</p>
        <p>Data de Início: ${atividade.dataInicio}</p>
        <p>Data de Fim: ${atividade.dataFim}</p>
        <p>Horas Assistenciais: ${atividade.horasAssistencial}</p>
        <p>Horas Jurídicas: ${atividade.horasJuridica}</p>
        <p>Horas Financeiras: ${atividade.horasFinanceira}</p>
        <p>Horas Executiva: ${atividade.horasExecutiva}</p>
        <br />
        <p><a href="index">Home</a></p>
    </body>
</html>