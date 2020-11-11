public class TestClass 
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

        //Test 4
        CheckingAccount ca = new CheckingAccount("Acct-001","Maria Paz",5000, 2000, 500);
        System.out.println(ca);
        ca.cashCheck("CIT",3500);
        System.out.println(ca);

        //Output
        /*
            Acct-001, Maria Paz, 5000.0, 2000.0, 500.0
            Acct-001, Maria Paz, 1000.0, 2000.0, 500.0
        */

        //Test 5
        CheckingAccount ca1 = new CheckingAccount("Acct-001","Maria Paz",5000, 2000, 500);
        System.out.println(ca1);
        ca1.cashCheck("CIT",7000);
        System.out.println(ca1);

        //Output
        /*
            Acct-001, Maria Paz, 5000.0, 2000.0, 500.0
            Acct-001, Maria Paz, 5000.0, 2000.0, 500.0
         */
        
         //Test 6
        CheckingAccount ca2 = new CheckingAccount("Acct-001","Maria Paz",5000, 2000, 500);
        System.out.println(ca2);
        ca2.cashCheck("CIT",5000);
        System.out.println(ca2);

        //Output
        /*
            Acct-001, Maria Paz, 5000.0, 2000.0, 500.0
            Acct-001, Maria Paz, -500.0, 2000.0, 500.0
        */

        //Test 7
        CheckingAccount ca3 = new CheckingAccount();
        ca3.setAccountNumber("Acct-001");
        ca3.setAccountName("Maria Paz");
        ca3.setBalance(5000);
        ca3.setMinimum(2000);
        ca3.setCharge(500);
        System.out.println(ca3.getMinimum());
        System.out.println(ca3.getCharge());
        System.out.println(ca3.toString());

        //Output
        /*
            2000.0
            500.0
            Acct-001, Maria Paz, 5000.0, 2000.0, 500.0
        */

        //Test 8
        TestClass test = new TestClass();
        test.input();

        //Output
        /*
            Act-001, Mary Joy Torcende, 7000.0, 0.25
            Act-002, Matt Plaza, 12500.0, 0.2
            Act-003, David Andrew, 15000.0, 10000.0, 200.0
        */
    }

    public void input()
    {
        SavingsAccount sa3 = new SavingsAccount("Act-001", "Mary Joy Torcende", 7000.0, 0.25);
        SavingsAccount sa4 = new SavingsAccount("Act-002", "Matt Plaza", 12500.0, 0.2);
        CheckingAccount ca4 = new CheckingAccount("Act-003", "David Andrew", 15000.0, 10000.0, 200.0);

        System.out.println(sa3);
        System.out.println(sa4);
        System.out.println(ca4);
    }

}