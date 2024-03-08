
public class Basketbolcu extends Oyuncu{

	//anatasyon koyuluyor
	//görevi abstract class içerisindeki metot ile isimli 
	//metodu yanlışlıkla yazmadığımızı belirtir
	@Override
	public void sutCek() {
		System.out.println("Basketbolcu sut Attı");
	}

	@Override
	public void pasVer() {
		System.out.println("Basketbolcu pas verdi");
		
	}

}
