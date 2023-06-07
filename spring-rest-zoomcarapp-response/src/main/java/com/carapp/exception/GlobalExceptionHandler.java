package com.carapp.exception;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.carapp.model.ApiErrors;


@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

//	http://localhost:8080/Car-api/Cars/author?author=Robe   method:post
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message = ex.getMessage();
		List<Object> error = Arrays.asList("This method is not supported ", ex.getSupportedHttpMethods(),
				ex.getMessage());
		headers.add("info", "invalid method");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, status, status.value(), error);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	// instead of json we choose text
	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message = ex.getMessage();
		List<Object> error = Arrays.asList("This media  is not supported ", ex.getContentType() + "Not supported",
				ex.getSupportedMediaTypes());
		headers.add("info", "invalid media type");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, status, status.value(), error);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

//	http://localhost:8080/Car-api/Cars/author?a=Robert
//	instead of author we r passing a                             method:get
	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message = ex.getMessage();
		List<Object> error = Arrays.asList("this request param is missing", ex.getParameterType() + "is expected",
				ex + "is expected");
		headers.add("info", "invalid request param");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, status, status.value(), error);
		return ResponseEntity.status(status).headers(headers).body(errors);

	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message = ex.getMessage();
		List<Object> error = Arrays.asList("Missing path variable", ex.getParameter() + "Not supported",
				ex.getVariableName() + "is expected");
		headers.add("info", "Missing path variable");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, status, status.value(), error);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

//	http://localhost:8080/Car-api/Cars/CarId/tech
//	instead of id we r passing string(tech)           method:get
	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message = ex.getMessage();
		List<Object> error = Arrays.asList("type mismatch", ex.getRequiredType() + "is missing");
		headers.add("info", "type mismatch");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, status, status.value(), error);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	@ExceptionHandler(CarNotFoundException.class)
	public ResponseEntity<Object> handleCarNotFound(CarNotFoundException ex) {
		String message = ex.getMessage();
		List<Object> error = Arrays.asList("Car not available");
		HttpHeaders headers = new HttpHeaders();
		headers.add("info", "Car not found");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, HttpStatus.INTERNAL_SERVER_ERROR,
				HttpStatus.INTERNAL_SERVER_ERROR.value(), error);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body(errors);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleException(Exception ex) {
		String message = ex.getMessage();
		List<Object> error = Arrays.asList("other");
		HttpHeaders headers = new HttpHeaders();
		headers.add("info", "other");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, HttpStatus.INTERNAL_SERVER_ERROR,
				HttpStatus.INTERNAL_SERVER_ERROR.value(), error);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body(errors);
	}

}
