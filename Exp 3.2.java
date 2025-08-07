import java.util.Scanner;
public class String2 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the paragraph");
		String msg=s.nextLine();
		int count1=0;
		int count2=1;
		int count3=0;
		for (int i=0;i<msg.length();i++)
		{
			char c=msg.charAt(i);
			if(Character.isWhitespace(c))
			{
				count1++;
			}
			if (msg.charAt(i)==' ' &&  msg.charAt(i+1) !=' ')
			{
				count2++;
			}	
			if(Character.isAlphabetic(c))
			{
				count3++;
			}
		}
		System.out.println("Space:"+count1);
		System.out.println("Words:"+count2);
		System.out.println("Letters:"+count3);
	}
}
