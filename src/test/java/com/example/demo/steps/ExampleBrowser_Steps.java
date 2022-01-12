package com.example.demo.steps;

import static io.github.mpontoc.picaroon.core.drivers.DriverFactory.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.github.mpontoc.picaroon.core.commands.ActionsCommands;
import io.github.mpontoc.picaroon.core.execution.report.Report;
import io.github.mpontoc.picaroon.core.utils.Log;

public class ExampleBrowser_Steps {

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
		
		String[] texto = {"title__element headlineMain__title" , "texto pego"};
		
		ActionsCommands.waitExistGetText(texto, 3);
		
//		ActionsCommands.waitExistClick("Esporte", 3);
		
		ActionsCommands.waitExist(linkEsport, 3 , true);
		
//		ActionsCommands.waitExistClick(linkEsport, 3);
		
		ActionsCommands.waitSeconds(3);
	}

	@Então("estarei atualizado com o que está acontecendo no momento")
	public void estarei_atualizado_com_o_que_está_acontecendo_no_momento() {
		
		Log.log(driver.getTitle());
		
	}

}
