package springboot.global.exceptions.handlingg.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionClasss
{
	@ExceptionHandler(value = CustomerNotFoundException.class)
	public ResponseEntity<ApiError> getCustomerData()
	{
		ApiError apiError = new ApiError(400,"Customer Not Found with the givennnnnnn id...", new Date());
		return new ResponseEntity<ApiError>(apiError, HttpStatus.BAD_REQUEST);
	}	
}