package FirstPackage;

public class Samsung implements TelecomAuthorityInterface   {

	
	public static void main(String[] args) {
		Samsung obj = new Samsung();
		obj.IncomingCall();
		obj.EndCall();
		obj.Messages();
		obj.CallDivert();
		obj.CallWaiting();

	}

	@Override
	public void IncomingCall() {
		System.out.println("Scroll down");
		
	}

	@Override
	public void EndCall() {
		System.out.println("Scroll up");
		
	}

	@Override
	public void Messages() {
		System.out.println("samsung Messages");
		
	}

	@Override
	public void CallWaiting() {
		System.out.println("samsung CallWaiting");
		
	}

	@Override
	public void CallDivert() {
		System.out.println("samsung CallDivert");
		
	}
	
	public void Playstore()
	{
		System.out.println("Samsung Playstore");
	}
	
	public void Rarecam()
	{
		System.out.println("Samsung 12 MP");
	}
	
	public void FrontCam()
	{
		System.out.println("Samsung 16Mp");
	}

}
