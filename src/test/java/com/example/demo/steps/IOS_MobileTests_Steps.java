package com.example.demo.steps;

import br.com.mpontoc.picaroon.core.commands.ActionsCommands;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class IOS_MobileTests_Steps {

	@Dado("que eu estou no device ios")
	public void que_eu_estou_no_device_ios() {
		System.out.println("ïos");
	}

	@Entao("valido o texto")
	public void valido_o_texto() {

		ActionsCommands.waitExistGetText("MpontoC", 3);

	}

}
