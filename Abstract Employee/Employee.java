abstract class Employee extends Person 
{
    private String companyName;

  public Employee(String name, String address, int age, String companyName) 
  {
     super(name, address, age);
     this.companyName = companyName;
  }

  public Employee(){}

  public void setCompanyName(String cname)
  {
      companyName = cname;
  }

  public String getCompanyName()
  {
      return companyName;
  }

 // Override the display method in the Person class
  public void display()
  {
      System.out.println("Name      : "+ this.getName());
      System.out.println("Address   : "+ this.getAddress());
      System.out.println("Age       : "+ this.getAge());
      System.out.println("Company Name: "+ this.getCompanyName());
  }

  // abstract method that should
  // be implemented by classes extending this class
  // note that we can not compute earnings here since
  // at this point, the class has no information
  // regarding salary
  public abstract double earnings();

  // override the toString() and equals() methods
  public String toString()
  {
      return "Name: " + this.getName() + "\nAddress: " + this.getAddress() +"\nAge: " + this.getAge() + "\n";
  }

  public boolean equals(Object obj)
  {
      if(obj instanceof Employee)
      {
          if (((Employee)obj).companyName.equals(this.companyName))
          {
              return true;
          }
      }
      
      return false;
  }
}