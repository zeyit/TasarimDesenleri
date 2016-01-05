
public class TV implements IRemoteControl {

	@Override
	public void On() {
		System.out.println("Tv open");
	}

	@Override
	public void Off() {
		System.out.println("Tv close");
		
	}

}
