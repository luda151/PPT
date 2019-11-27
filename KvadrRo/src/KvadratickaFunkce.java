public class KvadratickaFunkce {

	private float a;
	private float b;
	private float c;

	/**
	 * Konstruktor, který vytvoří instanci tridy KravdratickaFunkce se zadanimy parametry 
	 * @param new_a
	 * @param new_b
	 * @param new_c
	 */
	public KvadratickaFunkce(float new_a, float new_b, float new_c) {
		this.a=new_a;
		this.b=new_b;
		this.c=new_c;
	}

	/**
	 * 
	 * @return a
	 */
	public float getA() {
		return this.a;
	}

	/**
	 * 
	 * @return b
	 */
	public float getB() {
		return this.b;
	}

	/**
	 * 
	 * @return c
	 */
	public float getC() {
		return this.c;
	}

	public float diskriminant(){
		return this.getB() * this.getB() - 4 * this.getA() * this.getC();
	}


	public void vypocetKorenu() {

		float x1,x2;
		float d=this.diskriminant();
		if (d > 0) {
			x1 = (-b + (float) Math.sqrt(d)) / (2 * a);
			x2 = (-b - (float) Math.sqrt(d)) / (2 * a);
			System.out.println("Rovnice má dvě řešení.");
			System.out.print("x1 = " + x1 + "\nx2 = " + x2+"\n");
		} else if (d == 0) {
			x1 = -b / (2 * a);
			System.out.println("Rovnice má jedno řešení.");
			System.out.print("x = " + x1+"\n");
		} else {
			System.out.print("Rovnice nemá řešení\n");
		}	
	}

	public float vypocetFunkciHodnoty(float x) {

		return ((this.getA()* x * x) + (this.getB()*x + this.getC()));

	}
}
