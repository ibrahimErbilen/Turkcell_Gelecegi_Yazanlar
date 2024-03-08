
public class Ogrenci {

	private String kimlik;
	private String ad;
	private String soyAd;
	private String sinif;

	public Ogrenci() {

	}

	public Ogrenci(String kimlik) {
		this.kimlik = kimlik;
	}

	public Ogrenci(String kimlik, String ad) {
		this.kimlik = kimlik;
		this.ad = ad;
	}

	public Ogrenci(String kimlik, String ad, String soyAd) {
		this.kimlik = kimlik;
		this.ad = ad;
		this.soyAd = soyAd;
	}

	public Ogrenci(String kimlik, String ad, String soyAd, String sinif) {
		this.kimlik = kimlik;
		this.ad = ad;
		this.soyAd = soyAd;
		this.sinif = sinif;
	}

	public String getKimlik() {
		return kimlik;
	}

	public void setKimlik(String kimlik) {
		this.kimlik = kimlik;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyAd() {
		return soyAd;
	}

	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}

	public String getSinif() {
		return sinif;
	}

	public void setSinif(String sinif) {
		this.sinif = sinif;
	}

}
