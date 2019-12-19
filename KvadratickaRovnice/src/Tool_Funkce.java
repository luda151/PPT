import java.util.*; 


public class Tool_Funkce {

	final int pocetVysledku=20;

	public KvadratickaFunkce kf;
	public double min;
	public double max;
	public double step;


	public Tool_Funkce(double min, double max, double step,KvadratickaFunkce kf ) {
		this.min=min;
		this.max=max;
		this.step=step;
		this.kf=kf;

	}

	public double[] vzorkovani_I() {

		double[] vysledky = new double[pocetVysledku];

		double x=min;
		for(int i=0; i< pocetVysledku; i++) {
			if(x < max) {
				vysledky[i]=kf.vypocetFunkciHodnoty(x);
				x=x+this.step;
			}else {
				break;
			}
		}
		return vysledky;
	}

	public double[][] vzorkovani_II() {
		double[] vysledky = new double[pocetVysledku];
		double[] xka = new double[pocetVysledku];

		double x=min;
		for(int i=0; i< pocetVysledku; i++) {
			if(x < max) {
				xka[i]=x;
				vysledky[i]=kf.vypocetFunkciHodnoty(x);
				x=x+this.step;
			}else {
				break;
			}
		}
		
		double[][] arr = { xka, vysledky };
		return arr;
	}

	public Vzorek[] vzorkovani_III() {
		Vzorek[] vysledky = new Vzorek[pocetVysledku];
		

		double x=min;
		for(int i=0; i< pocetVysledku; i++) {
			if(x < max) {
				vysledky[i]= new Vzorek(x,kf.vypocetFunkciHodnoty(x));
				x=x+this.step;
			}else {
				break;
			}
		}
		
		return vysledky;
	}
}