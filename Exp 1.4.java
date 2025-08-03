import java.util.Random;
import java.util.Scanner;
public class numguess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		Scanner s=new Scanner(System.in);
		int num=r.nextInt(100)+1;
		int n;
		int attempts=0;
		int max_attempts=7;
		while(attempts<max_attempts)
		{
			System.out.println("Enter the number");
			n=s.nextInt();
			attempts ++;
			if(n >num)
			{
				System.out.println("Too High");
			}
			else if(n<num)
			{
				System.out.println("Too Low");
			}
			else
			{
				System.out.println("Correct Guess");
				break;
			}
		}
		
	}

}
