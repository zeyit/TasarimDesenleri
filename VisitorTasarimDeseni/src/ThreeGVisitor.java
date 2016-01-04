
public class ThreeGVisitor implements IVisitor{

	@Override
	public void Visit(Tablet tablet) {
		if (tablet instanceof IPad) {
			System.out.println("IPad 3G açýldý");
		}else if (tablet instanceof GalaxyTab) {
			System.out.println("GalaxyTab 3G Açýldý");
		}else {
			System.out.println("3G yok");
		}
		
	}

}
