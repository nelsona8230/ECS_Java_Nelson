import java.util.Scanner;
public class UserInOfData 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String fname, lname, log;
		int grade, studid;
		double gpa;
		
		System.out.print("First name:");
		fname = keyboard.next();
		
		System.out.print("Last name:");
		lname = keyboard.next();
		
		System.out.print("Grade (9-12):" );
		grade = keyboard.nextInt();
		
		System.out.print("Student ID:");
		studid = keyboard.nextInt();
		
		System.out.print("Login:");
		log = keyboard.next();

		System.out.print("GPA:");
		gpa = keyboard.nextDouble();
		
		System.out.println("Your information:");
		System.out.println("		Login:  "+log+ "");
		System.out.println("		ID:     "+studid+ "");
		System.out.println("		Name:   "+fname+ "," +lname+"");
		System.out.println("		Gpa:    "+gpa+ "");
		System.out.println("		Grade:  "+grade+ "");

	}
}
