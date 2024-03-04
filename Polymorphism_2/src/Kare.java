
public class Kare extends Sekil {

	private int kenarUzunlugu;

	public Kare(int kenarUzunlugu) {
		this.kenarUzunlugu = kenarUzunlugu;
	}

	public int getKenarUzunlugu() {
		return kenarUzunlugu;
	}

	public void setKenarUzunlugu(int kenarUzunlugu) {
		this.kenarUzunlugu = kenarUzunlugu;
	}

	public void alan() {
		System.out.println("Kare Alan : " + (Math.pow(kenarUzunlugu, 2)));
	}
}
