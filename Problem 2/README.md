method withdraw throws an exception if amount is greater than balance.

For example:

Test
Account account = new Account("Acct-001","Juan dela Cruz", 5000.0);
account.withdraw(5500.0);
System.out.println("Balance: "+account.getBalance());

Result
Insufficient: Insufficient funds.
Balance: 5000.0

Test
Account account = new Account("Acct-001","Juan dela Cruz", 5000.0);
account.withdraw(500.0);
System.out.println("Balance: "+account.getBalance());

Result
Balance: 4500.0