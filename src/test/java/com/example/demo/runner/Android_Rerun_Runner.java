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
		
		features = "@target/rerun_Android.txt", // local onde estao as features
		glue = { 
						"com.example.demo.steps", // package onde estão os steps
						"com.example.demo.conf" // chamada do spring
				}, 
		plugin = { 
				   "rerun:target/rerun_Android.txt",
				   "pretty", // imprime a descricao da feature
				   "json:target/reports/results.json",
				   "html:target/cucumber-reports/rerun_Android",
				}, 
		monochrome = true, // deixa o console fonte cor preta
		dryRun = false, // ao rodar quando true percorre toda automacao verificando se faltam passos
		strict = true // quando esta true ele falha o cenario inteiro caso esteja faltando algum step
)

public class Android_Rerun_Runner extends BaseTest {
	
	@BeforeClass
	public static void setApp() {
		Functions.apagaLog4j();
		Prop.setPropAndSave("browserOrDevice", "mobile");
		Mobile.setPlataforma("android");
		Mobile.setCapsFileJosn("capsAndroid.json");
		Mobile.setApp("CTAppium");
		Mobile.setDeviceName("emulator-5554");
		Functions.setPathReport("rerun_Android");
		Functions.setDescricaoReport("Test Android");
		Functions.setUp();
		
	}


}
