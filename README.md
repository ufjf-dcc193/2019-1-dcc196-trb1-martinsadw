T1 - Projeto ONG
================

Sobre
-----

**Autor:** André Ferreira Martins  
**Matrícula:** 201565010AC  
**Disciplina:** DCC193 - Laboratório de Programação de Sistemas Web II  
**Professor:** Igor Knop  

Descrição
---------

### Objetivo

Uma grande ONG possui uma série de sedes espalhadas por todo o território nacional. Entretanto está tendo dificuldades em acompanhar o crescimento e as atividades desenvolvidas por cada uma de suas sedes.

### Requisitos

Crie um sistema de gestão e acompanhamento para essa ONG sabendo que:
- Cada *Sede* possui um nome fantasia, um estado da federação, uma cidade, um bairro, um telefone de contato e um endereço na web;
- Cada *Sede* possui um registro dos *Membros*, com nome completo, função, e-mail de contato, data de entrada e de saída da função;
- Cada *Sede* desenvolve *Atividades* com um título descritivo, uma descrição textual, uma data de início e fim. Adicionalmente, uma *atividade* possui um total de horas computadas para cada uma das quatro categorias: assistencial, jurídica, financeira e executiva;
- Crie um conjunto de telas para criar, listar, editar e excluir *Sedes*;
- Crie um conjunto de telas para criar, listar, editar e excluir *Membros* de uma *Sede*;
- Crie um conjunto de telas para criar, listar, editar e excluir *Atividades* de uma *Sede*;
- Crie uma listagem que apresenta, por *Sede*, a soma das horas das atividades entre todas as categorias.

### Detalhes adicionais

Utilize o *Spring Boot* com os módulos *Web*, *JPA* e *Derby* para construir a aplicação. Adicione o motor *JSP* e *JSTL* via dependências para criar as views.

O desenvolvimento deve ser feito sob controle de versão, em commits pequenos, bem definidos e planejados antes de serem realizados.


Instalação
----------

1. Instale o *[Visual Studio Code](https://code.visualstudio.com/)*;
1. Faça download da extensão *[Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=Pivotal.vscode-boot-dev-pack)*;
1. Clone o repositório: `git clone https://github.com/ufjf-dcc193/2019-1-dcc196-trb1-martinsadw.git`;
1. Abra o *Spring Boot Dashboard* na barra lateral, clique com o botão direito em `ong` e selecione a opção `Start`;
1. Acesse o *website* em [localhost:8080](http://localhost:8080).