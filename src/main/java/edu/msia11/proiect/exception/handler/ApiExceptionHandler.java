//package edu.msia11.proiect.exception.handler;
//
//import edu.msia11.proiect.exception.ApiRequestException;
//import edu.msia11.proiect.exception.data.ApiError;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//import java.time.ZoneId;
//import java.time.ZonedDateTime;
//
//@ControllerAdvice
//public class ApiExceptionHandler {
//
//    @ExceptionHandler(value = {ApiRequestException.class})
//    public ResponseEntity<Object> handleApiRequestException(Exception e) {
//        ApiError apiException = new ApiError(ZonedDateTime.now(ZoneId.of("Z")), HttpStatus.BAD_REQUEST.toString(), e.getMessage());
//        return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
//    }

//    TODO: Creati un DTO ApiExceptionWithCause now in folderul data
//    TODO: Modificat pentru a folosi alta clasa cu numele ApiRequestExceptionWithCause
//    @ExceptionHandler(value = {ApiRequestException.class})
//    public ResponseEntity<Object> handleApiRequestException(Exception e) {
//        ApiException apiException = new ApiException(ZonedDateTime.now(ZoneId.of("Z")), HttpStatus.BAD_REQUEST.toString(), e.getMessage());
//        return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
//    }

