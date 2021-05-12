$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Exemple.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
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
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.match({
  "location": "Example_Steps.i_want_to_write_a_step_with_precondition()"
});
formatter.write(" Dados da Execução \n Data e hora : 2021-05-12_13:33:47");
formatter.write("\n Running on Windows 10 *** by picaroon framework ***");
formatter.write("\n Browser : chrome");
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "some other precondition",
  "keyword": "And "
});
formatter.match({
  "location": "Example_Steps.some_other_precondition()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I complete action",
  "keyword": "When "
});
formatter.match({
  "location": "Example_Steps.i_complete_action()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "some other action",
  "keyword": "And "
});
formatter.match({
  "location": "Example_Steps.some_other_action()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "Example_Steps.i_validate_the_outcomes()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "check more outcomes",
  "keyword": "And "
});
formatter.match({
  "location": "Example_Steps.check_more_outcomes()"
});
formatter.result({
  "status": "passed"
});
formatter.write(" Tempo da Execução : 00:00:00 ");
formatter.after({
  "status": "passed"
});
});