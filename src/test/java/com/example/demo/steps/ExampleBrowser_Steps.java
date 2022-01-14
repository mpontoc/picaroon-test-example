package com.example.demo.steps;

import static io.github.mpontoc.picaroon.core.drivers.DriverFactory.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.github.mpontoc.picaroon.core.commands.ActionsCommands;
import io.github.mpontoc.picaroon.core.commands.WebCommands;
import io.github.mpontoc.picaroon.core.elements.ElementFunctions;
import io.github.mpontoc.picaroon.core.execution.report.Report;
import io.github.mpontoc.picaroon.core.utils.Functions;
import io.github.mpontoc.picaroon.core.utils.Log;
import org.openqa.selenium.By;

public class ExampleBrowser_Steps {

	@Dado("que eu acesse o site {string}")
	public void que_eu_acesse_o_site(String site) {
		
		driver.get(site);

		ActionsCommands.waitExistClick("//span[text()='Folha']", 3);

		Functions.waitSeconds(2);

		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu");

		WebCommands.waitExistSelectComboBox("//div[@rel-title='Select Country']//select[1]", "Brazil", 3);

		Functions.waitSeconds(2);

		driver.manage().window().maximize();

		WebCommands.scrollUntilWebElement("(//span[text()='Frames And Windows'])[2]");

		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows");

		Functions.waitSeconds(3);

		ActionsCommands.waitExistClick("//a[contains(@class,'button e.g.')]", 3);

		Functions.waitSeconds(3);

		WebCommands.swichNewWindow(1);

		ActionsCommands.waitExistClick("//a[contains(@class,'button e.g.')]", 3);

		WebCommands.swichToLastWindowClosePrevious();

		WebCommands.waitExistClickAndPerformMenuDropDown("//a[@href='https://www.globalsqa.com/free-ebooks/']", "//span[text()='Free Elasticsearch eBooks']", 3);

		Functions.waitSeconds(2);
		
		WebCommands.swichToLastWindow();
		
		ActionsCommands.waitExistClick("dismiss-button", 3);

		Functions.waitSeconds(5);


	}

	@Quando("serão apresentadas informações do dia")
	public void serão_apresentadas_informações_do_dia() {
		
		
		Report.printReportSlyled(driver.getTitle());
		
		String[] linkEsport = { "Esporte" , "logEsporte" };
		
		String[] texto = {"title__element headlineMain__title" , "texto pego"};
		
		ActionsCommands.waitExistGetText(texto, 3);
		
//		ActionsCommands.waitExistClick("Esporte", 3);
		
//		ActionsCommands.waitExist(linkEsport, 3 , true);
		
//		ActionsCommands.waitExistClick(linkEsport, 3);
		
		ActionsCommands.waitSeconds(3);
	}

	@Então("estarei atualizado com o que está acontecendo no momento")
	public void estarei_atualizado_com_o_que_está_acontecendo_no_momento() {
		
		Log.log(driver.getTitle());
		
	}

}
