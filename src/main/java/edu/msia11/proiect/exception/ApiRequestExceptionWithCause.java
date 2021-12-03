package edu.msia11.proiect.exception;

public class ApiRequestExceptionWithCause extends RuntimeException {

    public ApiRequestExceptionWithCause(String message, Throwable cause) {
        super(message, cause);
    }
}