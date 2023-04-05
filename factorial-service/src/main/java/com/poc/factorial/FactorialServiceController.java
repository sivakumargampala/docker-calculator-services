package com.poc.factorial;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class FactorialServiceController {
	
	@GetMapping("/factorial/{inputNum}")
	public int factorialOfNum(@PathVariable int inputNum)
	{
		
		System.out.println("Received number is " + inputNum);
		int result = factorial(inputNum);
		System.out.println("Factorial of a given number " + inputNum + " is " + result);
		return result;
		
	}
	
	public static int factorial(int n)
	 {
	  if (n == 0)
	  return 1;
	   
	  return n*factorial(n-1);
	 }

}
