package fibon;
<<<<<<< HEAD
 
=======
>>>>>>> 8e522422fd4c5d9e14833050458b4259443808e8

public class Fibon {

	public static void main(String[] args) {
		int maxNumber = 10; 
<<<<<<< HEAD
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
		System.out.println("Výpočet pomocí dynamického programování");
		
		FibonTable finbTable = new FibonTable(10);
		
		
		//System.out.println(finbTable.fibDP(8));

		
		//finbTable.FibonTable(maxNumber);
=======
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
	        System.out.print("Fibonacciho posloupnost "+maxNumber+" ��sel: ");

	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	            

	      
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
>>>>>>> 8e522422fd4c5d9e14833050458b4259443808e8

	}


<<<<<<< HEAD
} 
=======
	} // Java code Loop
>>>>>>> 8e522422fd4c5d9e14833050458b4259443808e8



