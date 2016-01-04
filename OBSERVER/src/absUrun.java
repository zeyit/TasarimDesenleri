
import java.util.ArrayList;

import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;

public class absUrun {
	
	private double fiyat;
	private double oncekiFiyat;
	private String urunAd;
	
	private ArrayList<IUye> uyeler =new ArrayList<IUye>();

	public absUrun(String urunAd,double fiyat) {
		this.urunAd =urunAd;
		this.fiyat =fiyat;
		oncekiFiyat =0;
	}
	
	public double getFiyat() 
	{
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		oncekiFiyat =this.fiyat;
		this.fiyat = fiyat;
		Guncelle();
	}
	
	private void Guncelle()
	{
		for (IUye item : uyeler) 
		{
			item.Update(this);
		}
	}

	public void uyeEkle(IUye uye) {
		uyeler.add(uye);
	}

	public double getOncekiFiyat() {
		return oncekiFiyat;
	}

	public void setOncekiFiyat(double oncekiFiyat) {
		this.oncekiFiyat = oncekiFiyat;
	}

	public String getUrunAd() {
		return urunAd;
	}

	public void setUrunAd(String urunAd) {
		this.urunAd = urunAd;
	}
}
