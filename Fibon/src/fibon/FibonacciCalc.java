package fibon;

/** Rekurze
 * @author Stranska, Skalicka, Kaplanova, Khul, Bulicek
 * 
 */
public class FibonacciCalc {
	
	/**
	 * @param n
	 * @return result;
	 */
	public static int fibonacciRecursion(int n){

		int result = 0;
		if(n == 0){
			result=  0;
		}
		if(n == 1 || n == 2){

			result = 1;
			result =(fibonacciRecursion(n-2) + fibonacciRecursion(n-1));
		}
		return result;
		
	}
}