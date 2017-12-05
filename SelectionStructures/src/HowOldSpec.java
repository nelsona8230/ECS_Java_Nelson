import java.util.Scanner;
public class HowOldSpec 
{
	public static void main (String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age, feet, inches;
		double weight;
		
		System.out.println("What is your name?  " );
		name = keyboard.next();
		
		System.out.println("Ok "+name+" how old are you");
		age = keyboard.nextInt();
		
		if (age<16)
		{
			System.out.println("You cannot drive.");
		}
		else if (age<17)
		{
			System.out.println("You can drive but not vote.");
		}
		else if (age<24)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else if (age>24)
		{
			System.out.println("You can pretty much do whatever you want.");
		}
		
		keyboard.close();
	}
}
