package com.example.demo.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.example.demo.User;

import br.com.mpontoc.picaroon.core.commands.ActionsCommands;
import br.com.mpontoc.picaroon.core.utils.Log;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

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
		
		
	}

	@Entao("valido o texto")
	public void valido_o_texto() {

		ActionsCommands.waitExistGetText("MpontoCfff", 3 , true);

	}

}
