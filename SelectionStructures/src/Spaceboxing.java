import java.util.Scanner;
public class Spaceboxing 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int weight, planet;
		
		System.out.print("Please enter enter your earth weight. ");
		weight = keyboard.nextInt();
		
		System.out.println("I have information for the following planets:");
		System.out.println("	1. Venus    2. Mars    3. Jupiter");
		System.out.println("	4. Saturn   5. Uranus  6. Neptune");
		
		System.out.print("Which planet are you visiting?	");
		planet = keyboard.nextInt();
	}
}
