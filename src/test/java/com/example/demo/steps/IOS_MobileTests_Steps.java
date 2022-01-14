package com.example.demo.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.example.demo.User;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.github.mpontoc.picaroon.core.commands.ActionsCommands;
import io.github.mpontoc.picaroon.core.commands.MobileCommands;
import io.github.mpontoc.picaroon.core.drivers.DriverFactory;
import io.github.mpontoc.picaroon.core.utils.Log;

public class IOS_MobileTests_Steps {
	
	@Value("${prop.valor:valorDefault}")
	private String prop;
	
	@Autowired
	User user;

	@Dado("que eu estou no device ios")
	public void que_eu_estou_no_device_ios() {
		System.out.println("ïos");
		
		Log.log(prop);
		
		user.setName("Teste");	
		System.out.println(user.getName());
		
		MobileCommands.refreshScreen();
		MobileCommands.changeContextNativeOrWebview("webview");
		
	}

	@Entao("valido o texto")
	public void valido_o_texto() {
		
		String[] testPosicao = { "android" , "ios" };
		
		ActionsCommands.waitExistClick( testPosicao, 3);

		ActionsCommands.waitExistGetText("MpontoCff", 3 , true);
		
		DriverFactory.iosDriver.getKeyboard();

	}

}
