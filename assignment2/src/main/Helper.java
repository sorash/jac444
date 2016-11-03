package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper 
{
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

    public static String getCurrentDate() 
    {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        //get current date time with Date()
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String printAvailable(MobileDevice md, String rentDate, Lab lab) 
    {
        return "Device (" + md.deviceName + ", "+ md.valueTag +
        ") is availble at " + rentDate + " from lab: " + lab.labName;
    }

    public static String printUnavailable(MobileDevice md, String rentDate) 
    {
        return "Device " + md + " is not availble for " + rentDate;
    }

    public static String printNonexistent(MobileDevice md) 
    {
        return "Device " + md + " does not exist! ";
    }
}
