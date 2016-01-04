package factory;

public class hp  implements IFabrika{

	@Override
	public IRam CreateRam() {
		// TODO Auto-generated method stub
		return new hpRam();
	}

	@Override
	public IHdd CreateHdd() {
		// TODO Auto-generated method stub
		return new hpHdd();
	}

	
}
