package FirstPackage;

public class ThisKeyword {
	
	int y = 10; // instance or Global Variable
	
	//local variable - when a variable is declared inside a method then it is called local variable. it can be used only within the method
	//Global variable - when a variable is declared outside a method then it is called global variable, global variable can be used 
	//throughtout the class
	
	// THIS keyword - whenever there is a local and global variable with same name, using THIS keyword we can use global variable value
	
	public void getData()
	{
		int y = 20; // local variable
		//System.out.println(y);
		System.out.println(this.y);
	}
	
	public void login()
	{
		System.out.println(y);
	}

	public static void main(String[] args) {

		ThisKeyword S = new ThisKeyword();
		S.getData();
		S.login();
		

	}

}
