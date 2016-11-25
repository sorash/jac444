package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper 
{
	/**
	 * Checks whether a date is in the correct format.
	 * @param date date to check
	 * @return true if date was in valid format
	 */
    public static boolean isValidDate(String date) 
    {
        boolean valid = true;

        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        
        try 
        {
            formatter.parse(date);
        } 
        catch (ParseException e) 
        {
            valid = false;
        }
        
        return valid;
    }

    /**
     * Checks if a date is in valid format.
     * @param date date to check
     * @throws DateFormatException if the format of date is invalid
     */
    public static void checkDate(String date) throws DateFormatException 
    {
        if (!Helper.isValidDate(date)) 
        {
            try 
            {
                throw new DateFormatException("Invalid data format " + date + " it should be MM/dd/yyyy");
            }
            catch (DateFormatException e) 
            {
                e.getMessage();
            }
        }
    }

    /**
     * Gets time difference between two dates.
     * @param date1 first date
     * @param date2 second date
     * @return difference of dates in days
     * @throws DateFormatException if the format of one of the dates is invalid
     */
    public static long timeDifference(String date1, String date2) throws DateFormatException 
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        if ( !isValidDate(date1) || !isValidDate(date2)) 
        {
            throw new DateFormatException();
        }

        Date d1 = null;
        Date d2 = null;
        long diffDays = 0;

        try 
        {
            d1 = dateFormat.parse(date1);
            d2 = dateFormat.parse(date2);

            //in milliseconds
            long diff = d2.getTime() - d1.getTime();
            diffDays = diff / (24 * 60 * 60 * 1000);
            return diffDays;

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return diffDays;
    }

    /**
     * Get current time.
     * @return current time
     */
    public static String getCurrentDate() 
    {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        //get current date time with Date()
        Date date = new Date();
        return dateFormat.format(date);
    }

    /**
     * Prints out that a device is available for rent.
     * @param md device to print out
     * @param rentDate rent date to print out
     * @param lab rent due date to print out
     * @return formatted string with "available device" output
     */
    public static String printAvailable(MobileDevice md, String rentDate, Lab lab) 
    {
        return "Device (" + md.deviceName + ", "+ md.valueTag +
        ") is availble at " + rentDate + " from lab: " + lab.labName;
    }

    /**
     * Prints out that a device is unavailable for rent.
     * @param md device to print out
     * @param rentDate rent date to print out
     * @return formatted string with "unavailable device" output
     */
    public static String printUnavailable(MobileDevice md, String rentDate) 
    {
        return "Device " + md + " is not availble for " + rentDate;
    }

    /**
     * Prints out that a device is non-existent in any labs
     * @param md device to print out
     * @return formatted string with "non-existent device" output
     */
    public static String printNonexistent(MobileDevice md) 
    {
        return "Device " + md + " does not exist! ";
    }
}
