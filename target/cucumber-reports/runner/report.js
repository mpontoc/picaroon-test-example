$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/aprenderAppium.feature");
formatter.feature({
  "name": "Validar Fluxos e Elementos CT_Appium test",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@testAppium"
    }
  ]
});
formatter.scenario({
  "name": "Consulta APK Aquino",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@testAppium"
    },
    {
      "name": "@validaFormulario"
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
  "name": "que eu estou no device",
  "keyword": "Dado "
});
formatter.match({
  "location": "MobileTests_Steps.que_eu_estou_no_device()"
});
formatter.write(" Dados da Execução \n Data e hora : 2021-05-22_23:26:07");
formatter.write("\n Running on Windows 10 *** by picaroon framework ***");
formatter.write("\n Plataforma : android");
formatter.write("\n Device : emulator-5554");
formatter.write("\n UDID : emulator-5554");
formatter.write("\n Descrição adicional : Test Android");
formatter.write("Texto obtido [ \u0027Formulário\u0027 ]");
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
  "name": "eu abro o app CT_Appium",
  "keyword": "Quando "
});
formatter.match({
  "location": "MobileTests_Steps.eu_abro_o_app_CT_Appium()"
});
formatter.write("Ação obrigatória com o elemento \u0027//android.widget.FrameLayout\u0027 efetuada com sucesso");
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
  "name": "entro no formulário",
  "keyword": "E "
});
formatter.match({
  "location": "MobileTests_Steps.entro_no_formulário()"
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
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "preencho os dados",
  "keyword": "Então "
});
formatter.match({
  "location": "MobileTests_Steps.preencho_os_dados()"
});
formatter.write("Ação obrigatória com o elemento \u0027Nome\u0027 efetuada com sucesso");
formatter.write("Texto obtido [ \u0027Cleber\u0027 ]");
formatter.write("Ação obrigatória com o elemento \u0027Cleber\u0027 efetuada com sucesso");
formatter.write("Ação obrigatória com o elemento \u0027XBox One\u0027 efetuada com sucesso");
formatter.write("Ação obrigatória com o elemento \u0027Nintendo Switch\u0027 efetuada com sucesso");
formatter.write("Ação obrigatória com o elemento \u0027//android.widget.CheckBox\u0027 efetuada com sucesso");
formatter.write("Ação obrigatória com o elemento \u0027//android.widget.Switch\u0027 efetuada com sucesso");
formatter.result({
  "status": "passed"
});
formatter.write("\n");
formatter.embedding("image/png", "embedded3.png", null);
formatter.write("\n");
formatter.afterstep({
  "status": "passed"
});
formatter.write(" Tempo da Execução : 00:00:17 ");
formatter.after({
  "status": "passed"
});
formatter.write(" Tempo da Execução : 00:00:17 ");
formatter.after({
  "status": "passed"
});
});