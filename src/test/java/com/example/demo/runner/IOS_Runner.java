package com.example.demo.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.mpontoc.picaroon.core.execution.ControlExecution;
import io.github.mpontoc.picaroon.core.execution.Execution;
import io.github.mpontoc.picaroon.core.mobile.Mobile;
import io.github.mpontoc.picaroon.core.utils.Functions;
import io.github.mpontoc.picaroon.core.utils.Prop;


@RunWith(Cucumber.class)

@CucumberOptions(
		
		tags = { " @ios " },
		features = "src/test/resources/features", // local onde estão as features
		glue = { 
				"com.example.demo.steps", // package onde estão os steps
				"com.example.demo.config" // chamada do spring
		}, 
		plugin = { "pretty", // imprime a descrição da feature
				 "json:target/reports/results.json",
				 "html:target/cucumber-reports/runner_ios",
				 "rerun:target/rerun_Android.txt"
				}, 
		monochrome = true, // deixa o console só com fonte cor preta
		dryRun = false, // ao rodar quando true percorre toda automação verificando se faltam passos
		strict = true // quando está true ele falha o cenario inteiro caso estja faltando algum step
)

public class IOS_Runner extends ControlExecution {
	
	@BeforeClass
	
	public static void setUp() {
		Execution.setAppRunner(true);
		System.out.println("GetAppRunner está como " + Execution.getAppRunner());
		Prop.setPropAndSave("browserOrMobile", "mobile");
		Mobile.setPlataforma("ios");
		Mobile.setCapsFileJson("capsIOS.json");
		Mobile.setCapsNameDeviceOrApp("Integration");
		Functions.setPathReport("runner_ios");
		Functions.setDescricaoReport("Test IOS");
		Functions.setupExecution();
	}


}
