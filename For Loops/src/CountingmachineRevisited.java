import java.util.Scanner;
public class CountingmachineRevisited 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Count from: ");
		int f = keyboard.nextInt();
		System.out.print("Count to: ");
		int t = keyboard.nextInt();
		System.out.print("Count by: ");
		int b = keyboard.nextInt();
		for (int n = f ; n<=t ; n=n+b)
			{
				System.out.println(n+"");
			}
	}
}
