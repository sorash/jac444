package main;

/**
 * Exception thrown when due date is before rent request date.
 * @author Ashrafi 030
 */
@SuppressWarnings("serial")
public class RentPeriodException extends Exception 
{    
    public RentPeriodException() { }
    
    public RentPeriodException(String message) 
    {
        super(message);
    }
}
