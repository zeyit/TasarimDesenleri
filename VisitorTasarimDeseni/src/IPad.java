
public class IPad extends Tablet{

	public IPad(String brand,String Model) {
		super(brand, Model);
	}

	@Override
	public void Accept(IVisitor visit) {
		visit.Visit(this);
		
	}
}
