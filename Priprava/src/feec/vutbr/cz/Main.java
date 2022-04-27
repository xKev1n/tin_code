package feec.vutbr.cz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralRegistr cr = new CentralRegistr();
		
		OsobniAuto oa = new OsobniAuto("XFCA11", "Fiat Multipla", "Zelena");
		
		NakladniAuto na1 = new NakladniAuto("XCFB18", "Tatra", "Fialova metal");
		
		Prives p = new Prives("ASFI12", na1);
		
		NakladniAuto na2 = new NakladniAuto("XCFB22", "SAAB", "Oranzova");
		
		SpecAuto sa = new SpecAuto("SCFA55", "Bagr", "Zluta");
		
		cr.addAuto(oa);
		cr.addAuto(na1);
		cr.addAuto(na2);
		cr.addAuto(sa);
		
		cr.printAuta();
		
		System.out.println();
		System.out.println();
		System.out.println(cr.findAuto("XCFB18"));
		System.out.println(cr.findAuto("XCFB00"));
	}

}
