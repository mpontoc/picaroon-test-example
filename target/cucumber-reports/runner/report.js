$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Browser.feature");
formatter.feature({
  "name": "Acessar site",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@browser"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Acessar site \u003csite\u003e",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@browser1"
    }
  ]
});
formatter.step({
  "name": "que eu acesse o site \"\u003csite\u003e\"",
  "keyword": "Dado "
});
formatter.step({
  "name": "serão apresentadas informações do dia",
  "keyword": "Quando "
});
formatter.step({
  "name": "estarei atualizado com o que está acontecendo no momento",
  "keyword": "Então "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "site"
      ]
    },
    {
      "cells": [
        "http://www.uol.com.br"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Acessar site http://www.uol.com.br",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@browser"
    },
    {
      "name": "@browser1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "que eu acesse o site \"http://www.uol.com.br\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "ExampleBrowser_Steps.que_eu_acesse_o_site(String)"
});
formatter.write(" Execution Data \n Date and hour: 2021-06-23_13:38:34");
formatter.write("\n Running on Mac OS X *** by picaroon framework ***");
formatter.write("\n Browser : chrome");
formatter.write("\n More data : Test Browser");
formatter.result({
  "status": "passed"
});
formatter.write("\n");
formatter.embedding("image/png", "embedded0.png", null);
formatter.write("\n");
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "serão apresentadas informações do dia",
  "keyword": "Quando "
});
formatter.match({
  "location": "ExampleBrowser_Steps.serão_apresentadas_informações_do_dia()"
});
formatter.write("UOL - Seu universo online");
formatter.result({
  "status": "passed"
});
formatter.write("\n");
formatter.embedding("image/png", "embedded1.png", null);
formatter.write("\n");
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "estarei atualizado com o que está acontecendo no momento",
  "keyword": "Então "
});
formatter.match({
  "location": "ExampleBrowser_Steps.estarei_atualizado_com_o_que_está_acontecendo_no_momento()"
});
formatter.result({
  "status": "passed"
});
formatter.write("\n");
formatter.embedding("image/png", "embedded2.png", null);
formatter.write("\n");
formatter.afterstep({
  "status": "passed"
});
formatter.write(" Time of execution : 00:00:15 ");
formatter.after({
  "status": "passed"
});
formatter.write(" Time of execution : 00:00:15 ");
formatter.after({
  "status": "passed"
});
});