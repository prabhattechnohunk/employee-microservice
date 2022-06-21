package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmpController {
	
	
	@GetMapping("hello")
	
	String giveData(){
		
		return "hiiiiiiiiiiiiii";
	}	
	

}
