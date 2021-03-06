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

		tags = { " @android " }, 
		features = "src/test/resources/features", // local onde estão as features
		glue = { "com.example.demo.steps", // package onde estão os steps
				"com.example.demo.config" // chamada do spring
		}, plugin = { "pretty", // imprime a descrição da feature
				"json:target/reports/results.json", "html:target/cucumber-reports/runner_Android",
				"rerun:target/rerun_Android.txt" }, monochrome = true, // deixa o console só com fonte cor preta
		dryRun = false, // ao rodar quando true percorre toda automação verificando se faltam passos
		strict = true // quando está true ele falha o cenario inteiro caso estja faltando algum step
)

public class Android_Runner extends ControlExecution {

	/*
	 * case start the app by runner may set app on Mobile.setCapsNameDeviceOrApp
	 * example -->> Mobile.setCapsNameDeviceOrApp("CT_Appium")
	 */

	@BeforeClass
	public static void setUp() {
		Functions.apagaLog4j();
		Execution.setAppRunner(true);
		Prop.setPropAndSave("browserOrMobile", "mobile");
		Mobile.setPlataforma("android");
		Mobile.setCapsFileJson("capsAndroid.json");
		Mobile.setCapsNameDeviceOrApp("CT_Appium_Samsung");;
		Functions.setPathReport("runner_Android");
		Functions.setDescricaoReport("Test Android");
		Functions.setupExecution();
	}

}
