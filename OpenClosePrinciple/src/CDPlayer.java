
public class CDPlayer implements IRemoteControl {

	@Override
	public void On() {
		System.out.println("CDPlayer open");
		
	}

	@Override
	public void Off() {
		System.out.println("CDPlayer close");
		
	}

}
