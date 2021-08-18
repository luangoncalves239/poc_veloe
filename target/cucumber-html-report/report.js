$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/correios.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "POC veloe",
  "description": "",
  "id": "poc-veloe",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Validar o arquivo de envio do processo de liquidacao para o SEC",
  "description": "",
  "id": "poc-veloe;validar-o-arquivo-de-envio-do-processo-de-liquidacao-para-o-sec",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 5,
      "name": "@pocASX"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que estou na home",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "preeencher no campo de busca o valor \"\u003cendereco\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "deve me retorna as informacoes do cep consultado",
  "keyword": "Entao "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "poc-veloe;validar-o-arquivo-de-envio-do-processo-de-liquidacao-para-o-sec;",
  "rows": [
    {
      "cells": [
        "endereco"
      ],
      "line": 12,
      "id": "poc-veloe;validar-o-arquivo-de-envio-do-processo-de-liquidacao-para-o-sec;;1"
    },
    {
      "cells": [
        "06810790"
      ],
      "line": 13,
      "id": "poc-veloe;validar-o-arquivo-de-envio-do-processo-de-liquidacao-para-o-sec;;2"
    },
    {
      "cells": [
        "rua teste"
      ],
      "line": 14,
      "id": "poc-veloe;validar-o-arquivo-de-envio-do-processo-de-liquidacao-para-o-sec;;3"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 13,
  "name": "Validar o arquivo de envio do processo de liquidacao para o SEC",
  "description": "",
  "id": "poc-veloe;validar-o-arquivo-de-envio-do-processo-de-liquidacao-para-o-sec;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 5,
      "name": "@pocASX"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que estou na home",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "preeencher no campo de busca o valor \"06810790\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "deve me retorna as informacoes do cep consultado",
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "Validar o arquivo de envio do processo de liquidacao para o SEC",
  "description": "",
  "id": "poc-veloe;validar-o-arquivo-de-envio-do-processo-de-liquidacao-para-o-sec;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 5,
      "name": "@pocASX"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que estou na home",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "preeencher no campo de busca o valor \"rua teste\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "deve me retorna as informacoes do cep consultado",
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});