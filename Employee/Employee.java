public class Employee extends Person
{
    private String department;
    private int salary;

    public Employee()
    {
        //Implicitly calls Person() or super()
    }

    public Employee(String department, int salary)
    {
        //Implicitly calls super()
        this.department = department;
        this.salary = salary;
    }

    public Employee(int idno, String name, int age, String department, int salary)
    {
        super(idno, name, age); //A call to the superclass constructor
        this.department = department;
        this.salary = salary;
    }

    public void setDeparment(String department)
    {
        this.department = department;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getSalary()
    {
        return salary;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();

        sb.append(super.toString());    //Calling toString of the superclass person
        sb.append(" " + department + " " + salary);

        return sb.toString();
    }

    public boolean equals(Object obj)
    {
        boolean ans = false;

        if(obj instanceof Employee)
        {
            Employee e = (Employee)obj;

            if(super.equals(e) && this.department.equals(e.department) && this.salary == e.salary)
                ans = true;
        }

        return ans;
    }

    public void display()
    {
        System.out.println("Employee");
    }
}
