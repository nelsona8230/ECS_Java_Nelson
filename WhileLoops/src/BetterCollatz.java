import java.util.Scanner;
public class BetterCollatz
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		int num;
		int ct = 1;
		System.out.println("Let's create a COLLAT SEQUENCE!");
		System.out.println("\n");
		System.out.println("Rules:");
		System.out.println("If the number is even, divide by 2");
		System.out.println("If the number is odd, multiply it by 3 and add 1.");
		System.out.println("Repeat untill you reach 1.");
		System.out.println("Starting number: ");
		num = keyboard.nextInt();
		System.out.print(num+" - ");
		do
		{
		if (num%2==0)
			num=num/2;
		else
			num=num*3+1;
		System.out.print(" - "+num);
		ct++;
		}while (num!=1);
		System.out.println("Terminated after " +ct+  " steps.");
	} 
}