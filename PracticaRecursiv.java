package Principio;
import java.util.Scanner;
public class PracticaRecursiv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		int num1 = sc.nextInt();
		//System.out.println("Dime otro numero");
		//int num2 = sc.nextInt();
		
		
		int proc3 = factorial(num1);
		System.out.println("La suma de los numero es " + proc3);
		
		//int proc = suma(num1);
		//System.out.println("La suma de los numero es " + proc);
		
		
	/*	while(num1 > num2){
			System.out.println("Dime un numero mayor que el primero");
			num2 = sc.nextInt();
		}
		int proc2 = suma2(num1, num2);
		System.out.println("La suma de los numero es " + proc2);
		*/
	}
	
	public static int suma(int a) {
		//Sumar todos los numeros desde a a 0.
		if(a > 0) {
			return a+suma(a-1);
		} else {
			return 0;
		}
	}
	
	public static int suma2(int a, int b) {
		if(a > b ) {
			return b+suma2(a,b-1);
		}else {
			return b;
		}
	}
	static int factorial(int a) {
		//Sumar todos los numeros desde a a 0.
		if(a > 1) {
			return a*factorial(a-1);
		} else {
			return 1;
		}
	}
}
