
public class Main {
	public static void main(String[] args) {
		IPad ipad =new IPad("", "Apple");
		GalaxyTab gtap =new GalaxyTab("", "Apple");
		


		ipad.Accept(new WifiVisitor());
		gtap.Accept(new WifiVisitor());
		
		
		
		ipad.Accept(new ThreeGVisitor());
		gtap.Accept(new ThreeGVisitor());
		
	}
}
