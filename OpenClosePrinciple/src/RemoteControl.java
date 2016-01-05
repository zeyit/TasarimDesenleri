
public class RemoteControl {
	
	IRemoteControl remote;
	
	public RemoteControl(IRemoteControl remote) {
		this.remote=remote;
	}
	
	public void On() {
		remote.On();
	}
	
	public void Off() {
		remote.Off();
	}
}
