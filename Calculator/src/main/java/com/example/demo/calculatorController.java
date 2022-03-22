package com.example.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculatorController implements ErrorController {

	private calculatorService cs = new calculatorService();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root() {
		return cs.Description();
	}

	@RequestMapping(value = "/addition", method = RequestMethod.GET)
	public Double addition(Double number1, Double number2) {
		return cs.addition(number1, number2);
	}

	@RequestMapping(value = "/subtraction", method = RequestMethod.GET)
	public Double subtraction(Double number1, Double number2) {
		return cs.subtraction(number1, number2);
	}

	@RequestMapping(value = "/multiplication", method = RequestMethod.GET)
	public Double multiplication(Double number1, Double number2) {
		return cs.multiplication(number1, number2);
	}

	@RequestMapping(value = "/division", method = RequestMethod.GET)
	public Double division(Double number1, Double number2) {
		return cs.division(number1, number2);
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
