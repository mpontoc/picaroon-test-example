# language: pt
@testAppium

Funcionalidade: Validar Fluxos e Elementos CT_Appium test

@validaFormulario
Cenario: Consulta APK Aquino

Dado que eu estou no device
Quando eu abro o app CT_Appium
E entro no formulário
Então preencho os dados 

@validaFormulario 2
Cenario: Consulta APK Aquino

Dado que eu estou no device
Quando eu abro o app CT_Appium
E entro no formulário

@ios
Cenario: Test ios 1 step

Dado que eu estou no device ios

@ios
Cenario: Test ios 2 steps

Dado que eu estou no device ios
Entao valido o texto

