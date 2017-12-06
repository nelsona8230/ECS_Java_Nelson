import java.util.Scanner;
public class TwoQuestions 
{
	public static void main (String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String q1,q2;
		
		
		System.out.println("Think of an object, and I will guess what it is.");
		System.out.println("Is it an animal, vegetable, or mineral?");
		q1 = keyboard.next();
		System.out.println("Is it bigger than a breadbox?");
		q2 = keyboard.next();
		
		if (q1.equals("animal") && q2.equals("yes"))
		{
			System.out.println("Is it a moose?");
		}
		 if (q1.equals("animal") && q2.equals("no"))
		{
			System.out.println("Is it a squirrel?");
		}
		 if (q1.equals("vegetable") && q2.equals("yes"))
		{
			System.out.println("Is it a Watermelon?");
		}
		 if (q1.equals("vegetable") && q2.equals("no"))
		{
			System.out.println("Is it a Carrot?");
		}
		 if (q1.equals("mineral") && q2.equals("yes"))
		{
			System.out.println("Is it a Camaro?");
		}
		 if (q1.equals("mineral") && q2.equals("no"))
		{
			System.out.println("Is it a paper clip?");
		}
		
		keyboard.close();
	}
}