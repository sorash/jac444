package main;

@SuppressWarnings("serial")
public class RentPeriodException extends Exception 
{    
    public RentPeriodException() { }
    
    public RentPeriodException(String message) 
    {
        super(message);
    }
}
