import java.util.Scanner;
public class electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int Total=0;
		for(int i=1;i<=12;i++)
		{
			System.out.println("Enter the units");
			int unit=s.nextInt();
			Total+=unit;
	     }
		double avg=Total/12;
		if(avg >500)
		{
			System.out.println("High Consumption");
		}
		else
		{
			System.out.println("Low Consumption");
		}

}
}
