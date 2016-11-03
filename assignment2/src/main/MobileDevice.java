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
        //TODO
    }

    public void setLab(Lab lab) 
    {
        //TODO
    }

    // set the rent dates; if dates are not valid catch DateFormatException and return false,
    // if rentDate > dueDate catch RentPeriodException and return false
    // if one the exceptions occur there is no RentSettings object
    public boolean rentDevice(String rentDate, String dueDate, Lab lab) 
    {
        RentSettings rs = null;

       //TODO

        this.rs = rs;
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
        //TODO
        return false;
    }

    public boolean isRented(Lab l) 
    {
        //TODO
        return false;
    }

    public RentSettings getRs()
    {
        //TODO
        return null;
    }

    public void setRs(RentSettings rs) 
    {
        //TODO
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
        int result = deviceName != null ? deviceName.hashCode() : 0;
        result = 31 * result + valueTag;
        return result;
    }

    @Override
    public String toString() 
    {

        String s = "";
       //TODO
        return s;
    }

    public String deviceName() 
    {
        return "(" + deviceName + ", " + valueTag + ')';
    }

    private class RentSettings 
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
            //TODO
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
