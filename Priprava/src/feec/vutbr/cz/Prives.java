package feec.vutbr.cz;

public class Prives {
	private String VIN;
	private NakladniAuto ci_prives;
	
	public Prives(String VIN, NakladniAuto ci_prives)
	{
		this.VIN = VIN;
		this.setCi_prives(ci_prives);
		ci_prives.setPrives(this);
	}

	public String getVIN() {
		return VIN;
	}

	public void setVIN(String vIN) {
		VIN = vIN;
	}

	public Auto getCi_prives() {
		return ci_prives;
	}

	public void setCi_prives(NakladniAuto ci_prives) {
		this.ci_prives = ci_prives;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Prives s VIN "+this.getVIN();
	}
}
