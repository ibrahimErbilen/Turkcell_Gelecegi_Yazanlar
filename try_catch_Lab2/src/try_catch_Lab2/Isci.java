package try_catch_Lab2;

public class Isci {
	
	private String isim;
	private double maas;
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) throws HataliDeger{
		if (isim == null || isim.trim().length() == 0) {//trim() boşlukları kaldır
			throw new HataliDeger(isim, isim);
		}
		this.isim = isim;
	}
	public double getMaas() {
		return maas;
	}
	public void setMaas(double maas) throws HataliDeger {
		if (maas < 0) {
			throw new HataliDeger("maas", maas);
		}
			
		this.maas = maas;
	}
	
	public String toString() {
		return "İsim :" + isim + "\nMaaş :" + maas;
	}
	
	
}
