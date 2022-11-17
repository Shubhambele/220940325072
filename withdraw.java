class BankAccount
{
int accno;
double balance;

BankAccount()
{
accno=1010;
balance=50000;

}
void deposit(int x)
{
balance=balance+x;
System.out.println("the  balance after deposit is  "+balance);
}
void show()
{ 
System.out.println("the Account  balance is  "+balance);
}
public static void main(String args[])
{
void withdraw( int y)
{
balance=balance-y
System.out.println("the remaining Account  balance is  "+balance);

}
}
}