package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import br.com.mpontoc.picaroon.core.commands.ActionsCommands;
import br.com.mpontoc.picaroon.core.utils.BaseTest;
import br.com.mpontoc.picaroon.core.utils.Functions;
import br.com.mpontoc.picaroon.core.utils.Log;
import io.restassured.internal.TestSpecificationImpl;

@SpringBootTest
class PicarronTestProjectApplicationTests {

	@Value("${prop.valor}")
	private String prop;
	
	@Test
	void contextLoads() {
		
		Functions.setPathReport("testPics");
		Functions.setUp();
		
		try {
			System.out.println(prop);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Log.log(prop);
		ActionsCommands.driver.get("https://www.uol.com.br");
		BaseTest.finalizaExecucao();
		
	}

}
