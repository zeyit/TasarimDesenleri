
public class ConcreateHandlerAvi  extends playerHandler{
	
	public void play(String path) {
		
		if (path.lastIndexOf("avi") !=-1) {
			System.out.println("avi çalýyor "+path);
		}else {
			System.out.println(path+" dosya açýlamýyor  ");
		}
	}
}
