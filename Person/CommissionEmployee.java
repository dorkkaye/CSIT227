class CommissionEmployee extends Employee {

	private float regularSalary;  //fixed monthly salary
	private int itemSold;	      //total number of items sold
	private float commission_rate;	//rate per item (in decimal form)

	public CommissionEmployee(String name,String address,
			int age,String cName, float regSal, int nItems,
			float commission) {
		super(name,address,age,cName);
		regularSalary = regSal;
		itemSold = nItems;
		commission_rate = commission;
	}

	public CommissionEmployee() {

	}

	// provide the setters and getters of your data members
	public void setRegularSalary(float regularSalary)
	{
	    this.regularSalary = regularSalary;
	}
	
	public void setItemSold(int itemSold)
	{
	    this.itemSold = itemSold;
	}
	
	public void setCommissionRate(float commission_rate)
	{
	    this.commission_rate = commission_rate;
	}
	
	public float getRegularSalary()
	{
	    return regularSalary;
	}
	
	public int getItemSold()
	{
	    return itemSold;
	}
	
	public float getCommissionRate()
	{
	    return commission_rate;
	}

	// implement the abstract method
	public double earnings()
	{
	    return regularSalary + (commission_rate * itemSold);
	}
	
		//the total earnings of a commission employee is the sum of
		//the monthly salary plus the commission.
		//commission will be based on the total number of items sold
		//times the commission rate per item.


	// override the toString() and equals() methods
    public String toString()
    {
		return "Name: " + this.getName() + "\nAge: " + this.getAge() + "\nCompany Name: " + this.getCompanyName() + 
		        "\nRegualar salary: " + regularSalary + "\nItem sold: " + itemSold + "\nCommission rate: " + commission_rate;
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof CommissionEmployee)
		{
			if (this.regularSalary == ((CommissionEmployee)obj).regularSalary && 
			    this.itemSold == ((CommissionEmployee)obj).itemSold &&
			    this.commission_rate == ((CommissionEmployee)obj).commission_rate)
			{
				return true;
			}
		}
		return false;
	}
}