package br.com.erudio.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class ServiceMath {

	
	public Double sum(Double... values) {
		return Arrays.stream(values).mapToDouble(Double::doubleValue).sum();
	}
	
	public Double subtraction(Double... values) {
		return Arrays.stream(values).mapToDouble(Double::doubleValue).reduce((a,b) -> a-b).orElse(0);
	}

	public Double multiplication(Double... values) {
		return Arrays.stream(values).mapToDouble(Double::doubleValue).reduce((a,b) -> a*b).orElse(0);
	}

	public Double division(Double value1, Double value2) {
		return value1 / value2;
	}
	
	public Double squareRoot(Double value) {
		return Math.sqrt(value);
	}

	public Double average(Double... value) {
		return Arrays.stream(value).mapToDouble(Double::doubleValue).average().orElse(0);
	}
	
	
}
