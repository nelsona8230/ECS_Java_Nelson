import java.util.Random;
import java.util.Scanner;
public class Dice 
{
	public static void main(String[]args)
	{
		Random r = new Random();
		Random t = new Random();
		int x = 1 + r.nextInt(6);
		int y = 1 + t.nextInt(6); 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("HERE COMES THE DICE");
		System.out.print("Roll 1: ");
		System.out.println(x);
		System.out.print("Roll 2: ");
		System.out.println(y);
		System.out.print("The total is " +(x+y)+"!");
	}
}