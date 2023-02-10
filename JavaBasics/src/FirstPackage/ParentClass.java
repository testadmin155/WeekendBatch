package FirstPackage;

public class ParentClass extends grandparentClass {
	
	public void Bike()
	{
		System.out.println("Hero");
	}
	
	public void Job()
	{
		System.out.println("Job");
	}
	
	public void Money()
	{
		System.out.println("Money");
	}

	public void NoFreeTime()
	{
		System.out.println("NoFreeTime");
	}
	

	public static void main(String[] args) {
		
		ParentClass obj = new ParentClass();
		obj.Bike();
		obj.Job();
		obj.NoFreeTime();
		obj.Money();
		obj.land();
		obj.Flat();
		
		

	}

}
