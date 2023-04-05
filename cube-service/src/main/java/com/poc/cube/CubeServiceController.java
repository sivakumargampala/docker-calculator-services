package com.poc.cube;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CubeServiceController {
	
	@GetMapping("/cube/{inputNum}")
	public double cubeOfNum(@PathVariable double inputNum)
	{
		
		System.out.println("Received number is " + inputNum);
		double result = Math.pow(inputNum, 3);
		System.out.println("Cube of a given number " + inputNum + " is " + result);
		return result;
		
	}

}
