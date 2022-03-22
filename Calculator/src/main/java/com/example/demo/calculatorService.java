package com.example.demo;

public class calculatorService {

	public Double addition(Double number1, Double number2) {
		Double sum = number1 + number2;
		return sum;
	}

	public String additionDescription() {
		return "Metoden /addition [GET] beräknar addition av två tal och returnerar resultatet";
	}

	public Double subtraction(Double number1, Double number2) {
		Double sum = number1 - number2;
		return sum;
	}

	public String subtractionDescription() {
		return "Metoden /subtraction [GET] beräknar addition av två tal och returnerar resultatet";
	}

	public Double multiplication(Double number1, Double number2) {
		Double sum = number1 * number2;
		return sum;
	}

	public String multiplicationDescription() {
		return "Metoden /multiplication [GET] beräknar addition av två tal och returnerar resultatet";
	}

	public Double division(Double number1, Double number2) {
		Double sum = number1 / number2;
		return sum;
	}

	public String divisionDescription() {
		return "Metoden /division [GET] beräknar addition av två tal och returnerar resultatet";
	}

	public String Description() {
		return additionDescription() + "\r\n" 
				+ subtractionDescription() + "\r\n" 
				+ multiplicationDescription() + "\r\n"
				+ divisionDescription();
	}
}
