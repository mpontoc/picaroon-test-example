package com.example.demo.steps;

import static io.github.mpontoc.picaroon.core.drivers.DriverFactory.driver;

import org.junit.Assert;

import io.github.mpontoc.picaroon.core.commands.ActionsCommands;
import io.github.mpontoc.picaroon.core.utils.Log;
import io.github.mpontoc.picaroon.core.utils.Report;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ExampleBrowser_Steps {

/*
	@BeforeStep("@browser")
	public void reportClear(Scenario scenario) {
		ActionsCommands.isFirstRun = true;
		ActionsCommands.setScenario(scenario);
	}

	@AfterStep("@browser")
	public void report(Scenario scenario) {
		ActionsCommands.printScreenAfterStep(scenario);
	}

	@After
	public static void printTimeExecution() {
		if (Prop.getProp("printAfterSteps").equals("false")) {
			ActionsCommands.printScreen();
		}
		Functions.printTimeExecution();
	}
*/
	@Dado("que eu acesse o site {string}")
	public void que_eu_acesse_o_site(String site) {
		
	//	Functions.printInfoExec();
		
		driver.get(site);
		
		Log.log("\n Ex: \n" + "lib/webdriver/linux/chromedriver for linux \n or \n" + "lib/webdriver/linux/chromedriver.exe for windows" );
		
		
	}

	@Quando("serão apresentadas informações do dia")
	public void serão_apresentadas_informações_do_dia() {
		
		
		Report.printReportSlyled(driver.getTitle());
		
		String[] linkEsport = { "Esporte" , "logEsporte" };
		
		ActionsCommands.waitExistClick(linkEsport, 3);
		
		ActionsCommands.waitSeconds(3);
	}

	@Então("estarei atualizado com o que está acontecendo no momento")
	public void estarei_atualizado_com_o_que_está_acontecendo_no_momento() {
		
		Log.log(driver.getTitle());
		
	}

}
