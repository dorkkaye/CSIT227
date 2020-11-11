public class Test 
{
    public static void main(String[] args)
    {
        //Test 1
        BankAccount  account1 = new BankAccount ("Acct-001","Maria Paz", 5000);
        BankAccount  account2 = new BankAccount ("Acct-002","Juan dela Cruz", 2000);
        System.out.println(account1);
        System.out.println(account2);
        account1.deposit(200);
        System.out.println(account1.withdraw(7000));
        account1.fundTransfer(account2, 2000);
        System.out.println(account1);
        System.out.println(account2);

        //Output
        /*
            Acct-001, Maria Paz, 5000.0
            Acct-002, Juan dela Cruz, 2000.0
            false
            Acct-001, Maria Paz, 3200.0
            Acct-002, Juan dela Cruz, 4000.0
         */

         //Test 2
         BankAccount account3 = new BankAccount ();
        account3.setAccountName("YuleTulin");
        account3.setAccountNumber("Acct-001");
        account3.setBalance(1000);
        account3.deposit(-500);
        System.out.println(account3.getAccountNumber());
        System.out.println(account3.getAccountName());
        System.out.println(account3.getBalance());

        //Output
        /*
            Acct-001
            John Doe
            1000.0
         */

         //Equality test 1
         if(account1.equals(account2))
            System.out.println("Equals");
        else
            System.out.println("Not Equals");

        //Output
        /*
            Not Equals
        */

        //Test 3
        SavingsAccount sa = new SavingsAccount("Acct-001", "Maria Paz", 5000.0, 0.2);
        System.out.println(sa);
        sa.deposit(200);
        sa.calculateInterest();
        System.out.println(sa);
        SavingsAccount sa2 = new SavingsAccount("Acct-002", "JuneMarch", 5000.0, 0.25);
        System.out.println(sa2);

        //Output
        /*
            Acct-001, Maria Paz, 5000.0, 0.2
            Acct-001, Maria Paz, 6240.0, 0.2
            Acct-002, John Doe, 5000.0, 0.25
        */


        //Equality test 1
        if(sa.equals(sa2))
            System.out.println("Equals");
        else
            System.out.println("Not Equals");

        //Output
        /*
            Not Equals
        */
    }
}
