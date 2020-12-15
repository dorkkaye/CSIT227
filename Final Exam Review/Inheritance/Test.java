public class Test 
{
    public static void main(String[] args)
    {
        BankAccount  account1 = new BankAccount ("Acct-001","Maria Paz", 5000);
        BankAccount  account2 = new BankAccount ("Acct-002","Juan dela Cruz", 2000);
        System.out.println(account1);
        System.out.println(account2);
        account1.deposit(200);
        System.out.println(account1.withdraw(7000));
        account1.fundTransfer(account2, 2000);
        System.out.println(account1);
        System.out.println(account2);
        
        /* 
            RESULT

            Acct-001, Maria Paz, 5000.0
            Acct-002, Juan dela Cruz, 2000.0
            false
            Acct-001, Maria Paz, 3200.0
            Acct-002, Juan dela Cruz, 4000.0
        */
        
        BankAccount account3 = new BankAccount ();
        account3.setAccountName("YuleTulin");
        account3.setAccountNumber("Acct-001");
        account3.setBalance(1000);
        account3.deposit(-500);
        System.out.println(account3.getAccountNumber());
        System.out.println(account3.getAccountName());
        System.out.println(account3.getBalance());

        /*
            RESULT

            Acct-001
            John Doe
            1000.0
        */
    }    
}
