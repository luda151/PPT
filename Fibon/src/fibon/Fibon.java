package fibon;
public class Fibon {

	public static void main(String[] args) {
		int maxNumber = 10; 
		int previousNumber = 0;
		int nextNumber = 1;

		System.out.print("Fibonacciho posloupnost "+maxNumber+" ÄÃ­sel\n ");
		System.out.print("VÃ½poÄet smyÄkou\n");

		for (int i = 1; i <= maxNumber; ++i)
		{
			System.out.print(previousNumber+" ");

			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
		System.out.println();
		System.out.print("VÃ½poÄet rekurzÃ­\n");

		FibonacciCalc fibRek = new FibonacciCalc();
		
		for(int i = 0; i < maxNumber; i++){
			System.out.print(fibRek.fibonacciRecursion(i) +" ");
		}


		System.out.println();
		System.out.println("VÃ½poÄet pomocÃ­ dynamickÃ©ho programovÃ¡nÃ­");
		
		FibonTable finbTable = new FibonTable(10);
		
		
		//System.out.println(finbTable.fibDP(8));

		
		//finbTable.FibonTable(maxNumber);
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
	        System.out.print("Fibonacciho posloupnost "+maxNumber+" èísel: ");

	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	            

	      
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }

	}

} 

	} // Java code Loop




