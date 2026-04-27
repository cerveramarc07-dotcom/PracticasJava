package Principio;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		String nombre = d.nextLine();
		System.out.println("Dime tu edad");
		int edad = d.nextInt();
		d.nextLine();
		System.out.println("Dime tu genero");
		String genero = d.nextLine();
		
		boolean mayoredad = true;
		
		if (edad >= 18) {
			mayoredad = true;
			System.out.println("edad: " + edad + " nombre: " + nombre + " genero: " + genero + " mayoredad: " + mayoredad);
		} else {
			mayoredad = false;
			System.out.println("Es menor");
			
		} 
	
			
		
//		System.out.println("edad: " + edad + "nombre: " + nombre + "genero: " + genero + "mayoredad" + mayoredad);
		
		
		
//		>= <= + -  * / 
		
/*		int edad = 19;
		String nombre = "Marc";
		String genero = "Hombre";
		
        System.out.println(nombre);
        System.out.println(edad); 
        System.out.println(genero); */
    }
}
