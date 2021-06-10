package com.example.demo.dois.conf;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { 
		"com.example.demo.dois.conf", 
		"com.example.demo.dois.*",
		}
		)
//@PropertySource("application.properties")
@EntityScan(basePackages = { 
		"com.example.demo.dois.conf" , 
		"com.example.demo.dois.*", 
		}
		)

public class ConfInit {

}
