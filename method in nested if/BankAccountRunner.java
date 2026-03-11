class BankAccountRunner {

public static void main(String[] args) {
double availableBalance = BankAccount.getBalance();
System.out.println("The current Balance is: " + availableBalance);

BankAccount.credit(300.00);
availableBalance = BankAccount.getBalance();
System.out.println("The Current Balance Is: " + availableBalance);

BankAccount.debit(100.00);
availableBalance = BankAccount.getBalance();
System.out.println("The Available Balance is: " + availableBalance);

double availableBalancee = BankAccount.getBalance();
System.out.println("The Currrent Balance Is "+ availableBalancee);

BankAccount.credit(200.00);
availableBalancee=BankAccount.getBalance();
System.out.println("The Current Balance" + availableBalancee);

BankAccount.debit(100.00);
availableBalancee=BankAccount.getBalance();
System.out.println("The Current Balance" + availableBalancee);

    } 
}