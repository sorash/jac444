package main;

import java.util.Iterator;
import java.util.Vector;

public class Lab implements MaxTagValue 
{
    String labName;
    Vector<MobileDevice> devices;

    public Lab(String labName) 
    {
        //TODO
    }

    public void addDevice(MobileDevice md) 
    {
        //TODO
    }

    @Override
    public String toString() 
    {
        String r = "";
        //TODO
        return r;
    }

    //
    public boolean isThereDevice(MobileDevice md) 
    {
        boolean found = false;
        //TODO
        return found;
    }

    public int findMaximumValueTag() 
    {
       //TODO
       return 0;
    }

    @Override
    public boolean equals(Object o) 
    {
        //TODO
        return false;

    }

    @Override
    public int hashCode() 
    {
        int result = labName != null ? labName.hashCode() : 0;
        result = 31 * result + (devices != null ? devices.hashCode() : 0);
        return result;
    }


    public boolean rentRequest(MobileDevice wanted, String requestDate, String dueDate) 
    {
        //TODO
        return true;
    }
}
