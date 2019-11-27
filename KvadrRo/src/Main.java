import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Kvadratická rovnice ax^2 + bx + c = 0");
		System.out.print("Zadej a: ");
		float a= scanner.nextFloat();
		System.out.print("Zadej b: ");
		float b= scanner.nextFloat();
		System.out.print("Zadej c: ");
		float c= scanner.nextFloat();

		KvadratickaFunkce kf = new KvadratickaFunkce(a,b,c); //volani konstruktoru
		kf.vypocetKorenu(); 

		if(kf.diskriminant() > 0) {
			System.out.println("Funkcční hodnota rovnice()");
			System.out.print("Zadej x: ");
			float x= scanner.nextFloat();
			double funHodnota=kf.vypocetFunkciHodnoty(x);
			System.out.println("Funkční hodnota v bodě x= "+x+" je: "+funHodnota);

		}
		
		System.out.println();
		System.out.println("Vzorkovani");
		System.out.print("Zadej Minimum: ");
		float min= scanner.nextFloat();
		System.out.print("Zadej Maximum: ");
		float max= scanner.nextFloat();
		System.out.print("Zadej 'Krok': ");
		float step= scanner.nextFloat();

		Tool_Funkce toolFce = new Tool_Funkce(min,max,step,kf); //volani kontruktoru
		
		//-------------------------------------------------------------------------------------
		System.out.println("-------------------------");
		System.out.println("Vzorkovani_I");
		/* Vzorkovani_I */
		// Nevyhody
		// -  nevime kolik bude vysledku, takze nevime jak velke pole priparavit. 
		double vysledky[] = toolFce.vzorkovani_I();	
		System.out.println("Vysledky:\n"+ Arrays.toString(vysledky));
		
		
		System.out.println("Vzorkovani_II");
		/* Vzorkovani_II */
		// Nevyhody
		// - nevime kolik bude vysledku, takze nevime jak velke pole priparavit. 
		// - je obtizne vracet dve pole, proto vypisujeme vysledky jiz ve volani funkce
		 toolFce.vzorkovani_II();	

		System.out.println("Vzorkovani_III");
		/* Vzorkovani_III */
		// Nevyhody
		// - nevime kolik bude vysledku, takze nevime jak velke pole priparavit. 
		Vzorek vysledky_III[]=toolFce.vzorkovani_III();	

		System.out.println("Vysledky:\n"+ Arrays.toString(vysledky_III));

		scanner.close();



	}
}
