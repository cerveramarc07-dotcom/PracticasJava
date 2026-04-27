package Principio;

public class ej {
	public static void main(String[] args) {
		//Hacer un programa que dado un numero entero me calcule el factorial de este numero
		int j = 5;
		int fact = 1;
		for(int i=1; i <=j; i++) {
			fact *=i;
			System.out.println(fact);
		}
		//Hacer un programa que dado un numero entero, se detenga cuando i = 4 
		for(int i=1; i <=10; i++) {
			if(i>4) {
				break;
			} System.out.println(i);
		}
	}
}
