public class StudentName 
{
    private String firstname;
    private String middlename;
    private String lastname;   
    
    public StudentName(){}

    public StudentName(String firstname, String middlename, String lastname)
    {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
    }

    public void setFirstName(String firstname)
    {
        this.firstname = firstname;
    }

    public void setMiddleName(String middlename)
    {
        this.middlename = middlename;
    }

    public void setLastName(String lastname)
    {
        this.lastname = lastname;
    }

    public String getFirstName()
    {
        return firstname;
    }

    public String getMiddleName()
    {
        return middlename;
    }

    public String getLastname()
    {
        return lastname;
    }

    public String toString()
    {
        return firstname + " " + middlename.charAt(0) + ". " + lastname;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof StudentName)
        {
            StudentName s = (StudentName)obj;

            if(this.firstname.equals(s.getFirstName()) == true && this.middlename.equals(s.getMiddleName()) == true 
                && this.lastname.equals(s.getLastname()) == true)
                return true;
        }

        return false;
    }
}
