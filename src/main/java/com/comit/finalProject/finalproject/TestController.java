package com.comit.finalProject.finalproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String getSomeString() {
		
		TestService service = new TestService(10);
		return "lalal";
	}

}
