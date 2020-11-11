Use the names below in defining your attributes:

BankAccount.java

String accountName, String accountNumber, double balance
the account name must contain two words (firstname and lastname) if the name is invalid set it to "John Doe".

Methods definitions:
 deposit method
o make deposit into account
o Note: be sure the amount to be deposited is not less than zero

 withdraw method
o make withdrawal into the account
o this method returns false is current balance is less than the amount to be withdrawn
o and it returns true if there is enough balance and subtracts amount withdrawn with balance

 fundTransfer method
o transfers an amount to another account
 credits the amount to the account being transferred and debit to the account who transferred the amount

SavingsAccount.java

calculateInterest
o compute for the annual interest of an account and update the new balance

CheckingAccount.java

cashCheck
o cash check and debit balance
the attribute minimum - minimum maintaining balance for a checking account. 
 the attribute charge - the amount charged if balance < minimum balance. The amount charged will be deducted from the balance if after cash check the balance is less than the minimum balance.

For cash check – the payee is whom you issue the check. Cash check is only allowed if there is enough money in the account.
 Minimum – maintaining balance of the checking account. There is a charge if balance is less than the maintaining balance.