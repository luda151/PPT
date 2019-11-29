import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		/*
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Kvadratická rovnice ax^2 + bx + c = 0");
		System.out.print("Zadej a: ");
		double a= scanner.nextdouble();
		System.out.print("Zadej b: ");
		double b= scanner.nextdouble();
		System.out.print("Zadej c: ");
		double c= scanner.nextdouble();
		*/
		
		double a=7;
		double b=4;
		double c=-3;
		Tool_IO io = new Tool_IO();
		KvadratickaFunkce kf = new KvadratickaFunkce(a,b,c); //volani konstruktoru
		kf.vypocetKorenu(); 

		if(kf.diskriminant() > 0) {
			
//			System.out.println("Funkcční hodnota rovnice");
//			System.out.print("Zadej x: ");
			//double x= scanner.nextdouble();
			double x = 0;
			double funHodnota=kf.vypocetFunkciHodnoty(x);
			
//			System.out.println("Funkční hodnota v bodě x= "+x+" je: "+funHodnota);
			io.writeToFile("Funkční hodnota v bodě x= "+x+" je: "+funHodnota);
			io.writeNewLine();

		}
		
		System.out.println();
//		System.out.println("Vzorkovani");
		io.writeToFile("Vzorkovani");
		io.writeNewLine();
		
		/*
		System.out.print("Zadej Minimum: ");
		double min= scanner.nextdouble();
		System.out.print("Zadej Maximum: ");
		double max= scanner.nextdouble();
		System.out.print("Zadej 'Krok': ");
		double step= scanner.nextdouble();
		*/
		double min= -6;
		double max= 6;
		double step = 0.5;

		Tool_Funkce toolFce = new Tool_Funkce(min,max,step,kf); //volani kontruktoru
		
		//-------------------------------------------------------------------------------------
		io.writeToFile("-------------------------\n");
		io.writeToFile("Vzorkovani_I\n");
//		System.out.println("-------------------------");
//		System.out.println("Vzorkovani_I");
		/* Vzorkovani_I */
		// Nevyhody
		// -  nevime kolik bude vysledku, takze nevime jak velke pole priparavit. 
		double vysledky[] = toolFce.vzorkovani_I();	
//		System.out.println("Vysledky:\n"+ Arrays.toString(vysledky));
		io.writeToFile("Vysledky:\n"+ Arrays.toString(vysledky));
		io.writeNewLine();
		io.writeNewLine();
		
//		System.out.println("Vzorkovani_II");
		io.writeToFile("Vzorkovani_II\n");
		/* Vzorkovani_II */
		// Nevyhody
		// - nevime kolik bude vysledku, takze nevime jak velke pole priparavit. 
		// - je obtizne vracet dve pole, proto vypisujeme vysledky jiz ve volani funkce
		 toolFce.vzorkovani_II(io);	

//		System.out.println("Vzorkovani_III");
		io.writeToFile("Vzorkovani_III\n");
		/* Vzorkovani_III */
		// Nevyhody
		// - nevime kolik bude vysledku, takze nevime jak velke pole priparavit. 
		Vzorek vysledky_III[]=toolFce.vzorkovani_III();	

//		System.out.println("Vysledky:\n"+ Arrays.toString(vysledky_III));
		io.writeToFile("Vysledky:\n"+ Arrays.toString(vysledky_III));
		io.writeNewLine();
//		scanner.close();

		io.read();
	}
}
