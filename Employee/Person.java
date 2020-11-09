public class Person
{
    private int idno;
    private String name;
    private int age;

    public Person(){}

    public Person(int idno, String name, int age)
    {
        this.idno = idno;
        this.name = name;
        this.age = age;
    }

    public void setIdno(int idno)
    {
        this.idno = idno;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getIdno()
    {
        return idno;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();

        sb.append(idno + " " + name + " " + age);

        return sb.toString();
    }

    public boolean equals(Object obj)
    {
        boolean ans = false;

        if(obj instanceof Person)
        {
            Person p = (Person)obj;

            if(this.idno == p.idno && this.name.equals(p.name) && this.age == p.age)
                ans = true;
        }

        return ans;
    }

    public void display()
    {
        System.out.println("Person");
    }
}