package Principio;
import java.util.Scanner;
public class Clase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Dado un array con los nombres de varios productos en una tienda de tecnologia, el objetivo es recoger la lista y 
		 mostrar por consola el mensaje "producto disponible: nombre del producto" eso para cada uno de ellos*/
		
		System.out.println("Dime el tamaño del array");
		int x = sc.nextInt();
		String[] productos = new String[x];
		
		for(int i = 0; i <= productos.length -1; i++) {
			System.out.println("Dime el: " + (i+1) + "  producto ");
			String prod = sc.next();
			
			productos[i] = prod;
		}
		
		for(String prod : productos) {
			System.out.println(prod);
		}
		
		for(int i=0; i < productos.length -1; i++ ) {
			System.out.println(productos[i]);
		}
		
			
			
	

	}
	
}

