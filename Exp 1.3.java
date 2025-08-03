import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int balance=100000;
		int choice;
		while(true)
		{
			System.out.println("---------Menu------------ ");
			System.out.println("Check the balance");
			System.out.println("Deposit Money");
			System.out.println("Withdrawal Money");
			System.out.println("Exit");
			System.out.println("Enter the choice");
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("The balance="+balance);
				break;
			case 2:
				System.out.println("Enter the amount to be deposited ");
				int a=s.nextInt();
				balance+=a;
				break;
			case 3:
				System.out.println("Enter the amount to be withdrawn");
				int d=s.nextInt();
				balance=balance-d;
				break;
			case 4 :
				System.out.println("Exit the program");
				return;
			default:
				System.out.println("enter valid choice");
				
			}
		}
	}

}
