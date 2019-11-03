

import java.util.Scanner;



public class KvadrRo {

	public static void main(String[] args) {
		
float a, b, c, d, x1, x2;

Scanner scanner;
scanner = new Scanner(System.in);

System.out.println("Kvadratická rovnice ax^2 + bx + c = 0");
System.out.print("Zadej a: ");
a = scanner.nextFloat();
System.out.print("Zadej b: ");
b = scanner.nextFloat();
System.out.print("Zadej c: ");
c = scanner.nextFloat();

d = b * b - 4 * a * c;
if (d > 0) {
    x1 = (-b + (float) Math.sqrt(d)) / (2 * a);
    x2 = (-b - (float) Math.sqrt(d)) / (2 * a);
    System.out.println("Rovnice má dvì øešení.");
    System.out.print("x1 = " + x1 + "\nx2 = " + x2);
} else if (d == 0) {
    x1 = -b / (2 * a);
    System.out.println("Rovnice má jedno øešení.");
    System.out.print("x = " + x1);
} else {
    System.out.print("Rovnice nemá øešení");
}
}

}
