package FirstPackage;

public class MethodParameter {

	//class contains Variable and Methods or Functions
	
	//Methods or Functions:
			
	/*Defnition: 
			
	Whenever we feel some set of lines of code can be reused multiple times, then we will place 
	that code in a Method and call that method when needed. Method should be created only outside Main
	*/

	// Methods can be called by creating an object
	
	//Method
	/*public void Login_Anees()
	{
		System.out.println("Enter username as Anees");
		System.out.println("Enter password as Password of Anees");
		System.out.println("Click on Login");
		
	}
	
	public void Login_Usman()
	{
		
		System.out.println("Enter username as Usman");
		System.out.println("Enter password as Password of Usman");
		System.out.println("Click on Login");
		
	}
	
	public void Login_Suhaib()
	{
		System.out.println("Enter username as Suhaib");
		System.out.println("Enter password as Password of Suhaib");
		System.out.println("Click on Login");
		
	}
	*/
	public void Login(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
		System.out.println("Click on Login");	
	}
	
	public static void main(String[] args) {
		

    // Creation of Object
		
    //Syntax of creation of Object is : Classname objectname = new classname();
		
		MethodParameter obj = new MethodParameter();
		
		/*obj.Login_Anees();
		obj.Login_Suhaib();
		obj.Login_Usman();
		
		obj.Login_Anees();
		obj.Login_Suhaib();
		obj.Login_Usman();
		
		obj.Login_Anees();
		obj.Login_Suhaib();
		obj.Login_Usman();
		
		obj.Login_Anees();
		obj.Login_Suhaib();
		obj.Login_Usman();
		
		obj.Login_Anees();
		obj.Login_Suhaib();
		obj.Login_Usman();
		
		obj.Login_Anees();
		obj.Login_Suhaib();
		obj.Login_Usman();
		
		obj.Login_Anees();
		obj.Login_Suhaib();
		obj.Login_Usman();
		*/
		
		obj.Login("Anees", "test1234");
		obj.Login("Suhaib", "Password1234");
		obj.Login("Usman", "Test@786");
		obj.Login("Achala", "Password@786");
		obj.Login("Ashwini", "Testing@1234");
		
		obj.Login("Anees", "test1234");
		obj.Login("Suhaib", "Password1234");
		obj.Login("Usman", "Test@786");
		obj.Login("Achala", "Password@786");
		obj.Login("Ashwini", "Testing@1234");
		
		obj.Login("Anees", "test1234");
		obj.Login("Suhaib", "Password1234");
		obj.Login("Usman", "Test@786");
		obj.Login("Achala", "Password@786");
		obj.Login("Ashwini", "Testing@1234");
		
		obj.Login("Anees", "test1234");
		obj.Login("Suhaib", "Password1234");
		obj.Login("Usman", "Test@786");
		obj.Login("Achala", "Password@786");
		obj.Login("Ashwini", "Testing@1234");
		
		obj.Login("Anees", "test1234");
		obj.Login("Suhaib", "Password1234");
		obj.Login("Usman", "Test@786");
		obj.Login("Achala", "Password@786");
		obj.Login("Ashwini", "Testing@1234");
		
		
		obj.Login("Anees", "test1234");
		obj.Login("Suhaib", "Password1234");
		obj.Login("Usman", "Test@786");
		obj.Login("Achala", "Password@786");
		obj.Login("Ashwini", "Testing@1234");
		
		
		

	}

}
