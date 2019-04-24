<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Atividade - ONG</title>
    </head>
    <body>
        <h1>Atividade</h1>
        <form action="atividade-update-confirm" method="get">
            <input name="id" type="hidden" value="${atividade.id}" />
            <p>Id: ${atividade.id}</p>
            <p>Título: <input name="titulo" type="text" value="${atividade.titulo}" /></p>
            <p>Descrição: <input name="descricao" type="text" value="${atividade.descricao}" /></p>
            <p>Data de Início: <input name="dataInicio" type="date" value="${atividade.dataInicio}" /></p>
            <p>Data de Início: <input name="dataFim" type="date" value="${atividade.dataFim}" /></p>
            <p>Horas Assistenciais: <input name="horasAssistencial" type="text" value="${atividade.horasAssistencial}" /></p>
            <p>Horas Jurídicas: <input name="horasJuridica" type="text" value="${atividade.horasJuridica}" /></p>
            <p>Horas Financeiras: <input name="horasFinanceira" type="text" value="${atividade.horasFinanceira}" /></p>
            <p>Horas Executiva: <input name="horasExecutiva" type="text" value="${atividade.horasExecutiva}" /></p>
            <button type="submit">Atualizar</button>
        </form>
        <br />
        <p><a href="index">Home</a></p>
    </body>
</html>