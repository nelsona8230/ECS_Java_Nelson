import java.util.Scanner;
public class MethodPass 
{
	public static void main(String[]args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Pick a Number");
		int num = keyboard.nextInt();
		boolean a = bob(num);
		if (a){
			System.out.println("I like that number!");
		}
		else{
			System.out.println("Eww, that number's gross");
		}
		
	}
	public static boolean bob(int s1)
{
		boolean g1;
		if (s1%3==0)
			g1=true;
		else
			g1=false;
		
		return g1;
}
}