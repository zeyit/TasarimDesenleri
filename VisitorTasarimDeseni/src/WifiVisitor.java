
public class WifiVisitor implements IVisitor {

	@Override
	public void Visit(Tablet tablet) {
		if (tablet instanceof IPad) {
			System.out.println("Ipad wifi açýldý");
		}else if (tablet instanceof GalaxyTab) {
			System.out.println("GalaxyTab da wifi yok");
		}else {
			System.out.println("wifi yok");
		}
		
	}

}
