package com.cg.ora.exception;

/**
 * This class is an exception class if request does not exist which extends Exception
 */

public class RequestNotFoundException extends RuntimeException{
private static final long serialVersionUID = 1L;
    
    public RequestNotFoundException(String message) {
        super(message);
    }
}
