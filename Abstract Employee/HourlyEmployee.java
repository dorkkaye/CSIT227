class HourlyEmployee extends Employee
{
	private int hoursWorked;  //total number of hours worked
	private double rate;	  // rate per hour

    public HourlyEmployee(){}

    public HourlyEmployee(String name, String address, int age, String cName, int hoursWorked, double rate)	
    {
		super(name,address,age,cName);
		this.hoursWorked = hoursWorked;
		this.rate = rate;
	}

    public HourlyEmployee(String name,String address,int age,String cName)	
    {
		super(name,address,age,cName);
		hoursWorked = 0;
		rate = 0;
	}

	// provide the setters and getters of your data members
	public void setHoursWorked(int hoursWorked)
	{
	    this.hoursWorked = hoursWorked;
	}
	
	public void setRate(double rate)
	{
	    this.rate = rate;
	}
	
	public int getHoursWorked()
	{
	    return hoursWorked;
	}
	
	public double getRate()
	{
	    return rate;
	}

	// implement the abstract method
	public double earnings()
    {
        if(hoursWorked <= 40)
            return rate * hoursWorked;
        else if(hoursWorked > 40)
        {
            int excessHours = hoursWorked - 40;
            double tempPay = 40 * rate;
            double excessPay = excessHours * (rate * 1.5);

            return tempPay + excessPay;
        }
        else
            return 0;
    }
		//earnings is computed by having the product of
		//the total number of hours worked and the rate.
		// but if the number of hours worked exceeds 40,
		// the rate increases to 150% of the current rate.
		// (ex. rate=200; 150% = 300)


	// override the toString() and equals() methods
    public String toString()
    {
        return "Name: " + this.getName() + "\nAddress: " + this.getAddress() +"\nAge: " + this.getAge() +
                "\nCompany Name: " + this.getCompanyName() + "\nHours worked: " + hoursWorked + "\nRate: "
                + rate;
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof HourlyEmployee)
		{
			if (this.hoursWorked == ((HourlyEmployee)obj).hoursWorked && this.rate == ((HourlyEmployee)obj).rate)
			{
				return true;
			}
		}
		
		return false;
	}
}