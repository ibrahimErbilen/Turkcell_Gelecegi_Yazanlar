
public class Memur extends Calisan{
	
	private String birim;

	public Memur(String isim, String gorev, String birim ,int maas) {
		super(isim, gorev, maas);
		this.birim=birim;
	}

	public String getBirim() {
		return birim;
	}

	public void setBirim(String birim) {
		this.birim = birim;
	}
	
	public void ozet() {
		System.out.println("Memur İsim : " + getIsim());
		System.out.println("Memur Görev : " + getGorev());
		System.out.println("Memur Maaş : " + getMaas());
		System.out.println("Memur Birim : " + getBirim());
	}
	

}
