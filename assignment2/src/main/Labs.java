package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Labs 
{
    public Lab[] labs;        // a collection of labs of type array
    public int numberOfLabs;  // number of labs in collection

    public Labs(int numberOfLabs) 
    {
        this.numberOfLabs = numberOfLabs;
    }

    public Lab addDevicesToLab(String labName, String labFileName) 
    {
        Lab lab = buildLabFromFile(labName, labFileName);
        System.out.println("Lab = " + labName + "\n[\n" + lab + "]");
        return lab;
    }

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
        } 
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
        
        return lab;
    }

    public Lab isThereDeviceInLabs(MobileDevice md) 
    {
        //TODO
        return null;
    }

    public Lab rentDeviceAvailable(MobileDevice md, String requestDate, String dueDate) 
    {
        Lab foundLab = null;

        //TODO
        return foundLab;
    }
}
