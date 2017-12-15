import java.util.Scanner;
public class AreaCalcRepeat 
{
	public static void main(String[]args)
	{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("1.Triangle");
	System.out.println("2.Rectangle");
	System.out.println("3.Square");
	System.out.println("4.Circle");
	System.out.println("5.Quit");
	System.out.println("Which Shape?");
	int which  = keyboard.nextInt();
	if(which ==1)
	{
		double area1 = tri();
		System.out.println("The area is: " +area1+".");
	}
	else if(which==2)
	{
		double area2 = rect();
		System.out.println("The area is: " +area2+".");
	}
	else if(which==3)
	{
		double area3 = squ();
		System.out.println("The area is: " +area3+".");
	}
	else if(which==4)
	{
		double area4 = cir();
		System.out.println("The area is: " +area4+".");
	}
	else
	{
		System.out.println("Goodbye!!");
	}
	}
	public static double tri( )
	{
		double tri;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Base: ");
		double b =keyboard.nextDouble();
		System.out.print("Height: ");
		double h = keyboard.nextDouble();
		tri = (b*h*.5);
		return tri;
	}
	public static double rect()
	{
	double rect;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Length: ");
	double l =keyboard.nextDouble();
	System.out.print("Width: ");
	double w = keyboard.nextDouble();
	rect = (l*w);
	return rect;
	}
	public static double squ()
	{
		double squ;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Side: ");
		double s =keyboard.nextDouble();
		squ = (s*s);
		return squ;
	}
	public static double cir()
	{
		double cir;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Radius: ");
		double r =keyboard.nextDouble();
		cir = (3.14*r*r);
		return cir;
	}
}