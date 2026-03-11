class BankAccount{

static double balance;

static double getBalance()
{
return balance;
}
static void credit(double amount) {
if (amount > 0.0) {
balance = balance + amount;
} else {
 System.out.println("Invalid credit amount");
}
}
static void debit(double amount) {
 if (amount > 0.0 && amount>=0.0) {
 balance = balance - amount;
 } else {
System.out.println("Insufficient balance");
}
}

}