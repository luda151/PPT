package fibon;
<<<<<<< HEAD

public class FibonacciCalc {

	public FibonacciCalc() {}

	public int fibonacciRecursion(int n){

=======
// užití rekurze
public class FibonacciCalc {
	public static int fibonacciRecursion(int n){
>>>>>>> 8e522422fd4c5d9e14833050458b4259443808e8
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
<<<<<<< HEAD
			return 1;
		}
		return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
=======
				return 1;
			}
		return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
		}
	    public static void main(String args[]) {
		int maxNumber = 10;
		System.out.print("Fibonacciho posloupnost "+maxNumber+" èísel: ");
		for(int i = 0; i < maxNumber; i++){
				System.out.print(fibonacciRecursion(i) +" ");
			}
		}
>>>>>>> 8e522422fd4c5d9e14833050458b4259443808e8
}
