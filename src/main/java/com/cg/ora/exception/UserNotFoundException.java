package com.cg.ora.exception;

/**
 * This class is an exception class if user is not found which extends Exception
 */
public class UserNotFoundException extends RuntimeException{
private static final long serialVersionUID = 1L;
    
    public UserNotFoundException(String message) {
        super(message);
    }

}
