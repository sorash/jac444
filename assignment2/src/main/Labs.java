package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Labs 
{
    public Lab[] labs;        // a collection of labs of type array
    public int numberOfLabs;  // number of labs in collection
    private int counter = 0;

    public Labs(int numberOfLabs) 
    {
        this.numberOfLabs = numberOfLabs;
        this.labs = new Lab[numberOfLabs];
    }

    /**
     * Adds devices to a lab's inventory from a data file.
     * @param labName lab to add devices to
     * @param labFileName file name to read devices from
     * @return
     */
    public Lab addDevicesToLab(String labName, String labFileName) 
    {
        Lab lab = buildLabFromFile(labName, labFileName);
        System.out.println("Lab = " + labName + "\n[\n" + lab + "]");
        return lab;
    }

    /**
     * Creates lab data from given data file.
     * @param labName name of lab to be created
     * @param fileName name of data file to read from
     * @return the created lab
     */
    public Lab buildLabFromFile(String labName, String fileName) 
    {
        Lab lab = new Lab(labName);
        MobileDevice md = null;
        String s;

        // read the data file
        try (BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/" + fileName))) 
        {
        	// loop through all lines
            while ((s = br.readLine()) != null) 
            {
            	// split the line by the comma delimiter
            	String[] tokens = s.split(",", -1);
            	
            	// create a new mobile device from the data
            	md = new MobileDevice(tokens[0], Integer.parseInt(tokens[1]));
            	md.setLab(lab);
            	
            	// add the device to the lab
            	lab.addDevice(md);
            }
            
            if(counter < numberOfLabs)
            {
            	labs[counter] = lab;
            	counter++;
            }
        } 
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
        
        return lab;
    }

    /**
     * Checks if any of the labs have the given device.
     * @param md device to look for
     * @return the first lab found with the device given
     * @return null if no labs have the given device
     */
    public Lab isThereDeviceInLabs(MobileDevice md) 
    {  	
        for(Lab lab : labs)
        {
        	if(lab.isThereDevice(md))
        		return lab;
        }
        
        return null;
    }

    /**
     * Finds the first lab that has a device for rent.
     * @param md device to be rented
     * @param requestDate rent request date
     * @param dueDate rent due date
     * @return lab from which device can be rented from
     */
    public Lab rentDeviceAvailable(MobileDevice md, String requestDate, String dueDate) 
    {
        for(Lab lab : labs)
        {
        	if(lab.rentRequest(md, requestDate, dueDate))
        		return lab;
        }
        
        return null;
    }
    
    /**
     * Finds all the labs that contain given device in their inventory.
     * @param md device to look for
     * @return vector of labs that have the device
     */
    public Vector<Lab> findDeviceInAllLabs(MobileDevice md)
    {
    	Vector<Lab> allLabs = new Vector<Lab>();
    	
    	for(int i = 0; i < numberOfLabs; i++)
    	{
    		if(labs[i].isThereDevice(md))
    			allLabs.addElement(labs[i]);
    	}
    	
    	return allLabs;
    }
    
    /**
     * Finds all the labs that given device can be rented from.
     * @param md device to look for
     * @return vector of labs that device can be rented from
     */
    public Vector<Lab> findRentalDeviceInAllLabs(MobileDevice md)
    {
    	Vector<Lab> allLabs = new Vector<Lab>();
    	
    	for(int i = 0; i < numberOfLabs; i++)
    	{
    		if(labs[i].canRent(md))
    			allLabs.addElement(labs[i]);
    	}
    	
    	return allLabs;
    }
}
