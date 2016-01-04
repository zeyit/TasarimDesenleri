
public class istemci {
	public static void main(String[] args) {
		playerHandler mp4 =new ConcreteHandlerMp4();
		playerHandler mpg =new ConcreateHandlerMpg();
		playerHandler avi =new ConcreateHandlerAvi();
		
		
		mp4.setNext(mpg);
		//mpg.setNext(avi);
		
		mp4.play("asd.avi");
		mp4.play("asd.mp4");
		mp4.play("asd.mpg");
		mp4.play("asd.asd");
	}
}
