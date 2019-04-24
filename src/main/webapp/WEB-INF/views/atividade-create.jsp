<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Atividade - Sede ${sede.id} - ONG</title>
    </head>
    <body>
        <h1>Atividade - Sede ${sede.id}</h1>
        <form action="atividade-create-confirm" method="get">
            <input name="sedeid" type="hidden" value="${sede.id}" />
            <p>Título: <input name="titulo" type="text" /></p>
            <p>Descrição: <input name="descricao" type="text" /></p>
            <p>Data de Início: <input name="dataInicio" type="date" /></p>
            <p>Data de Início: <input name="dataFim" type="date" /></p>
            <p>Horas Assistenciais: <input name="horasAssistencial" type="text" /></p>
            <p>Horas Jurídicas: <input name="horasJuridica" type="text" /></p>
            <p>Horas Financeiras: <input name="horasFinanceira" type="text" /></p>
            <p>Horas Executiva: <input name="horasExecutiva" type="text" /></p>
            <button type="submit">Cadastrar</button>
        </form>
        <br />
        <p><a href="index">Home</a></p>
    </body>
</html>