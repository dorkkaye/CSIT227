public class Student 
{
    private int idno;
    private StudentName name;
    private String course;
    private int year;
    private double tuitionfee;

    public Student()    //Default constructor in java
    {
        this(1, new StudentName("Juan", "Makilala", "dela Cruz"), "bscs", 2, 4000);
    }  

    public Student(int idno, StudentName name, String course, int year, double tuitionfee)
    {
        this.idno = idno;
        this.name = name;
        this.course = course;
        this.year = year;
        this.tuitionfee = tuitionfee;
    }

    //You can set conditions in the setters
    public void setIdNo(int idno)
    {
        this.idno = idno;
    }

    public void setName(StudentName name)
    {
        this.name = name;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setTuitionFee(double tuitionfee)
    {
        this.tuitionfee = tuitionfee;
    }

    public int getIdNo()
    {
        return idno;
    }

    public StudentName getName()
    {
        return name;
    }

    public String getCourse()
    {
        return course;
    }

    public int getYear()
    {
        return year;
    }

    public double getTuitionFee()
    {
        return tuitionfee;
    }

    public void display()
    {
        System.out.println(idno + "" + name + "" + course + "" + year + "" + tuitionfee);
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();

        sb.append(idno + "" + name + "" + course + "" + year + "" + tuitionfee + "");
    
        return sb.toString();
    }

    public boolean equals(Object obj)
    {
        boolean check = false;

        if(obj instanceof Student)  //instance of checks the operand in the left came from the class Student
        {
            Student stud = (Student) obj;   //Cast

            if(this.idno == stud.getIdNo() && this.name.equals(stud.getName()) == true && this.course.equals(stud.getCourse()) == true &&
                this.tuitionfee == stud.tuitionfee && this.year == stud.year)
                    check = true;
        }

        return check;
    }
}