package com.cg.ora.exception;

/**
 * This class is an exception class if mechanic is not found which extends Exception
 */

public class MechanicNotFoundException  extends Exception{
private static final long serialVersionUID = 1L;
    
    public MechanicNotFoundException(String message) {
        super(message);
    }

}
