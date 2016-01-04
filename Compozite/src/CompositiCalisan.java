import java.util.ArrayList;

public class CompositiCalisan extends Calisan{

	ArrayList<Calisan> calisanlar;
	
	public CompositiCalisan(String Ad,enPosition position) {
		super(Ad, position);
		calisanlar=new ArrayList<Calisan>();
	}
	
	public void Ekle(Calisan kisi) {
		calisanlar.add(kisi);
	}
	@Override
	public void Goster() {
		super.Goster();
		for (int i = 0; i < calisanlar.size(); i++) {
			System.out.print("    ");
			calisanlar.get(i).Goster();
		}
	}
}
