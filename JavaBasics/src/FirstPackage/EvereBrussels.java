package FirstPackage;

//Abstract Class - abstract class will have both implemented and unimplemented methods.
public class EvereBrussels extends NationalsignalingSystem{

	public static void main(String[] args) {
		EvereBrussels obj = new EvereBrussels();
		obj.greenlight();
		obj.redlight();
		obj.OrangeLight();
		obj.greenlightwaittime();
		obj.redlightwaittime();
		obj.Orangelightwaittime();

	}

	@Override
	public void greenlightwaittime() {
		System.out.println("Greenlight wait for 30secs");
		
	}

	@Override
	public void redlightwaittime() {
		System.out.println("Redlight wait for 15secs");
		
	}

	@Override
	public void Orangelightwaittime() {
		System.out.println("Orangelight wait for 10secs");
		
	}

}
