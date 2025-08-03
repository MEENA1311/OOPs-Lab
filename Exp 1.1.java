import java.util.Scanner;
public class Cinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day \n 1.Mon,Tue,Wed,Thru,Fri \n 2.Sat,Sun");
		int day=s.nextInt();
		System.out.println("Enter ur age");
		int age=s.nextInt();
		double bill=200;
		double discount =0;
		if(age< 5 )
		{
			if(day==1)
			{
			bill=0;
			System.out.println("The Bill:"+bill);
			}
			else
			{
				bill=0;
				System.out.println("The bill:"+bill);
			}
		}
		else if(age >=5 && age<=18)
		{
			if(day==1)
			{
				discount=bill*50.0/100.0;
				bill=bill-discount;
				System.out.println("The bill:"+bill);
			}
			else
			{
				discount=bill*40.0/100.0;
				bill=bill-discount;
				System.out.println("The bill:"+bill);
			}
		}
		else if(age >=19 && age<=60)
		{
			if(day==1)
			{
				discount=bill*10.0/100.0;
				bill=bill-discount;
				System.out.println("The bill:"+bill);
			}
			else
			{
				bill=200;
				System.out.println("The bill:"+bill);
			}
		}
		else 
		{
			if(day==1)
			{
				discount=bill*40.0/100.0;
				bill=bill-discount;
				System.out.println("The bill:"+bill);
			}
			else
			{
				discount=bill*30.0/100.0;
				bill=bill-discount;
				System.out.println("The bill:"+bill);
			}
		}
	}

}
