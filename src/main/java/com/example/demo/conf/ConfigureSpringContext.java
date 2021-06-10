package com.example.demo.conf;

import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;

import br.com.mpontoc.picaroon.core.conf.ConfInit;
import io.cucumber.java.Before;

@ContextConfiguration(classes = ConfInit.class, loader = SpringBootContextLoader.class)
public class ConfigureSpringContext {
	@Before
	public void SetupSpringContext() {
		
	}
	
	@Bean
	public void Cornershoop_Objects() {
		
		
	}
}
