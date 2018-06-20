package edu.tamu.jcabelloc.springrestdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("edu.tamu.jcabelloc.springrestdemo")
public class AppConfig {
	

}
