package com.example.demo.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.mpontoc.picaroon.core.execution.ControlExecution;
import io.github.mpontoc.picaroon.core.utils.Functions;
import io.github.mpontoc.picaroon.core.utils.Prop;


@RunWith(Cucumber.class)

@CucumberOptions(
		
		tags = { " @browser " },
		features = "src/test/resources/features", // local onde estão as features
		glue = { 
				"com.example.demo.steps", // package onde estão os steps
				"com.example.demo.config" // chamada do spring
		}, 
		plugin = { "pretty", // imprime a descrição da feature
				 "json:target/reports/results.json",
				 "html:target/cucumber-reports/runner",
				}, 
		monochrome = true, // deixa o console só com fonte cor preta
		dryRun = false, // ao rodar quando true percorre toda automação verificando se faltam passos
		strict = true // quando está true ele falha o cenario inteiro caso estja faltando algum step
)

public class Browser_Runner extends ControlExecution {
	
	@BeforeClass
	public static void setUp() {
		Prop.setPropAndSave("browserOrMobile", "chrome");
		Functions.setPathReport("runner");
		Functions.setDescricaoReport("Test Browser");
		Functions.setupExecution();
		
	}


}
