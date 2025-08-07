import java.util.Scanner;
public class string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner s=new Scanner(System.in);
			System.out.println("Enter the string");
			String str=s.nextLine();
			int count1=0;
			int count2=0;
			for(int i=0;i<str.length();i++)
				{
					char c=str.charAt(i);
					if(Character.isAlphabetic(c))
					{
						count1+=1;
					}
					else if(Character.isDigit(c))
					{
						count2+=1;
					}
					
				}
				System.out.println("Letters:"+count1);

				System.out.println("Digits:"+count2);

			}



		
	}


