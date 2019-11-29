
public class Vzorek {
	public double x;
	public double hodnota;

	public Vzorek(double x, double hodnota) {
		this.x=x;
		this.hodnota=hodnota;
	}

	@Override
	public String toString() { 
		return String.format("Vzorek v bode: "+this.x+" ma hodnotu: "+this.hodnota); 
	} 
}
