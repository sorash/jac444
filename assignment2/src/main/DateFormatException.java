package main;

/**
 * Exception thrown when date format is invalid.
 * @author Ashrafi 030
 */
@SuppressWarnings("serial")
public class DateFormatException extends Exception 
{    
    public DateFormatException() { }
    public DateFormatException(String message) 
    {
        super(message);
    }
}
