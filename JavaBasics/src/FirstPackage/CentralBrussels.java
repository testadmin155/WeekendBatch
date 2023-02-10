package FirstPackage;

public class CentralBrussels extends NationalsignalingSystem{

	public static void main(String[] args) {
		CentralBrussels obj = new CentralBrussels();
		obj.greenlight();
		obj.redlight();
		obj.OrangeLight();
		obj.greenlightwaittime();
		obj.redlightwaittime();
		obj.Orangelightwaittime();

	}

	@Override
	public void greenlightwaittime() {
		System.out.println("GReenlight wait for 60secs");
		
	}

	@Override
	public void redlightwaittime() {
		System.out.println("Redlight wait for 20secs");
		
	}

	@Override
	public void Orangelightwaittime() {
		System.out.println("Orangelight wait for 15secs");
		
	}

}
