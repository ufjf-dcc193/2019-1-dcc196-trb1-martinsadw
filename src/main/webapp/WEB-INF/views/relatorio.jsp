<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Sede ${sede.id} - ONG</title>
    </head>
    <body>
        <h1>Sede ${sede.id}</h1>
        <p>Total de horas assistenciais: ${horasAssistencial}h</p>
        <p>Total de horas jurídicas: ${horasJuridica}h</p>
        <p>Total de horas financeiras: ${horasFinanceira}h</p>
        <p>Total de horas executivas: ${horasExecutiva}h</p>
        <p>Total de horas: ${horasTotal}h</p>
        <br />
        <p><a href="index">Home</a></p>
    </body>
</html>