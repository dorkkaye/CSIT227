public class Person{
    String name;
    Birthday birthday;

    public Person(){
		name="Juan dela Cruz";
		birthday = new Birthday();
	}
    public String getName() { return name;}
    public Birthday getBirthday(){ return birthday;}


    //your code
    public boolean equals(Object obj)
    {
        boolean ans = false;
        
        if(obj instanceof Person)
        {
            Person p = (Person)obj;
            
            if(this.name == p.name && this.birthday.getMonth() == p.birthday.getMonth() 
            && this.birthday.getDay() == p.birthday.getDay() &&
            this.birthday.getYear() == p.birthday.getYear())
                ans = true;
        }
        
        return ans;
    }
}