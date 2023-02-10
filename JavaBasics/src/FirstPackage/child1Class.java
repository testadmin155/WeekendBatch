package FirstPackage;

//child is called as a sub class
//Parent is called as a super class

//inheritance - One class can extends to another class. By extending the sub class can use the methods of super class
//sub class can have only one super class. But a super class can have multiple sub classes

public class child1Class extends ParentClass{
	
	public void Freetime()
	{
		System.out.println("Freetime");
	}
	
	public void Bike()
	{
		System.out.println("BMW");
		super.Bike();
		
	}
	
	public void Friends()
	{
		System.out.println("Friends");
	}

	public static void main(String[] args) {
		
		child1Class obj = new child1Class();
		obj.Freetime();
		obj.Friends();
		obj.Money();
		obj.Flat();
		obj.land();

	}

}
