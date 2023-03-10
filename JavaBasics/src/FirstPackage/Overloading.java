package FirstPackage;

public class Overloading {
	
	//overridding happens in between sub class and super class
	//Overloading happens only in same class
	
	//in a class we cant create a multiple methods with same name
	
	public void getData(int x)
	{
		System.out.println("Method1");
	}
	
	public void getData(int x, int y)
	{
		System.out.println("Method2");
	}
	
	public void getData(int x, int y, int z)
	{
		System.out.println("Method3");
	}
	
	public void getData(int x, String y)
	{
		System.out.println("Method4");
	}
	
	public void getData(String X)
	{
		System.out.println("Method5");
	}

	public static void main(String[] args) {
		
		Overloading obj = new Overloading();
		obj.getData(10, 20);
		obj.getData("Testing");
		obj.getData(69);

	}

}
