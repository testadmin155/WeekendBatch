package Selenium;

public class ActualTest extends BaseTest{

	public static void main(String[] args) {
		
		ActualTest obj = new ActualTest();
		
		//Test case -1
		System.out.println("-------------Testcase 1----------------");
		obj.browserinit();
		obj.currencyType("SAR");
		obj.checkbox("Healthcare Professionals", "HealthCareProfessional");
		obj.SelectPassanger("3", "2", 1);
		obj.FromTo("BLR", "HYD");
		obj.tearDown();
		
		
		//Test case -2
		System.out.println("------------Testcase 2-----------------");
		obj.browserinit();
		obj.currencyType("KWD");
		obj.SelectPassanger("2", "1", 2);
		obj.checkbox("Student", "Student");
		obj.FromTo("HYD", "SHL");
		obj.tearDown();
		
		//Test case -3
		System.out.println("--------------------Testcase 3--------------");
		obj.browserinit();
		obj.currencyType("GBP");
		obj.SelectPassanger("1", "0", 1);
		obj.checkbox("Armed Forces", "Defense");
		obj.FromTo("IXE", "SAG");
		obj.tearDown();
		
		
	}

}
