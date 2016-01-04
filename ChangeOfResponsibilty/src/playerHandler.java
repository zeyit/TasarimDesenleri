
public abstract class playerHandler {
	private playerHandler next;

	public playerHandler getNext() {
		return next;
	}

	public void setNext(playerHandler next) {
		this.next = next;
	}
	
	public abstract void play(String path);
}
