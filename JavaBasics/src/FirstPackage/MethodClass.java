package FirstPackage;

public class MethodClass {

	//class contains Variable and Methods or Functions
	
	//Methods or Functions:
			
	/*Defnition: 
			
	Whenever we feel some set of lines of code can be reused multiple times, then we will place 
	that code in a Method and call that method when needed. Method should be created only outside Main
	*/

	// Methods can be called by creating an object
	
	//Method
	public void Login()
	{
		System.out.println("Enter username as Anees");
		System.out.println("Enter password as Password of Anees");
		System.out.println("Click on Login");
		
	}
	
	public static void main(String[] args) {
		

    // Creation of Object
		
    //Syntax of creation of Object is : Classname objectname = new classname();
		
	
		MethodClass S1 = new MethodClass();
		Method1Class S2 = new Method1Class();
		
		S1.Login();
		
		S2.GetData();
        S1.Login();
        S1.Login();
        S1.Login();
        S1.Login();
        S1.Login();
		System.out.println("how are you");
		S2.GetData();
		S1.Login();
		
		S2.GetData();
		S1.Login();
		
		S2.GetData();
		S1.Login();
		
		S2.GetData();
		
		

	}

}
