package com.example.demo;

public class calculatorService {

	public Double addition(Double number1, Double number2) {
		Double sum = number1 + number2;
		return sum;
	}

	public Double subtraction(Double number1, Double number2) {
		Double sum = number1 - number2;
		return sum;
	}

	public Double multiplication(Double number1, Double number2) {
		Double sum = number1 * number2;
		return sum;
	}

	public Double division(Double number1, Double number2) {
		Double sum = number1 / number2;
		return sum;
	}

	public String Description() {
		return "Metoden /addition [GET] beräknar addition av två tal och returnerar resultatet \r\n"
				+ "Metoden /subtraction [GET] beräknar subtraction av två tal och returnerar resultatet \r\n"
				+ "Metoden /multiplication [GET] beräknar multiplication av två tal och returnerar resultatet  \r\n"
				+ "Metoden /division [GET] beräknar division av två tal och returnerar resultatet \r\n";
	}
}
