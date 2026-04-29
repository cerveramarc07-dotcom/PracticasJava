package Principio;
import java.util.Scanner;
public class ColocarX {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Introduce fila (0-3): ");
			int num1 = sc.nextInt();
			System.out.print("Introduce columna (0-3): ");
			int num2 = sc.nextInt();
			
			/*xPorPunto(num1 , num2);
			
			String[] arr = arraypru("Hola");
			for(int i=0; i<=arr.length-1; i++) {
				System.out.println(arr[i]);
			}
			*/
			multindice();
			
					
	}
	/*Enunciado: Crea una matriz de  5 por 10 (5 filas, 10 columnas). 
	  Cada celda debe contener el resultado de multiplicar su índice de fila por su índice de columna.
	  Al imprimirla, asegúrate de que las columnas queden alineadas.
	  Lógica clave:Usa \t (tabulador) en el print para que, aunque un número tenga un dígito y otro dos, la tabla se mantenga "recta".*/
	public static void multindice() {
	int[][] tabla = new int[5][10];

	for(int row=1; row<5; row++ ) {
		for(int col=1; col<10; col++) {
			tabla[row][col]= row*col;
			String operacion = row + "*" + col + "=" + tabla[row][col];
            System.out.printf("%-12s", operacion);
		}
		System.out.println();
	}
	}
	
	
	public static String[] arraypru(String a) {
		String[] array = new String[1];
		array[0]= a;
		return array;
	}
	
	public static void xPorPunto(int a, int b) {
	 String[][] mapa = new String[4][4];

	  for (int i = 0; i < 4; i++) {
	     for (int j = 0; j < 4; j++) {
	          mapa[i][j] = ".";
	       }
	 }
	        int fila = a;

	        int columna = b;

	        if (fila >= 0 && fila < 4 && columna >= 0 && columna < 4) {
	            mapa[fila][columna] = "X";
	        } else {
	            System.out.println("Posicion fuera de rango");
	        }

	        System.out.println("Mapa:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(mapa[i][j] + " ");
	            }
	            
	            System.out.println();
	        }   
	}
	
	public static void recorrerArray(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	        System.out.println("Posición " + i + ": " + array[i]);
	    }
	}
	
	public static void recorrerArray2D(int[][] matriz) {
	    for (int fila = 0; fila < matriz.length; fila++) {
	        for (int columna = 0; columna < matriz[fila].length; columna++) {
	            System.out.print(matriz[fila][columna] + " ");
	        }
	        System.out.println(); 
	    }
	}

}