package FirstPackage;

public class Exceptions {

	public static void main(String[] args) {
		
		//Web site - https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/
		
		//Arithmetic Exception
		/*int a =10;
		int b =0;
		int c = a/b;
		System.out.println(c);
		*/
		
		System.out.println("first line");
		System.out.println("second line");
		System.out.println("third line");
		
		//ArrayIndexOutOfBounds Exception
		try {
			
		int [] x = new int [5];
		x[5]=50;
			 
		//int a =10;
		//int b =0;
		//int c = a/b;
			 
		}
		
		catch (ArithmeticException error)   //Exception
		{
			System.out.println(error);
		}
		
		catch (NullPointerException error)   //Exception
		{
			System.out.println(error);
		}
		
		catch (ArrayIndexOutOfBoundsException error)   //Exception
		{
			System.out.println(error);
		}
		
		finally
		{
			System.out.println("clear browser history");
			System.out.println("close browser");
		}
		
		System.out.println("Fourth line");
		System.out.println("Fifth line");
		System.out.println("Sixth line");
		
		
	}

}
