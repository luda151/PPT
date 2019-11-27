import java.util.*; 


public class Tool_Funkce {

	final int pocetVysledku=50;

	public KvadratickaFunkce kf;
	public float min;
	public float max;
	public float step;


	public Tool_Funkce(float min, float max, float step,KvadratickaFunkce kf ) {
		this.min=min;
		this.max=max;
		this.step=step;
		this.kf=kf;

	}

	public double[] vzorkovani_I() {

		double[] vysledky = new double[pocetVysledku];

		float x=min;
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

	public void vzorkovani_II() {
		double[] vysledky = new double[pocetVysledku];
		double[] xka = new double[pocetVysledku];

		float x=min;
		for(int i=0; i< pocetVysledku; i++) {
			if(x < max) {
				xka[i]=x;
				vysledky[i]=kf.vypocetFunkciHodnoty(x);
				x=x+this.step;
			}else {
				break;
			}
		}
		System.out.println("Xka:\n"+ Arrays.toString(xka));
		System.out.println("Vysledky:\n"+ Arrays.toString(vysledky));

	}

	public Vzorek[] vzorkovani_III() {
		Vzorek[] vysledky = new Vzorek[pocetVysledku];
		

		float x=min;
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