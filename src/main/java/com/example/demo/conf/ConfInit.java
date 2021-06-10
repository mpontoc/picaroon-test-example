package com.example.demo.conf;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.example.demo", "com.example.*", })
//@PropertySource("application.properties")
@EntityScan(basePackages = { "com.example.demo", "com.example.*", })

public class ConfInit {

}
