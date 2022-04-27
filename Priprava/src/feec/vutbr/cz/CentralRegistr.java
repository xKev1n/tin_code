package feec.vutbr.cz;

import java.util.HashMap;

public class CentralRegistr {
	private HashMap<String, Auto> auta;
	
	public CentralRegistr()
	{
		auta = new HashMap<String, Auto>();
	}
	
	public void addAuto(Auto a)
	{
		this.auta.put(a.getVIN(), a);
	}
	
	public Auto findAuto(String VIN)
	{
		return this.auta.get(VIN);
	}
	
	public void printAuta()
	{
		for (String VIN : auta.keySet()) {
			System.out.println(VIN+": "+auta.get(VIN));
		}
	}
}
