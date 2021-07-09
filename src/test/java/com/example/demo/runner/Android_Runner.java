package com.example.demo.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.com.mpontoc.picaroon.core.mobile.Mobile;
import br.com.mpontoc.picaroon.core.utils.BaseTest;
import br.com.mpontoc.picaroon.core.utils.Functions;
import br.com.mpontoc.picaroon.core.utils.Prop;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		
		tags = { " @testAppium " },
		features = "src/test/resources/features", // local onde estão as features
		glue = { 
				"com.example.demo.steps", // package onde estão os steps
				"com.example.demo.conf" // chamada do spring
		}, 
		plugin = { "pretty", // imprime a descrição da feature
				 "json:target/reports/results.json",
				 "html:target/cucumber-reports/runner_Android",
				 "rerun:target/rerun_Android.txt"
				}, 
		monochrome = true, // deixa o console só com fonte cor preta
		dryRun = false, // ao rodar quando true percorre toda automação verificando se faltam passos
		strict = true // quando está true ele falha o cenario inteiro caso estja faltando algum step
)

public class Android_Runner extends BaseTest {
	
	@BeforeClass
	
	public static void setUp() {
		Functions.apagaLog4j();
		Functions.setAppRunner(true);
		Prop.setPropAndSave("browserOrDevice", "mobile");
		Mobile.setPlataforma("android");
		Mobile.setCapsFileJson("capsAndroid.json");
		Mobile.setCapsNameDeviceOrApp("Calculator");
		Functions.setPathReport("runner_Android");
		Functions.setDescricaoReport("Test Android");
		Functions.setUp();
	}


}
