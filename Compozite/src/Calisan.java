
public class Calisan {
	private String Ad;
	public String getAd() {
		return Ad;
	}

	public void setAd(String ad) {
		Ad = ad;
	}

	private enPosition pozisyon;
	
	public enPosition getPozisyon() {
		return pozisyon;
	}

	public void setPozisyon(enPosition pozisyon) {
		this.pozisyon = pozisyon;
	}

	public Calisan(String Ad , enPosition position) {
		this.Ad=Ad;
		this.pozisyon=position;
	}
	
	public void Goster()
	{
		System.out.println("Ad:" +this.Ad +" Pozisyon :"+this.pozisyon.toString());
	}
}
