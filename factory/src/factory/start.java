package factory;

public class start {
	
	public static void main(String[] args) {
		PcOlustur pc =new PcOlustur(new hp());
		pc.birlestir();
		 pc =new PcOlustur(new intel());
		pc.birlestir();
	}
}
