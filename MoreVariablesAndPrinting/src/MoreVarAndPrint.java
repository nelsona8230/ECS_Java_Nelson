//this command is to explain some ones statistics
public class MoreVarAndPrint 
{
	public static void main(String[] args)
	{
		String myname, myeyes, myteeth, myhair;
		int myage, myheight, myweight;
		
		myname = "Zed A. Shaw";
		myage = 35;  //not a lie
		myheight = 76; //inches
		myweight = 180; //lbs
		myeyes = "blue";
		myteeth = "white";
		myhair = "Brown"; 
		
		System.out.println("Let's talk about " + myname + ".");
		System.out.println("He's " + myheight + " inches tall." );
		System.out.println("He's " + myweight + " pounds.");
		System.out.println("Actually, that's not too heavy");
		System.out.println("He's got " + myeyes + " eyes and " +  myhair + "hair");
		System.out.println("His teeth are usually " +myteeth+ " depending on the coffee.");
		System.out.println("If I add " +myage+ ", " +myheight+ ", and " +myweight+ " I get " +(myweight+myheight+myage)+ "." );
	}

}
