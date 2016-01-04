
public class ConcreateHandlerMpg extends playerHandler {

	public void play(String path) {
		if (path.lastIndexOf("mpg") !=-1) {
			System.out.println("mpg çalýyor "+path);
		}else {
			if (super.getNext() !=null) {
				getNext().play(path);
			}
		}
		
	}

}
