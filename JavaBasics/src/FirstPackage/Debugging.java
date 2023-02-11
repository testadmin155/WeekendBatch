package FirstPackage;

public class Debugging {

	public void getdata()
	{
		System.out.println("Hello");
		System.out.println("Hi");
		System.out.println("How r u");
		System.out.println("Bye");
		System.out.println("Good Night");
		System.out.println("Bye bye");
		System.out.println("See you tomorrow");
	}
	
	public static void main(String[] args) {
		
		Debugging obj = new Debugging();
		
		obj.getdata();
		System.out.println("Line1");
		System.out.println("Line2");
		System.out.println("Line3");
		obj.getdata();
		obj.getdata();
		System.out.println("Line4");
		obj.getdata();
		System.out.println("Line5");
		System.out.println("Line6");
		obj.getdata();
		obj.getdata();
		System.out.println("Line7");

	}

}
