package main;

class MobileDevice 
{
	String       deviceName;  // the device name
	int          valueTag;    // an integer between -100 and 100
	Lab          lab;         // the lab having this device it its inventory
	RentSettings rs;          // rent settings

	public MobileDevice() 
	{

	}

	public MobileDevice(String deviceName, int valueTag) 
	{
		// set device name and value tag
		this.deviceName = deviceName;
		this.valueTag = valueTag;
	}

	/**
	 * Sets the lab for the device.
	 * @param lab lab to set for device
	 */
	public void setLab(Lab lab) 
	{
		this.lab = lab;
	}

	// set the rent dates; if dates are not valid catch DateFormatException and return false,
	// if rentDate > dueDate catch RentPeriodException and return false
	// if one the exceptions occur there is no RentSettings object
	public boolean rentDevice(String rentDate, String dueDate, Lab lab) 
	{
		RentSettings rs = null;

		try
		{
			rs = new RentSettings(rentDate, dueDate, lab);
		}
		catch(DateFormatException exc)
		{
			System.out.println("DateFormatException when trying to rent device.");
			return false;
		}
		catch(RentPeriodException exc)
		{
			System.out.println("RentPriodException when trying to rent device.");
			return false;
		}

		setRs(rs);
		return true;
	}

	// destroy the RentSettings object for this device
	public void returnDevice(Lab lab) 
	{
		//TODO
	}

	// return the date when this device is available
	public String availableDate(Lab lab) 
	{
		//TODO
		return "";
	}

	// returns true if the current date is greater than the due date
	public boolean isDeviceOverdue() 
	{
		String curDate = Helper.getCurrentDate();
		boolean overdue = false;
		
		try
		{
			overdue = (Helper.timeDifference(curDate, rs.dueDate) < 0);
		}
		catch(DateFormatException exc)
		{
			System.out.println("DateFormatException when checking for overdue device.");
		}
		
		return overdue;
	}

	public boolean isRented(Lab l) 
	{
		return lab != null && lab.equals(l);
	}

	/**
	 * Get rent settings for device.
	 * @return rent settings used for device
	 */
	public RentSettings getRs()
	{
		return rs;
	}

	/**
	 * Set rent settings for device.
	 * @param rs settings to apply to device
	 */
	public void setRs(RentSettings rs) 
	{
		try 
		{
			this.rs = new RentSettings(rs.rentDate, rs.dueDate, lab);
		} 
		catch (DateFormatException e) 
		{
			System.out.println("DateFormatException when setting device rent settings.");
		}
		catch (RentPeriodException e) 
		{
			System.out.println("RentPeriodException when setting device rent settings.");
		}
	}

	@Override
	public boolean equals(Object other) 
	{
		if(this == other)
			return true;
		if(other == null)
			return false;
		if(!(other instanceof MobileDevice))
			return false;
		return ((MobileDevice)other).deviceName.equals(deviceName) && ((MobileDevice)other).valueTag == valueTag;
	}

	@Override
	public int hashCode() 
	{
		int result = deviceName != null ? deviceName.hashCode() : 0;
		result = 31 * result + valueTag;
		return result;
	}

	@Override
	public String toString() 
	{
		String ret = "";
		
		// check if device belongs to a lab
		ret = lab == null ? deviceName(false) : deviceName(true);
		
		return ret;
	}

	/**
	 * Get device attributes as a string.
	 * @return device name and value tag
	 */
	public String deviceName(boolean printLab) 
	{
		return "(" + deviceName + ", " + valueTag + (printLab ? " => " + lab.labName + ')' : ')');
	}

	class RentSettings 
	{
		private String rentDate;          // date when the item is requested
		private String dueDate;           // date when the item must be returned
		private boolean borrowed = false; // true if the item is rented

		//default ctr
		private RentSettings() throws DateFormatException 
		{
			//TODO
		}

		// private ctr must throw DateFormatException and RentPeriodException
		private RentSettings(String rentDate, String dueDate, Lab lab) throws DateFormatException, RentPeriodException 
		{
			// check if dates are valid
			if(Helper.isValidDate(rentDate) && Helper.isValidDate(dueDate))
			{
				// check if rent date > due date
				if(Helper.timeDifference(rentDate, dueDate) < 0)
					throw new RentPeriodException();

				this.rentDate = rentDate;
				this.dueDate = dueDate;
				setLab(lab);
			}
			else
				throw new DateFormatException();
		}

		@Override
		public String toString() 
		{
			return "RentSettings{" +
					"rentDate='" + rentDate + '\'' +
					", dueDate='" + dueDate + '\'' + MobileDevice.this.lab.labName +
					", borrowed=" + borrowed +
					'}';
		}
	}
}
