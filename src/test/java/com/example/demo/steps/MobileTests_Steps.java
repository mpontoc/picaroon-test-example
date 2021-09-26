package com.example.demo.steps;

import static br.com.mpontoc.picaroon.core.commands.ActionsCommands.waitExistClick;
import static br.com.mpontoc.picaroon.core.commands.ActionsCommands.waitExistGetText;
import static br.com.mpontoc.picaroon.core.commands.ActionsCommands.waitExistSet;
import static br.com.mpontoc.picaroon.core.commands.ActionsCommands.waitSeconds;

import org.junit.Assert;

import br.com.mpontoc.picaroon.core.commands.ActionsCommands;
import br.com.mpontoc.picaroon.core.commands.MobileCommands;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class MobileTests_Steps {

	private String validaMenu;
	private String validaNome;

	@Dado("^que eu estou no device")
	public void que_eu_estou_no_device() throws Throwable {
		waitSeconds(2);
//    	Functions.printInfoExec();

//    	Mobile.setCapsNameDeviceOrApp("CT_Appium");
//    	ActionsCommands.newApp();  	
//		MobileCommands.pressKeyAndroid("home");
//    	ActionsCommands.waitExistClick("//*[@text='Multi Touch Test']", 3);

//		MobileDriverInit.driverMobile.getCapabilities().getCapability("appName");

//    	MobileCommands.scrollUntilElement(validaMenu);

		validaMenu = ActionsCommands.waitExistGetText("Formulário", 3);
		System.out.println("Texto obtido nos steps " + validaMenu);
		ActionsCommands.waitExistClick("//*[@text='Formulário']", 3);

	}

	@Quando("eu abro o app CT_Appium")
	public void eu_abro_o_app_CT_Appium() throws Throwable {

		if (ActionsCommands.waitExist("//android.widget.FrameLayout", 3, true) == true)
			System.out.println("Estou no app");
		else
			System.out.println("Problema para abrir o app");
	}

	@Quando("entro no formulário")
	public void entro_no_formulário() throws Throwable {
		Assert.assertEquals("Formulário", validaMenu);
	}

	@Entao("preencho os dados")
	public void preencho_os_dados() throws Throwable {

		waitExistSet("Nome", "Cleber", 3, true);
		Thread.sleep(1000);
		validaNome = waitExistGetText("Cleber", 3, true);
		System.out.println(validaNome);
		waitExistClick("XBox One", 3, true);
		Thread.sleep(3000);
		waitExistClick("Nintendo Switch", 3, true);
		waitExistClick("//android.widget.CheckBox", 3, true);
		waitExistClick("//android.widget.Switch", 3, true);
		Assert.assertEquals("Cleber", validaNome);
		waitSeconds(2);
		waitExistClick("06:00", 3);
		waitExistClick("10", 3);
		waitExistClick("20", 3);
		waitExistClick("OK", 2);
		waitExistClick("SALVAR", 3);
	}
}
