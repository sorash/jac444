package main;

import java.util.Vector;

import main.MobileDevice.RentSettings;

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
    	for(MobileDevice device : devices)
    	{
    		if(device.equals(md))
    			return true;
    	}
    	
        return false;
    }

    /**
     * Find the highest value tag from all devies in lab.
     * @return highgest value tag
     */
    public int findMaximumValueTag() 
    {
    	int[] values = new int[devices.size()];
    	
    	for(int i = 0; i < devices.size(); i++)
    		values[i] = devices.get(i).valueTag;
    	
    	return Finder.findMaximumValueTag(values);
    }

    @Override
    public boolean equals(Object other) 
    {
    	if(this == other)
			return true;
		if(other == null)
			return false;
		if(!(other instanceof Lab))
			return false;
		return ((Lab)other).labName.equals(labName) && ((Lab)other).devices.equals(devices);
    }

    @Override
    public int hashCode() 
    {
        int result = labName != null ? labName.hashCode() : 0;
        result = 31 * result + (devices != null ? devices.hashCode() : 0);
        return result;
    }

    /**
     * Tries to rent a device.
     * @param wanted device to rent
     * @param requestDate rent request date
     * @param dueDate rent due date
     * @return true if device was rented
     */
    public boolean rentRequest(MobileDevice wanted, String requestDate, String dueDate) 
    {
    	// check if device is rented and try to rent it
        if(!wanted.isRented(this))
        	return wanted.rentDevice(requestDate, dueDate, this);
        else
        {
        	try 
        	{
				return (Helper.timeDifference(wanted.availableDate(this), requestDate) > 0);
			} 
        	catch (DateFormatException e) 
        	{
        		System.out.println("DateFormatException when requesting rental.");
			}
        }
        
        return false;
    }
    
    /**
     * Checks if a given device can be rented.
     * @param md device to check for
     * @return true if device can be rented
     */
    public boolean canRent(MobileDevice md)
    {
    	for(MobileDevice device : devices)
    	{
    		if(device.equals(md))
    		{
    			if(!md.lab.equals(this))
    				return true;
    		}
    	}
    	
    	return false;
    }
}
