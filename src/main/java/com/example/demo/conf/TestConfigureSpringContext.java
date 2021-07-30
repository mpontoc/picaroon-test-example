package com.example.demo.conf;

import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;

import io.cucumber.java.Before;

@ContextConfiguration(classes = TestConfInitTest.class, loader = SpringBootContextLoader.class)
public class TestConfigureSpringContext {

	@Before
	public void SetupSpringContext() {
		
	}
}
