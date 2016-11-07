package main;

import java.util.Vector;

public class Lab implements MaxTagValue 
{
    String labName;
    Vector<MobileDevice> devices;

    public Lab(String labName) 
    {
        this.labName = labName;
        devices = new Vector<MobileDevice>();
    }

    /**
     * Adds a device to the list of devices in lab.
     * @param md device to be added to list
     */
    public void addDevice(MobileDevice md) 
    {
        devices.addElement(md);
    }

    @Override
    public String toString() 
    {
        String ret = "";
        
        // loop through all devices and add them to return string
        for(MobileDevice device : devices)
        	ret += ((MobileDevice)device).toString() + '\n';
        
        return ret;
    }

    /**
     * Checks if a device is in the lab.
     * @param md device to check in the list for
     * @return true if the lab has the device
     */
    public boolean isThereDevice(MobileDevice md) 
    {
        return devices.contains(md);
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
