package com.example.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculatorController implements ErrorController{
	
	private calculatorService cs = new calculatorService();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root() {
		return cs.Description();
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public Double addition(Double number1, Double number2) {
		Double sum = cs.addition(number1, number2);
		return sum;
	}

	@RequestMapping(value = "/sub", method = RequestMethod.GET)
	public Double subtraction(Double number1, Double number2) {
		Double sum = cs.subtraction(number1, number2);
		return sum;
	}

	@RequestMapping(value = "/multi", method = RequestMethod.GET)
	public Double multiplication(Double number1, Double number2) {
		Double sum = cs.multiplication(number1, number2);
		return sum;
	}

	@RequestMapping(value = "/div", method = RequestMethod.GET)
	public Double division(Double number1, Double number2) {
		Double sum = cs.division(number1, number2);
		return sum;
	}
	
	private static final String PATH = "/error";

	@RequestMapping(value = PATH, produces = MediaType.TEXT_HTML_VALUE)
	public String error() {
		return "ERROR404";
	}

	public String getErrorPath() {
		
		return PATH;
	}
}
