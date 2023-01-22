package FirstPackage;

public class Split {

	public static void main(String[] args) {
	
		 String textmessage="Automation testing session for Selenium";
		 
		 System.out.println(textmessage.length());
		String splitvalue[] =  textmessage.split("for");
		 //String splitvalue[] =  textmessage.split(" ");
		System.out.println(splitvalue.length);
		System.out.println(splitvalue[0]);
		System.out.println(splitvalue[1]);
		//System.out.println(splitvalue[2]);
		//System.out.println(splitvalue[4]);
		//System.out.println(splitvalue[3]);
		
		//Normal Variable - can save only one value
		// arrays - we want to save multiple values 
		// array will save values from 0

	}

}
