package Principio;

import java.util.Scanner;

public class Bidi {
	public static void main(String[] args) {
		/*El Generador de Identidad (Matriz Identidad)
		Enunciado: Crea una matriz de $3 \times 3$. Debes llenarla con ceros (0), pero la diagonal principal (donde el índice de fila es igual al de columna) debe estar llena de unos (1). 
		Imprímela para que se vea cuadrada.Lógica clave: if (i == j) { matriz[i][j] = 1; }
		
	     int[][] matriz = new int[3][3];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (i == j) matriz[i][j] = 1;
	                else matriz[i][j] = 0;
	                System.out.print(matriz[i][j] + " "); // Imprime la columna
	            }
	            System.out.println(); // Salto de línea al terminar la fila
	        }
	        
	        Enunciado: Crea una matriz de  5 por 10 (5 filas, 10 columnas). 
	        *Cada celda debe contener el resultado de multiplicar su índice de fila por su índice de columna.
			Al imprimirla, asegúrate de que las columnas queden alineadas.
			Lógica clave:Usa \t (tabulador) en el print para que, aunque un número tenga un dígito y otro dos, la tabla se mantenga "recta".
	        
			int[][] tabla = new int[5][10];
			for(int row=1; row<5; row++ ) {
				for(int col=1; col<10; col++) {
					tabla[row][col]= row*col;
					String operacion = row + "*" + col + "=" + tabla[row][col];
	                System.out.printf("%-12s", operacion);
				}
				System.out.println();
			}
			 Enunciado: Crea una matriz de 4 por 4 llena de puntos ".". 
			 * Pide al usuario una fila y una columna (ejemplo: 2 y 2) y coloca una "X" en esa posición. 
			 * Luego, imprime el mapa completo.
			 */
			
			 Scanner sc = new Scanner(System.in);
  
			 String[][] mapa = new String[4][4];

			  for (int i = 0; i < 4; i++) {
			     for (int j = 0; j < 4; j++) {
			          mapa[i][j] = ".";
			       }
			 }

			        System.out.print("Introduce fila (0-3): ");
			        int fila = sc.nextInt();

			        System.out.print("Introduce columna (0-3): ");
			        int columna = sc.nextInt();

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

			        sc.close();
	}
}



