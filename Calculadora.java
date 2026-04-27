package Principio;
import java.util.Scanner;
public class Calculadora {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el primer numero");
		int a = sc.nextInt();
		System.out.println("Dime el segundo numero");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("Elige operador (resta - , multi *, suma +, divi /");
		String c = sc.nextLine();
		
		System.out.println(c);
		
		if (c.equals("suma")) {
			System.out.println("El resultado es: " + (a + b));
		} else if (c.equals("resta")) {
			System.out.println("El resultado es: " + (a - b));
		} else if (c.equals("multi")) {
			System.out.println("El resultado es: " + (a * b));
		} else if (b != 0) {
			if (c.equals("divi")) {
				System.out.println("El resultado es: " + (a / b));
			}
		} else {
			System.out.println("No puedes dividir entre 0");
		}
	}
}


//>= <= + -  * / 