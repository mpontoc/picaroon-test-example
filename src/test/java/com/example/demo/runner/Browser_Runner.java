package com.example.demo.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.com.mpontoc.picaroon.core.utils.BaseTest;
import br.com.mpontoc.picaroon.core.utils.Functions;
import br.com.mpontoc.picaroon.core.utils.Prop;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		
		tags = { " @browser " },
		features = "src/test/resources/features", // local onde estão as features
		glue = { 
				"com.example.demo.steps", // package onde estão os steps
				"com.example.demo.conf" // chamada do spring
		}, 
		plugin = { "pretty", // imprime a descrição da feature
				 "json:target/reports/results.json",
				 "html:target/cucumber-reports/runner",
				}, 
		monochrome = true, // deixa o console só com fonte cor preta
		dryRun = false, // ao rodar quando true percorre toda automação verificando se faltam passos
		strict = true // quando está true ele falha o cenario inteiro caso estja faltando algum step
)

public class Browser_Runner extends BaseTest {
	
	@BeforeClass
	
	public static void setUp() {
		Functions.apagaLog4j();
		Prop.setPropAndSave("browserOrDevice", "chrome");
		Functions.setPathReport("runner");
		Functions.setDescricaoReport("Test Browser");
		Functions.setUp();
		
	}


}