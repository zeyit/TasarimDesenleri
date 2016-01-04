package factory;

public class intel implements IFabrika{

	@Override
	public IRam CreateRam() {
		// TODO Auto-generated method stub
		return new intelRam();
	}

	@Override
	public IHdd CreateHdd() {
		// TODO Auto-generated method stub
		return new intelHdd();
	}

	
	
}
