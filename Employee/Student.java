public class Student extends Person
{
    private String course;
    private double tuitionfee;

    public Student()
    {
        //implicitly calls Person() or super()
    }

    public Student(String course, double tuitionfee)
    {
        //Implicitly calls super()
        this.course = course;
        this.tuitionfee = tuitionfee;
    }

    public Student(int idno, String name, int age, String course, double tuitionfee)
    {
        super(idno, name, age); //a call to the superclass constructor
        this.course = course;
        this.tuitionfee = tuitionfee;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    public void setTuitionfee(double tuitionfee)
    {
        this.tuitionfee = tuitionfee;
    }

    public String getCourse()
    {
        return course;
    }

    public double getTuitionfee()
    {
        return tuitionfee;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();

        sb.append(super.toString());    //Calling toString of the superclass person
        sb.append(" " + course + " " + tuitionfee);

        return sb.toString();
    }

    public boolean equals(Object obj)
    {
        boolean ans = false;

        if(obj instanceof Student)
        {
            Student s = (Student)obj;

            if(super.equals(s) && this.course.equals(s.course) && this.tuitionfee == s.tuitionfee)
                ans = true;
        }

        return ans;
    }

    public void display()
    {
        System.out.println("Student");
    }
}