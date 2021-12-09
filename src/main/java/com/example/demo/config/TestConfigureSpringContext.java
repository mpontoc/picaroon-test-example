package com.example.demo.config;

import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;

import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = TestConfigInitTest.class, loader = SpringBootContextLoader.class)
public class TestConfigureSpringContext {

	@Before
	public void SetupSpringContext() {
		
	}
}
