import java.util.Scanner;
public class BMICalcBetter 
{
	public static void main (String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int q1,q2,q3;
		double bmi;
		
		System.out.println("How many feet tall are you?");
		q1 = keyboard.nextInt();
		System.out.println("How many inches?");
		q2 = keyboard.nextInt();
		System.out.println("How much do you weigh?");
		q3 = keyboard.nextInt();
		bmi = ((q3*0.4536)/((q1*0.3048)*(q1*0.3048)));
		System.out.println("Your BMI is " +bmi+".");
		if (bmi<18.5)
		{
			System.out.println("You are underweight.");
		}
		else if (18.5<bmi)
		{
			System.out.println("You are normal weight.");
		}
		else if (24.9<bmi)
		{
			System.out.println("You are overweight.");
		}
		else if (30.0<bmi)
		{
			System.out.println("You are obese.");
		}
		keyboard.close();
	}
}