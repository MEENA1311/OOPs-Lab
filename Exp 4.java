import java.util.Scanner;
class BankAccount
{
int account_number,balance;
String holder_name;
BankAccount(int account_number,int balance,String holder_name)
{
this.account_number=account_number;
this.balance=balance;
this.holder_name=holder_name;
}
void deposit(int amount)
{
balance+=amount;
System.out.println("Balance:"+balance);
}
void withdraw(int amount1)
{
if(balance < amount1)
{
System.out.println("Insufficient balance");
}
else
{
balance-=amount1;
System.out.println("Balance:"+balance);
}
}
void display(String account_holder,int account_number,int balance)
{
System.out.println("The Account Holder:"+account_holder);
System.out.println("The Account Number:"+account_number);
System.out.println("The Balance:"+this.balance);
}
}
public class Bank {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the Account Holder name:");
String ac_h=s.next();
System.out.println("Enter the Account number:");
int ac_n=s.nextInt();
System.out.println("Enter the Balance:");
int ba=s.nextInt();
System.out.println("Enter the Account Holder name:");
String ac_h1=s.next();
System.out.println("Enter the Account number:");
int ac_n1=s.nextInt();
System.out.println("Enter the Balance:");
int ba1=s.nextInt();
BankAccount b1=new BankAccount(ac_n,ba,ac_h);
BankAccount b2=new BankAccount(ac_n,ba1,ac_h1);
int ch;
do
{
System.out.println("______Bank Management_______");
System.out.println("1.Deposit");
System.out.println("2.Withdraw");
System.out.println("3.Display");
System.out.println("4.Exit");
ch=s.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter the amount to be deposited in "+ac_h+" account");
int amount=s.nextInt();
b1.deposit(amount);
System.out.println("Enter the amount to be deposited in "+ac_h1+" account");
int amount2=s.nextInt();
b2.deposit(amount2);
break;
case 2:
System.out.println("Enter the amount to be withdrawn from"+ac_h+" account:");
int amount1=s.nextInt();
b1.withdraw(amount1);
System.out.println("Enter the amount to be withdrawn from "+ac_h1+" account:");
int amount3=s.nextInt();
b2.withdraw(amount3);
break;
case 3:
b1.display(ac_h, ac_n, ba);
b2.display(ac_h,ac_n,ba1);
break;
case 4:
System.out.println("Exiting.....");
break;
default:
System.out.println("Enter the valid choice ");
}
}while(ch!=4);
}
}
