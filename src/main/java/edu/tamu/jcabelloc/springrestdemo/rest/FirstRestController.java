package edu.tamu.jcabelloc.springrestdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class FirstRestController {
	
	@GetMapping("/hello")
	public String ssayHello() {
		return "Hello World!!!!";
	}

}
