package fibon;
 

public class Fibon {

	public static void main(String[] args) {
		int maxNumber = 10; 
		int previousNumber = 0;
		int nextNumber = 1;

		System.out.print("Fibonacciho posloupnost "+maxNumber+" čísel\n ");
		System.out.print("Výpočet smyčkou\n");

		for (int i = 1; i <= maxNumber; ++i)
		{
			System.out.print(previousNumber+" ");

			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
		System.out.println();
		System.out.print("Výpočet rekurzí\n");

		FibonacciCalc fibRek = new FibonacciCalc();
		
		for(int i = 0; i < maxNumber; i++){
			System.out.print(fibRek.fibonacciRecursion(i) +" ");
		}


		System.out.println();
		System.out.printlns("Výpočet pomocí dynamického programování");
		
		FibonTable finbTable = new FibonTable(10);
		
		
		//System.out.println(finbTable.fibDP(8));

		
		//finbTable.FibonTable(maxNumber);

	}


} 



