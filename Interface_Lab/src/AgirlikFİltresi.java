
public class AgirlikFİltresi implements ElmaFiltresi{

	@Override
	public boolean filtrele(Elma elma) {
		return elma.getAgarlik() >= 80;
	}

	
}
