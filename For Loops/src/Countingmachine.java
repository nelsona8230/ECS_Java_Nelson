import java.util.Scanner;
public class Countingmachine 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Count to: ");
		int b = keyboard.nextInt();
		 for (int n = 1 ; n<=b ; n=n+1)
			{
			 System.out.println(n+"");
			}
	}
}
