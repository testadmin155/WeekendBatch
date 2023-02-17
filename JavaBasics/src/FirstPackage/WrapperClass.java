package FirstPackage;

public class WrapperClass {
	
	//Wrapper class are predefined class by java, which contains primitive data type
	//Wrapper class is used to wrap primitive values
	
	//int   - Integer
	//double - Double
	//char - Character
	//boolean - Boolean

	public static void main(String[] args) {
		
		String mobileprice = "10000.99";
		String headsetprice = "2000.00";
		
		//String totalprice = mobileprice+headsetprice;
		//System.out.println(totalprice);
		
		/*int mobile = Integer.parseInt(mobileprice);
		int heatset=Integer.parseInt(headsetprice);
		
		int totalprice = mobile+heatset;
		System.out.println(totalprice);
		*/
		
		double mobile = Double.parseDouble(mobileprice);
		double heatset=Double.parseDouble(headsetprice);
		
		double totalprice = mobile+heatset;
		System.out.println(totalprice);

	}

}
