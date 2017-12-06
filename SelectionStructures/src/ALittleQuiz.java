import java.util.Scanner;
public class ALittleQuiz 
{
	public static void main (String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int cat, cap, ft, inches, si;
		double weight;
		
		si=0;
		
		System.out.println("What is the capital of Alaska?");
		System.out.println("1. Melbourne");
		System.out.println("2. Anchorage");
		System.out.println("3.  Juneau");
		cap = keyboard.nextInt();
		if (cap == 3)
		{
			si=si+1;
			System.out.println("That's right!.");
		}
		else 
		{
			System.out.println("Sorry, the capitol of Alaska is Juneau");
		}
		
		System.out.println("Can You store the value \"cat\" in a varialbe of type int");
		System.out.println("1.  yes ");
		System.out.println("2.  no");
		cat = keyboard.nextInt();
		
		if (cat==2)
		{
			si=si+1;
			System.out.println("Correct!");
		}
		else 
		{
			System.out.println("Wrong!");
		}
		System.out.println("What is the Result of 9+6/3?");
		System.out.println("1.  5 ");
		System.out.println("2.  11");
		System.out.println("3.  15/3");
		ft= keyboard.nextInt();
		if (ft==2)
		{
			si=si+1;
			System.out.println("Correct!");
		}
		else 
		{
			System.out.println("Wrong!");
		}
		System.out.println("You got "+si+" out of 3 correct");
		
		keyboard.close();
	}
}