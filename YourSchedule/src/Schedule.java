//in this command we use variables to make a schedule
public class Schedule 
{
	public static void main(String[] args)
	{
		String p1, p2, p3, p4, bio, math, ecs, eng, di, far, cu, bro;
		p1 = "Per 1";
		p2 = "Per 2";
		p3 = "Per 3";
		p4 = "Per 4";
		bio = "Biology";
		math = "Math1";
		ecs = "ECS";
		eng = "English";
		di = "Dickinson";
		far = "Farrar";
		cu = "Cummings";
		bro = "Brown";
		
		System.out.println("Nelson's Class Schedule");
		System.out.println("");
		System.out.println("________________________________________");
		System.out.println("|" +p1+"    |    "+eng+"   |    " +di+ "|");
		System.out.println("|" +p2+"    |    "+ecs+"       |     "+far+"  |");
		System.out.println("|" +p3+"    |    "+math+"     |   "+cu+"  |");
		System.out.println("|" +p4+"    |    "+bio+"   |    "+bro+ "    |");
		System.out.println("|______________________________________|");
	}
}
