
public class Main {
	public static void main(String[] args) {
		Urun  kitap =new Urun("java",40);
		
		kitap.uyeEkle(new uye("ali"));
		kitap.uyeEkle(new uye("akmet"));
		kitap.uyeEkle(new uye("zeyit"));
		kitap.setFiyat(80);
		
		System.out.println("--------------------------");
		kitap.setFiyat(20);
	}
}
