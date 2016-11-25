package main;

public class Assignment_2
{

    public static void main(String[] args) 
    {


        /* TASK 1 - build labs from files - at least two labs */

        System.out.println("\n\n *" + " TASK 1 " + "*");
        Labs labs = new Labs(2);
        System.out.println("Newnham Lab\n-----------");
        labs.addDevicesToLab("Seneca@York", "YorkLab.txt");
        System.out.println();
        System.out.println("York Lab\n--------");
        labs.addDevicesToLab("Newnham", "NewnhamLab.txt");
        
        /* TASK 2 - ask for a device that is not in any lab inventory */

        System.out.println("\n\n *" + " TASK 2 " + "*");
        MobileDevice device = new MobileDevice("Android20", 20);
        Lab lab = labs.isThereDeviceInLabs(device);
        if(lab == null)
        	System.out.println(Helper.printNonexistent(device));

         /* TASK 3 - ask for a device that is in a lab inventory
         *  issue a rent request and print the device
         *  issue the same rent request and print the device
         *  return the device
         *  issue the rent request with new dates and print the device
         */
        System.out.println("\n\n *" + " TASK 3 " + "*");
        device = new MobileDevice("Android", 25);
        String rentDate = "11/09/2016", dueDate = "11/11/2016";
        
        lab = labs.rentDeviceAvailable(device, rentDate, dueDate);
        if(lab != null)
        {
        	System.out.println(Helper.printAvailable(device, rentDate, lab));
            device.rentDevice(rentDate, dueDate, lab);
            System.out.println("wanted = " + device);
        }
        else
        	System.out.println(Helper.printUnavailable(device, rentDate));        
        
        lab = labs.rentDeviceAvailable(device, rentDate, dueDate);
        if(lab != null)
        {
        	System.out.println(Helper.printAvailable(device, rentDate, lab));
            device.rentDevice(rentDate, dueDate, lab);
            System.out.println("wanted = " + device);
            device.returnDevice(lab);
        }
        else
        	System.out.println(Helper.printUnavailable(device, rentDate));
        
        rentDate = "11/12/2016";
        dueDate = "11/14/2016";
        lab = labs.rentDeviceAvailable(device, rentDate, dueDate);
        if(lab != null)
        {
        	System.out.println(Helper.printAvailable(device, rentDate, lab));
            device.rentDevice(rentDate, dueDate, lab);
            System.out.println("wanted = " + device);
        }
        else
        	System.out.println(Helper.printUnavailable(device, rentDate));
        
         /* TASK 4 - ask for the same device in all labs
          * if you can find a lab, rent the device from that lab
          */
        //TODO

        /* TASK 5 - calculate maximum value tag for each lab */
        //TODO
    }
}
