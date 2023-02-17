package FirstPackage;

public class Encapsulation {

	// The process of grouping variables and its methods into a single unit is called Encapsulation
	//Encapsulation is used for data hidding, it means that we dont see actual implementation
	//This is used for security reasons and to save from hackers.
	//GEtter and Setter Method
	
	private int NRN;
	private String name;
	private int phonenum;
	private String emailid;
	
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		
		
	}

	public int getNRN() {
		return NRN;
	}

	public void setNRN(int nRN) {
		NRN = nRN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}
