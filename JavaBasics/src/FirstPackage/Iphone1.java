package FirstPackage;

public class Iphone1 implements TelecomAuthorityInterface{

	public static void main(String[] args) {
		
// implements is the keyword which we user to impelment an Interface in a class
	// interface contains unimplemented methods
		
		//create an object 
		
		Iphone1 obj = new Iphone1();
		obj.IncomingCall();
		obj.EndCall();
		obj.Messages();
		obj.CallDivert();
		obj.CallWaiting();
		obj.AppStore();
		obj.facetime();
		obj.FrontCam();
		obj.Itunes();
		obj.RareCam();
		
	}

	@Override
	public void IncomingCall() {
		System.out.println("Iphone1 Scroll up");
		
	}

	@Override
	public void EndCall() {
		System.out.println("Iphone1 Scroll down");
		
	}

	@Override
	public void Messages() {
		System.out.println("IPhone1 Messages");
		
	}

	@Override
	public void CallWaiting() {
		System.out.println("IPhone1 Callwaiting");
		
	}

	@Override
	public void CallDivert() {
		System.out.println("IPhone1 CallDivert");
	}
	
	public void facetime()
	{
		System.out.println("Iphone1 facetime");
	}
	
	public void AppStore()
	{
		System.out.println("Iphone1 AppStore");
	}
	
	public void Itunes()
	{
		System.out.println("Iphone1 Itunes");
	}
	
	public void FrontCam()
	{
		System.out.println("Iphone1 Frontcam - 16MP");
	}
	
	public void RareCam()
	{
		System.out.println("Iphone1 RareCam - 32MP");
	}

	
}
