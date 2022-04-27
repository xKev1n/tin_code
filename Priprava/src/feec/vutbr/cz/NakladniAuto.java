package feec.vutbr.cz;

public class NakladniAuto extends Auto {
	private Prives prives;
	
	public NakladniAuto(String VIN, String nazev, String barva) {
		super(VIN, nazev, barva);
		// TODO Auto-generated constructor stub
	}
	public Prives getPrives() {
		return prives;
	}
	public void setPrives(Prives prives) {
		this.prives = prives;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (this.getPrives() == null)
		{
			return "Nakladni Auto "+super.getNazev() +" s VIN "+super.getVIN()+" a barvou "+super.getBarva()+" bez privesu";
		}
		else
		{
			return "Nakladni Auto "+super.getNazev() +" s VIN "+super.getVIN()+" a barvou "+super.getBarva()+" s privesem: "+this.getPrives();
		}
		
	}
}
