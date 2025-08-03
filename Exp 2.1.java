import java.util.Scanner;
public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		System.out.println("Enter the elements");
		int a[]=new int[n];
		for (int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter X");
		int x=s.nextInt();
		int count=0;
		for (int i=0;i<n;i++)
		{
			if(a[i]<x)
			{
				count+=1;
				System.out.println(a[i]);
			}
		}
	}

}
