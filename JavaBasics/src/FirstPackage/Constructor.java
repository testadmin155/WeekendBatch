package FirstPackage;

public class Constructor {

	// whenever we create an object constructor is executed
	
	public Constructor(int x) 
	{
		System.out.println("I am a constructor2");
	}
	
	public Constructor(int y,int x) 
	{
		System.out.println("I am a constructor3");
	}
	
	public Constructor(String x) 
	{
		System.out.println("I am a constructor4");
	}
	
	public void getData(int x)
	{
		System.out.println("this is a Method");
	}
	
	
	public static void main(String[] args) {
		
		/*Constructor obj = new Constructor("Testing");
		Constructor obj1 = new Constructor(10);
		Constructor obj2 = new Constructor(10,20);
		*/
		
		Constructor obj = new Constructor(10);
		obj.getData(20);
		
	}

}