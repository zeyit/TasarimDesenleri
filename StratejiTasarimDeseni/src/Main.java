
public class Main {
	public static void main(String[] args) {
		YoneticiMaasHesap yonetici =new YoneticiMaasHesap();
		yonetici.setDepartman(new DepertmanAizinHesap());
		
		MuhendisMaasHesap muh =new MuhendisMaasHesap();
		muh.setDepartman(new DepertmanBizinHesap());
		
		Eleman eleman =new Eleman();
		
		eleman.maasHesapla(yonetici);
		eleman.izinHesap(yonetici.getDepartman());
		
		eleman.maasHesapla(muh);
		eleman.izinHesap(muh.getDepartman());
		
	}
}
