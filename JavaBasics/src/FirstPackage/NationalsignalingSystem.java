package FirstPackage;

public abstract class NationalsignalingSystem {

	public void greenlight() {
		System.out.println("Go");
	}
	
	public void redlight() {
		System.out.println("Stop");
	}
	
	public void OrangeLight() {
		System.out.println("Wait");
	}
	
	public abstract void greenlightwaittime();
	public abstract void redlightwaittime();
	public abstract void Orangelightwaittime();
	
	public static void main(String[] args) {
		

	}

}
