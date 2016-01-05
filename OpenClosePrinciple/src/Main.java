
public class Main {

	public static void main(String[] args) {
		TV tv =new TV();
		Radio radio =new Radio();
		CDPlayer cdplayer =new CDPlayer();
		System.out.println("-----------TV--------------");
		RemoteControl rc =new RemoteControl(tv);
		rc.On();
		rc.Off();
		System.out.println("-----------Radio-------------");
		rc =new RemoteControl(radio);
		rc.On();
		rc.Off();
		System.out.println("-----------CDPlayer-----------");
		rc =new RemoteControl(cdplayer);
		rc.On();
		rc.Off();

	}

}
