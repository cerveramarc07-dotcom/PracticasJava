package Principio;

public class Arr1 {
	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String car:cars) {
			System.out.println(car);
		}
		//Dado un array de enteros con los numeros 1,25,10,9,30 calcula la suma estos elementos.
		
		int suma =0;
		int[] arraynum = {1,25,10,9,30};
		for(int numeros:arraynum) {
			suma+=numeros;
			
		}
		System.out.println("La suma de los elementos es: " + suma);	
		
		// Dado una matriz que almacena los datos de diferentes edades calcula la media.
		int sum=0;
		int[] arrayedad = {20,22,18,25,48,26,87,70};
		for(int edades:arrayedad) {
			sum+=edades;
		}
		System.out.println("La media es de: " + (double)(sum / arrayedad.length));
		
		
		//Dado un programa no sabiendo la cantidad de elementos que habra en el array calcula el maximo y el minimo de este array
		
		
		int[] arrayele = new int[5];
		arrayele[0]=3;
		arrayele[1]=5;
		arrayele[2]=20;
		arrayele[3]=8;
		arrayele[4]=12;
		
		int max = arrayele[0];
		int min = arrayele[0];
		
		int posimax = 0;
		int posimin = 0;
		
		for(int i=0; i < arrayele.length; i++) {
			if(arrayele[i] > max) {
				max=arrayele[i];
				posimax=i;
			}
			if(arrayele[i] < min) {
				min=arrayele[i];
				posimin=i;
				
			}
		}
		System.out.println("El numero maximo es: " + max + " y esta en el indice " + posimax);
		System.out.println("El numero minimo es: " + min + " y esta en el indice " + posimin);
		
		
		//Creo un programa con una lista de numeros en el que quieras omitir los numeros negativos, pero detent por completo si encuentra un 0
		
		
		int[] array = {-1,3,9,-9,-2,0,4,-3,6,1};
		for (int i=0; i<array.length; i++) {
			if ( array[i] < 0 ) {
				continue;
			} if(array[i] > 0) {
				System.out.println(array[i]);
			} else {
				break;
			}
		}
		
		//Crea un programa que muestre los numeros de butaca de un teatro que indique tanto el numero de butaca como el de quien ocupa el asiento. 
		
		String[] arraybutaca = new String[5];
		arraybutaca[0]="Marc";
		arraybutaca[1]="Pau";
		arraybutaca[2]="Manu";
		arraybutaca[3]="Andres";
		arraybutaca[4]="Branko";
		
		for (int i=0; i< arraybutaca.length; i++) {
			System.out.println("El numero de butaca es: " + i + " y corresponde a: " + arraybutaca[i]);
		}
		
	}
}
