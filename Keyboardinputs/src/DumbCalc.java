import java.util.Scanner;

public class DumbCalc
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		int num1, num2, num3;
		
		System.out.println("What is the first number?");
		num1 = keyboard.nextInt();
		
		System.out.println("What is the second number?" );
		num2 = keyboard.nextInt();
		
		System.out.println("What is the third number?" );
		num3 = keyboard.nextInt();
		
		System.out.println("The average of the three numbers is " +((num1+num2+num3)/3));
		}
}
