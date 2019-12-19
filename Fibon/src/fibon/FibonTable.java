package fibon;

import java.util.Arrays;

public class FibonTable {

	private int Fibon_max;
	private int[] calcTable;

	public int calcTable(int n){
		if (n < 1) {
			return 0; 
		}
		if (this.calcTable[n-1] != 0) {
			System.out.println("hodnotu na indexu "+(n-1)+" jiz znam je to: " +calcTable[n-1]);
			return this.calcTable[n-1]; 
		}else {
			System.out.println("hodnotu na indexu "+(n-1)+" neznam, jdu pocitat");
			return (this.calcTable(n-1) + this.calcTable(n-2));
		}
	}

	public FibonTable(int max){
		//if (max < 2) return;  
		this.Fibon_max = max;
		this.calcTable = new int[this.Fibon_max] ; 

		this.calcTable[0] = 0;
		this.calcTable[1] = 1;

		System.out.println(this.calcTable(2));


		for(int i = 0; i < max; i++){
			this.calcTable[i] = this.calcTable(i+1);
		}
		System.out.println( Arrays.toString(this.calcTable));
		System.out.println();

	}

	public String toString(){
		String s = "";
		s += "max:" + this.Fibon_max;
		s += " table[]:" + Arrays.toString(this.calcTable);
		return s;
	}
}




//v�po�et prvku Fibonancciho posloupnosti s vyu�it�m dynamick�ho programov�n� (s vyu�it�m tabulky)

