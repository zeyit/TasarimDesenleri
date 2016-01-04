
public class TeknisyenMaasHesapl implements MaasHesap{

	private izinHesap departman;
	public izinHesap getDepartman() {
		return departman;
	}
	public void setDepartman(izinHesap departman) {
		this.departman = departman;
	}
	@Override
	public int maasHesapla() {
		// TODO Auto-generated method stub
		return 1800;
	}

}
