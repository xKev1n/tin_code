package feec.vutbr.cz;

public abstract class Auto {
	private String VIN;
	private String nazev;
	private String barva;
	
	public Auto(String VIN, String nazev, String barva)
	{
		this.barva=barva;
		this.nazev=nazev;
		this.VIN=VIN;
	}
	
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}
	
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	
	public String getBarva() {
		return barva;
	}
	public void setBarva(String barva) {
		this.barva = barva;
	}
}
