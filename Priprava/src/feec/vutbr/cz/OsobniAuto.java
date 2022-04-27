package feec.vutbr.cz;

public class OsobniAuto extends Auto {

	public OsobniAuto(String VIN, String nazev, String barva) {
		super(VIN, nazev, barva);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Osobni Auto "+super.getNazev() +" s VIN "+super.getVIN()+" a barvou "+super.getBarva();
	}

}
