import java.util.Random;
import java.util.Scanner;
public class KeepGuessing 
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();
		int x = 1 + rng.nextInt(10);
		
		System.out.println("I HAVE CHOSEN A NUMBER BETWEEN 1 AND 10. TRY TO GUESS IT.");
		System.out.print("YOUR GUESS: ");
		int num = keyboard.nextInt();

		while (num != x)
		{
			System.out.println("\nINCORRECT NUMBER. TRY AGAIN.");
			System.out.print("YOUR GUESS: ");
			num = keyboard.nextInt();
		}
		System.out.println("Thats right, you're a good guesser!");
		keyboard.close();
	}
}
