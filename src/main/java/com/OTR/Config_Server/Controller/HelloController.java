package com.OTR.Config_Server.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	 @GetMapping("/hello")
	    public String hello() {
	        return "Spring Boot DevOps App is Running!";
	    }
}
