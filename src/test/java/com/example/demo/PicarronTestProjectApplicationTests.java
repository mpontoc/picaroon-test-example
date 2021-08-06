package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.mpontoc.picaroon.core.utils.Functions;
import br.com.mpontoc.picaroon.core.utils.Log;

@SpringBootTest
class PicarronTestProjectApplicationTests {

	@Value("${prop.valor:valorDefault}")
	private String prop;
	
	@Autowired
	User user;
	
	@Test
	void contextLoads() {
		
		Functions.setPathReport("testPics");
		Functions.setupExecution();
		
		try {
			System.out.println(prop);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Log.log(prop);
//		ActionsCommands.driver.get("https://www.uol.com.br");
		
//		user.setName("Teste");	
//		System.out.println(user.getName());
		
	}

}
