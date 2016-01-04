
public class Main {
	public static void main(String[] args) {
		CompositiCalisan mudur =new CompositiCalisan("Zeyit", enPosition.Mudur);
			mudur.Ekle(new LeafCalisan("Ali",enPosition.Isci));
			mudur.Ekle(new LeafCalisan("Ahmet",enPosition.Isci));
		//mudur.Goster();
		CompositiCalisan gmudur =new CompositiCalisan("qwerty", enPosition.GenelMudur);
			gmudur.Ekle(mudur);
			gmudur.Ekle(new LeafCalisan("veli",enPosition.Isci));
		gmudur.Goster();
	}
}
