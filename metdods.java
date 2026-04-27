package Principio;
import java.util.Scanner;
public class metdods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		int num1 = sc.nextInt();
		System.out.println("Dime otro numero");
		int num2 = sc.nextInt();
		
		/*mundo();
		String mun = world();
		System.out.println(mun);
		int sum = suma(num1,num2);
		System.out.println("El resultado de la llamada al metodo sum es " + sum);
		divi(num1,num2);
		multi(num1,num2);
		int rest = resta(num1,num2);
		System.out.println("La llamada al metodo resta da como resultado " + rest);
		*/
		
		parimpar(num1, num2);
	}
	
	public static void mundo() {
		System.out.println("Hola mundo");
	}

	public static String world() {
		String mun = "Hola mundo";
		return mun;
	}
	
	public static int suma(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public static int resta(int a, int b) {
		int rest = a-b;
		return rest;
	}
	
	public static void multi(int a, int b) {
		int mult = a*b;
		System.out.println("La multiplicacion es " + mult);
	}
	
	public static void divi(double a, double b) {
		double div = a/b;
		if (b == 0 ) {
			System.out.println("No se puede dividir entre 0");
		} else {
			System.out.println("La division es " + div);
		}
		
	}
	
	//Dados dos numeros dados por teclado quiero saber cual de estos numeros es par o impar
	
	public static void parimpar(int a, int b) {
		
		if ( !(a % 2 == 0) && ! (b % 2 == 0) ) {
			System.out.println("Son impares");
		} else {
			if(a % 2 == 0 && b % 2 == 0 ) {
				System.out.println("Son pares");
			} else if(a % 2 == 0 && ! (b % 2 == 0)) {
				System.out.println(a + " es par y " + b + " es impar");
			} else  {
				System.out.println(a + " es impar y " + b + " es par");
			}
		}
	}
	
}
