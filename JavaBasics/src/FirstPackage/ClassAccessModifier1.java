package FirstPackage;

public class ClassAccessModifier1 {
	
	//public - variables and Methods that are declared as public can be accessed by any class from same package or other package also
	//default - variables and Methods that are declared as default can be accessed by any class within the same package. classes from other package cannot access.
	//protected - variables and Methods that are declared as protected can be accessed by any class within the same package, and child classes of other package can access
	//private - variables and Methods that are declared as private can be accessed only with the same class, they can't access by other classes of same package and other package 
	
	public int x=10;
	int y=20;
	protected int z = 15;
	private int a =30;
	
	public void PublicMethod() 
	{
		System.out.println("Public Method");
	}
	
	 void defaultMethod()
	{
		System.out.println("default Method");
	}
	 
	 protected void protectedMethod()
	 {
		 System.out.println("protected Method");
	 }
	 
	 private void privateMethod()
	 {
		 System.out.println("private Method");
	 }
	
	

	public static void main(String[] args) {
		
		ClassAccessModifier1 obj = new ClassAccessModifier1();
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
		System.out.println(obj.a);
		
		obj.PublicMethod();
		obj.defaultMethod();
		obj.protectedMethod();
		obj.privateMethod();

	}

}
