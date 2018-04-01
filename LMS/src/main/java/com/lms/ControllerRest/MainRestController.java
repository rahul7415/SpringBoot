package com.lms.ControllerRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
	@GetMapping
	public String hello() {
		return "Rahul ";
		
	}

}
