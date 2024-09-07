package br.com.erudio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.service.ServiceMath;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(path = "api/math/")
public class ControllerMath {
	private final ServiceMath serviceMath;
	

	@GetMapping("sum/{value1}/{value2}")
	public ResponseEntity<?>sum(@PathVariable Double value1,@PathVariable Double value2) {
		return ResponseEntity.ok().body("value : "+serviceMath.sum(value1, value2));
		
	}
	
	@GetMapping("subtraction/{value1}/{value2}")
	public ResponseEntity<?>less(@PathVariable Double value1,@PathVariable Double value2) {
		return ResponseEntity.ok().body("value : "+ serviceMath.subtraction(value1, value2));
		
	}
	
	@GetMapping("multiplication/{value1}/{value2}")
	public ResponseEntity<?>multiplication(@PathVariable Double value1,@PathVariable Double value2) {
		return ResponseEntity.ok().body("value : "+ serviceMath.multiplication(value1, value2));
		
	}
	@GetMapping("division/{value1}/{value2}")
	public ResponseEntity<?>division(@PathVariable Double value1,@PathVariable Double value2) {
		return ResponseEntity.ok().body("value : "+ serviceMath.division(value1, value2));
		
	}
	@GetMapping("squareRoot/{value1}")
	public ResponseEntity<?>division(@PathVariable Double value1) {
		return ResponseEntity.ok().body("value : "+ serviceMath.squareRoot(value1));
		
	}
	@GetMapping("average/{value1}/{value2}/{value3}")
	public ResponseEntity<?>average(@PathVariable Double value1,@PathVariable Double value2,@PathVariable Double value3) {
		return ResponseEntity.ok().body("value : "+ serviceMath.average(value1,value2,value3));
		
	}
	
	public ControllerMath(ServiceMath serviceMath) {
		this.serviceMath = serviceMath;
	}
	
	
}
