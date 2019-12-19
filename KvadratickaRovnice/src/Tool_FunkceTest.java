import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Tool_FunkceTest {

	double min= -5;
	double max= 5;
	double step = 1;

	double a=7;
	double b=4;
	double c=-3;
	
	@Test
	public void testVzorkovani_I() {

		KvadratickaFunkce kf = new KvadratickaFunkce(a,b,c); 
		Tool_Funkce toolFce = new Tool_Funkce(min,max,step,kf);

		double[] results = new double[20];
		results = toolFce.vzorkovani_I();	
		double[] awaited_resutst = {152.0, 93.0, 48.0, 17.0, 0.0, -3.0, 8.0, 33.0, 72.0, 125.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

		assertTrue(Arrays.equals(results, awaited_resutst));

	}
	
	@Test
	public void testVzorkovani_II() {


		KvadratickaFunkce kf = new KvadratickaFunkce(a,b,c); 
		Tool_Funkce toolFce = new Tool_Funkce(min,max,step,kf);

		double results[][] = toolFce.vzorkovani_II();

		double[] xka = {-5.0, -4.0, -3.0, -2.0, -1.0, 0.0, 1.0, 2.0, 3.0, 4.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		double[] hodnoty = {152.0, 93.0, 48.0, 17.0, 0.0, -3.0, 8.0, 33.0, 72.0, 125.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

		assertTrue(Arrays.equals(results[0], xka));
		assertTrue(Arrays.equals(results[1], hodnoty));	
	}
	
	@Test
	public void testVzorkovani_III() {

		KvadratickaFunkce kf = new KvadratickaFunkce(a,b,c); 
		Tool_Funkce toolFce = new Tool_Funkce(min,max,step,kf);
		
		Vzorek results[]=toolFce.vzorkovani_III();	
		String awaited_resutst="[Vzorek v bode: -5.0 ma hodnotu: 152.0, Vzorek v bode: -4.0 ma hodnotu: 93.0, Vzorek v bode: -3.0 ma hodnotu: 48.0, Vzorek v bode: -2.0 ma hodnotu: 17.0, Vzorek v bode: -1.0 ma hodnotu: 0.0, Vzorek v bode: 0.0 ma hodnotu: -3.0, Vzorek v bode: 1.0 ma hodnotu: 8.0, Vzorek v bode: 2.0 ma hodnotu: 33.0, Vzorek v bode: 3.0 ma hodnotu: 72.0, Vzorek v bode: 4.0 ma hodnotu: 125.0, null, null, null, null, null, null, null, null, null, null]";
		assertEquals(awaited_resutst,Arrays.toString(results));
		
	}
}

