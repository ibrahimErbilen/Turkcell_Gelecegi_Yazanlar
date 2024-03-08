import java.util.Date;

public class Calisan {

	private String isim;
	private String bolum;
	private Date iseGirisTarihi;

	public Calisan() {

	}

	public Calisan(String bolum) {
		this.bolum = bolum;
	}

	public Calisan(String isim, String bolum) {
		this.isim = isim;
		this.bolum = bolum;
	}

	public Calisan(String isim, String bolum, Date iseGirisTarihi) {
		this.isim = isim;
		this.bolum = bolum;
		this.iseGirisTarihi = iseGirisTarihi;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public Date getIseGirisTarihi() {
		return iseGirisTarihi;
	}

	public void setIseGirisTarihi(Date iseGirisTarihi) {
		this.iseGirisTarihi = iseGirisTarihi;
	}
	
	public void bilgileriYazdir() {
		System.out.println("İsim : "+getBolum());
		System.out.println("Bölüm :"+getIsim());
		System.out.println("İşe Giriş Tarihi :"+getIseGirisTarihi());
		System.err.println("-*-*-*-*-");
	}

}
