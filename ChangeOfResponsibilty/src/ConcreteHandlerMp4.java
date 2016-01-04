
public class ConcreteHandlerMp4  extends playerHandler{

	public void play(String path) {
		if (path.lastIndexOf("mp4") !=-1) {
			System.out.println("mpt4 çalýyor "+path);
		}else {
			if (super.getNext() !=null) {
				getNext().play(path);
			}
		}
		
	}

}
