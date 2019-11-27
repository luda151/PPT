
public class Vzorek {
	public float x;
	public float hodnota;

	public Vzorek(float x, float hodnota) {
		this.x=x;
		this.hodnota=hodnota;
	}

	@Override
	public String toString() { 
		return String.format("Vzorek v bode: "+this.x+" ma hodnotu: "+this.hodnota); 
	} 
}
