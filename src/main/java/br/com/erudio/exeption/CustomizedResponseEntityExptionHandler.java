package br.com.erudio.exeption;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CustomizedResponseEntityExptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public final ResponseEntity<DefaultExeptionModel> MethodArgumentTypeMismatchException(
			MethodArgumentTypeMismatchException ex, WebRequest request) {
		return new ResponseEntity<DefaultExeptionModel>(
				new DefaultExeptionModel("Failed to convert value", ex.getMessage(), new Date(), request.toString()),
				HttpStatus.BAD_REQUEST);
	}

}
