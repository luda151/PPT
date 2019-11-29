public class KvadratickaFunkce {

	private double a;
	private double b;
	private double c;

	/**
	 * Konstruktor, který vytvoří instanci tridy KravdratickaFunkce se zadanimy parametry 
	 * @param new_a
	 * @param new_b
	 * @param new_c
	 */
	public KvadratickaFunkce(double new_a, double new_b, double new_c) {
		this.a=new_a;
		this.b=new_b;
		this.c=new_c;
	}

	/**
	 * 
	 * @return a
	 */
	public double getA() {
		return this.a;
	}

	/**
	 * 
	 * @return b
	 */
	public double getB() {
		return this.b;
	}

	/**
	 * 
	 * @return c
	 */
	public double getC() {
		return this.c;
	}

	public double diskriminant(){
		return this.getB() * this.getB() - 4 * this.getA() * this.getC();
	}


	public void vypocetKorenu() {

		Tool_IO io=new Tool_IO();
		double x1,x2;
		double d=this.diskriminant();
		if (d > 0) {
			x1 = (-b + (double) Math.sqrt(d)) / (2 * a);
			x2 = (-b - (double) Math.sqrt(d)) / (2 * a);
			//System.out.println("Rovnice má dvě řešení.\n");
			//System.out.print("x1 = " + x1 + "\nx2 = " + x2+"\n");
			io.writeFirst("Rovnice má dvě řešení.\n");
			io.writeToFile("x1 = " + x1 + "\nx2 = " + x2+"\n");
			io.writeNewLine();

		} else if (d == 0) {
			x1 = -b / (2 * a);
			io.writeFirst("Rovnice má jedno řešení.\n");
			io.writeToFile("x = " + x1+"\n");
			
			//System.out.println("Rovnice má jedno řešení.");
			//System.out.print("x = " + x1+"\n");
		} else {
			io.writeFirst("Rovnice nemá řešení");
			//System.out.print("Rovnice nemá řešení\n");
		}	
	}

	public double vypocetFunkciHodnoty(double x) {

		return ((this.getA()* x * x) + (this.getB()*x + this.getC()));

	}
}
