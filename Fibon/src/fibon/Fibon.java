package fibon;
public class Fibon {

	/** Vola jednotlive zpusoby vypoctu
	 * @param args
	 * @author Stranska, Skalicka, Kaplanova, Khul, Bulicek
	 */
	public static void main(String[] args) {
		int maxNumber = 10; 
		int previousNumber = 0;
		int nextNumber = 1;

		System.out.print("Fibonacciho posloupnost "+maxNumber+" cisell\n ");
		System.out.print("Vypocet smyckou\n");

		for (int i = 1; i <= maxNumber; ++i)
		{
			System.out.print(previousNumber+" ");

			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
		System.out.println();
		System.out.print("Vypocet pomoci rekurze\n");

		FibonacciCalc fibRek = new FibonacciCalc();

		for(int i = 0; i < maxNumber; i++){
			System.out.print(fibRek.fibonacciRecursion(i) +" ");
		}


		System.out.println();
		System.out.println("Vypocet pomoci­ dynamickeho programova¡ni­");

		FibonTable finbTable = new FibonTable(maxNumber);


	}

} 





