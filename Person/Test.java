public class Test 
{
    public static void main(String[] args)
    {
        //Test 1
        CommissionEmployee c = new CommissionEmployee ("Yule Josef Ato","Cebu City",23,"Accenture",40000.0f, 550, 0.10f);
        System.out.println(c);
        System.out.println("\nEarnings: "+c.earnings());

        /*  OUTPUT
        Name: Yule Josef Ato
        Address: Cebu City
        Age: 23
        Company Name: Accenture
        Regular salary: 40000.0
        Item sold: 550
        Commission rate: 0.1

        Earnings: 40055.0
        */

        //Test 2
        CommissionEmployee c1 = new CommissionEmployee ("Yule Josef Ato","Cebu City",23,"Accenture",40000.0f, 550, 0.10f);
        CommissionEmployee c2 = new CommissionEmployee ("Yule Josef Ato","Cebu City",23,"Accenture",40000.0f, 550, 0.10f);
        c1.display();
        System.out.println(c1.equals(c2));

        /*  OUTPUT
            Name      : Yule Josef Ato
            Address   : Cebu City
            Age       : 23
            Company Name: Accenture
            true
        */

        //Test 3
        CommissionEmployee c3 = new CommissionEmployee();
        c3.setName("Yule Josef Ato");
        c3.setAddress("Cebu City");
        c3.setAge(28);
        c3.setCompanyName("Kyocera");
        c3.setRegularSalary(5000.00f);
        c3.setItemSold(40);
        c3.setCommissionRate(0.2f);
        System.out.println(c3);

        /*  OUTPUT
            Name: Yule Josef Ato
            Address: Cebu City
            Age: 28
            Company Name: Kyocera
            Regular salary: 5000.0
            Item sold: 40
            Commission rate: 0.2
        */
    }
}
