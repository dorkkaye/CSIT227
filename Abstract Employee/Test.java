public class Test 
{
    public static void main(String[] args)
    {
        //Test 1
        HourlyEmployee h = new HourlyEmployee("Yule Josef Ato","Cebu City",23,"Accenture",40, 550.98);
        System.out.println(h);
        System.out.println("\nEarnings: "+h.earnings());
        
        /*  OUTPUT
            Name: Yule Josef Ato
            Address: Cebu City
            Age: 23
            Company Name: Accenture
            Hours worked: 40
            Rate: 550.98

            Earnings: 22039.2
        */
        
        //Test 2
        HourlyEmployee h1 = new HourlyEmployee("Linc Josef Ato","Talisay City",28,"Alliance",41, 600.00);
        h1.display();
        System.out.println("\nEarnings: "+h1.earnings());
        
        /*  OUTPUT
            Name      : Linc Josef Ato
            Address   : Talisay City
            Age       : 28
            Company Name: Alliance

            Earnings: 24900.0
        */

        //Test 3
        HourlyEmployee h2 = new HourlyEmployee("Yule Josef Ato","Cebu City",23,"Accenture",40, 550.98);
        HourlyEmployee h3 = new HourlyEmployee("Linc Josef Ato","Talisay City",28,"Alliance",41, 600.00);
        System.out.println(h2.equals(h3));
        
        /*  OUTPUT
            false
        */
        
        //Test 4
        HourlyEmployee h4 = new HourlyEmployee();
        h4.setName("Yule Josef Ato");
        h4.setAddress("Cebu City");
        h4.setAge(28);
        h4.setCompanyName("Kyocera");
        h4.setRate(600.00);
        h4.setHoursWorked(40);
        System.out.println(h4);

        /*  OUTPUT
            Name: Yule Josef Ato
            Address: Cebu City
            Age: 28
            Company Name: Kyocera
            Hours worked: 40
            Rate: 600.0
        */
    }
}
