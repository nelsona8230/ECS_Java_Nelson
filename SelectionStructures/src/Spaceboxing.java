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
		if (planet == 1)
		{
			System.out.println("Yout weight would be " +( weight *0.78)+" pounds on that planet");
		}
		else if (planet == 2)
		{
			System.out.println("Yout weight would be " +( weight *0.39)+" pounds on that planet");
		}
		else if (planet == 3)
		{
			System.out.println("Yout weight would be " +( weight *2.65)+" pounds on that planet");
		}
		else if (planet == 4)
		{
			System.out.println("Yout weight would be " +( weight *1.17)+" pounds on that planet");
		}
		else if (planet == 5)
		{
			System.out.println("Yout weight would be " +( weight *1.05)+" pounds on that planet");
		}
		else if (planet == 6)
		{
			System.out.println("Yout weight would be " +( weight *1.23)+" pounds on that planet");
		}
	}
}
