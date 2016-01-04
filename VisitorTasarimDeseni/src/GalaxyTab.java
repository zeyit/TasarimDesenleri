
public class GalaxyTab extends Tablet{
	
	public GalaxyTab(String brand,String Model) {
		super(brand, Model);
	}

	@Override
	public void Accept(IVisitor visit) {
		visit.Visit(this);
		
	}
}
