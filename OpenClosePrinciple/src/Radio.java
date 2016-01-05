
public class Radio implements IRemoteControl{

	@Override
	public void On() {
		System.out.println("Radio open");
		
	}

	@Override
	public void Off() {
		System.out.println("Radio close");
		
	}

}
