import java.util.Scanner;
import java.util.Random;
public class KeepGuessing 
{
	public static void main(System[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		
		System.out.println("I HAVE CHOSEN A NUMBER BETWEEN 1 AND 10. TRY TO GUESS IT.");
		System.out.print("YOUR GUESS:");
		int num = keyboard.nextInt();

		while (num != x)
		{
			System.out.println("\nINCORRECT NUMBER. TRY AGAIN.");
			System.out.print("YOUR GUESS");
			num = keyboard.nextInt();
		}
		
		System.out.println("Thats right, your a good guesser");
	}
}
