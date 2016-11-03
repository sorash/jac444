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
        //TODO
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

        try (BufferedReader br = new BufferedReader(new FileReader("./Root/" + fileName))) 
        {
            while ((s = br.readLine()) != null) 
            {
               //TODO
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
