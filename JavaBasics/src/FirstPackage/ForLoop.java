package FirstPackage;

public class ForLoop {

	public static void main(String[] args) {
		
		// print 1 to 10;
	
		/*int a = 10;
		for (int i=1;i<10;i++)
		{
			System.out.println(i);
		}
		*/
		
		//String text = "Automation testing sessions";
		
		/*for(int i=0;i<text.length();i++)
		{
			//System.out.println(text.charAt(i));
			System.out.print(text.charAt(i));
		}
		*/
		/*for(int i=text.length()-1;i>=0;i--)
		{
			//System.out.println(text.length());
			System.out.println(text.charAt(i));
		}
		*/
		
		
		String student[] = {"Qasim","Achala","Usman","Ashwini","Shoaib","Anees","Achala"};
		for(int i=0;i<student.length;i++)
		{
			System.out.println(student[i]);
		}
		
		
		
		//Enhanced Forloop
		/*for (String name:student)
		{
			System.out.println(name);
		}
		*/
		/*int[] rollnums= {45,50,567,4,32};
		for (int num:rollnums)
		{
			System.out.println(num);
		}
		*/
		
		/*String text = "Automation training session for learning Testing";
		
		String[] value = text.split(" ");
		for(String x:value)
		{
			System.out.println(x);
		}*/
	}

}
