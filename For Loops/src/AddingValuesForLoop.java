import java.util.Scanner;
public class AddingValuesForLoop 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int x =0;
		System.out.println("Number: ");
		int b = keyboard.nextInt();
		 for (int n = 1 ; n<=b ; n=n+1)
			{
			 System.out.println(n+"");
			 x = x+n;
			}
		 System.out.println("The sum is: " +x+".");

	}
}
