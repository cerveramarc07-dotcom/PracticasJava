package Principio;
import java.util.Scanner;
public class Compra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Desarrolla un programa que procese un listado de precios de 
		 * productos y clcule eñ total de una compra aplicando reglas de negocio especificas
		 * crear un array donde el tamaño sea definido por el usuario ademas este array debe ser llenado por el usuario(for) 
		 * y recogelo con for each
		 * si el precio de un producto es mayor que 100 aplica un descuento del 10%
		 * si el precio es menor a 100 e mantiene igual 
		 */
		
		System.out.println("Dime la cantidad de productos");
		int cant = sc.nextInt();
		
		double[] precios = new double[cant];
		
		/*for(int i = 0; i <= precios.length -1; i++ ) {
			System.out.println("Dime el precio del producto " + (i+1) + ":" );
			double prec = sc.nextDouble();
			precios[i] = prec;
		}
		*/
		int i = 0;
		for(double precio : precios) {
			System.out.println("Dime el precio del producto " + (i+1) + ":" );
			precios[i] = precio;
		}
			
		double total = 0;
		for(double prec : precios) {
		double temporal = 0;
			if(prec > 100) {
				temporal = prec -(prec * 0.10);
			}else {
				temporal+=prec;
			}
			
			total+=temporal;
		}
		
		System.out.println("El total de la compra son " + total);
		
	}
	
}
