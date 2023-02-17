package FirstPackage;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Encapsulation  obj = new Encapsulation();
		obj.setNRN(34624573);
		obj.setName("Testing");
		obj.setEmailid("Testing@gmail.com");
		obj.setPhonenum(775376453);
		
		System.out.println(obj.getNRN());
	}

}
