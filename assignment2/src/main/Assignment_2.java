package main;

import java.util.Vector;

/**
 * Main entry for assignment.
 * @author Ashrafi 030
 */
public class Assignment_2
{

	public static void main(String[] args) 
	{


		/* TASK 1 - build labs from files - at least two labs */
		System.out.println("*" + " TASK 1 " + "*");
		
		// build labs from files
		Labs labs = new Labs(2);
		System.out.println("Newnham Lab\n-----------");
		labs.addDevicesToLab("Seneca@York", "YorkLab.txt");
		System.out.println();
		System.out.println("York Lab\n--------");
		labs.addDevicesToLab("Newnham", "NewnhamLab.txt");

		/* TASK 2 - ask for a device that is not in any lab inventory */
		System.out.println("\n\n *" + " TASK 2 " + "*");
		
		// create a device and find it in a lab
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
		
		// set a new device and rent dates
		device = new MobileDevice("Android", 25);
		String rentDate = "11/09/2016", dueDate = "11/11/2016";

		// try to rent device
		lab = labs.rentDeviceAvailable(device, rentDate, dueDate);
		if(lab != null)
		{
			// rent successful
			System.out.println(Helper.printAvailable(device, rentDate, lab));
			device.rentDevice(rentDate, dueDate, lab);
			System.out.println("wanted = " + device);
		}
		else
			System.out.println(Helper.printUnavailable(device, rentDate));        
		
		// try to rent it again
		Lab lab2 = labs.rentDeviceAvailable(device, rentDate, dueDate);
		if(lab2 != null)
		{
			// rent successful
			System.out.println(Helper.printAvailable(device, rentDate, lab2));
			device.rentDevice(rentDate, dueDate, lab2);
			System.out.println("wanted = " + device);
		}
		else
			System.out.println(Helper.printUnavailable(device, rentDate));
		
		// return the device so it can be rented again
		device.returnDevice(lab);

		// try to rent it one more time
		lab = labs.rentDeviceAvailable(device, rentDate, dueDate);
		if(lab != null)
		{
			// rent successful
			System.out.println(Helper.printAvailable(device, rentDate, lab));
			System.out.println("wanted = " + device);
		}
		else
			System.out.println(Helper.printUnavailable(device, rentDate));

		/* TASK 4 - ask for the same device in all labs
		 * if you can find a lab, rent the device from that lab
		 */
		System.out.println("\n\n *" + " TASK 4 " + "*");
		
		// find all labs that contain the device
		Vector<Lab> allLabs = labs.findDeviceInAllLabs(device);
		if(allLabs != null)
		{
			for(Lab l : allLabs)
				System.out.println("Lab " + l.labName + " contains device " + device.deviceName);
		}
		else
			System.out.println(Helper.printNonexistent(device));
		
		// find all labs where device can be rented from
		Vector<Lab> allRentLabs = labs.findRentalDeviceInAllLabs(device);
		if(allRentLabs != null)
		{
			for(Lab l : allRentLabs)
				System.out.println("Lab " + l.labName + " has device " + device.deviceName + " available for rent");
		}
		else
			System.out.println(Helper.printNonexistent(device));

		/* TASK 5 - calculate maximum value tag for each lab */
		System.out.println("\n\n *" + " TASK 5 " + "*");
		System.out.println("Maximum value tag for lab " + lab.labName + " is: " + lab.findMaximumValueTag());
		
		/* TASK 6 - inquire about a device */
		System.out.println("\n\n *" + " TASK 6 " + "*");
		System.out.println("Device " + device.deviceName + " is rented: " + device.isRented(lab));
		System.out.println("Device " + device.deviceName + " is overdue: " + device.isDeviceOverdue());
		System.out.println("Device " + device.deviceName + " is found in more than one lab: " + (allLabs.size() > 1 ? true : false));
		System.out.println("Device " + device.deviceName + " is return date: " + device.availableDate(lab));
	}
}
