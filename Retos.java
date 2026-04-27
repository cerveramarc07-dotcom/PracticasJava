package Principio;
import java.util.Scanner;
public class Retos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Reto 1: El Validador de Edades (Nivel Básico)
		Enunciado: Escribe un programa que pida al usuario su edad.
		Si la edad es menor de 18, debe imprimir: "Eres menor de edad".
		Si tiene entre 18 y 64 años, debe imprimir: "Eres adulto".
		Si tiene 65 años o más, debe imprimir: "Eres un adulto mayor".
		
		System.out.println("Dime tu edad: ");
		int edad = sc.nextInt();
		
		while(edad<= 0) {
			System.out.println("La edad no puede ser menor o igual a 0, introduce un numero mayor a cero ");
			 edad = sc.nextInt();
		}
		if (edad< 18) {
			System.out.println("Eres menor de edad");
		} else if ((edad > 18) && (edad<=64) ) {
			System.out.println("Eres adulto");
		} else {
			System.out.println("Eres un adulto mayor");
		}
		*/
		/*Clasificador de Triángulos (Nivel Intermedio)
		Enunciado: Crea un programa que reciba tres números enteros que representan los lados de un triángulo. 
		El programa debe determinar qué tipo de triángulo es:
		Equilátero: Los tres lados son iguales.
		Isósceles: Dos lados son iguales.
		Escaleno: Todos los lados son diferentes.
		
		System.out.println("Dime el lado1 numero: ");
		int lado1 = sc.nextInt();
		System.out.println("Dime el lado2 numero: ");
		int lado2 = sc.nextInt();
		System.out.println("Dime el lado3 numero: ");
		int lado3 = sc.nextInt();
		
		if ((lado1==lado2) && (lado2==lado3)) {
			System.out.println("Es un triangulo equilátero");
		}else if((lado1==lado2) || (lado2==lado3) || (lado1==lado3)) {
			System.out.println("Es un triangulo isósceles");
		} else {
			System.out.println("Es un triangulo escaleno");
		}	*/
		
		/*Calculadora de Descuentos (Nivel Lógica) 
		Enunciado: Una tienda ofrece descuentos según el monto de la compra: 
		Compras menores a $100: Sin descuento.
		Compras entre $100 y $500: 10% de descuento.
		Compras mayores a $500: 20% de descuento. El programa debe mostrar el precio final a pagar.
		
		System.out.println("Precio de la compra: ");
		int cmp = sc.nextInt();
		
		while(cmp <=0 ) {
			System.out.println("El precio de la compra es incorrecto, introducelo de nuevo ");
			 cmp = sc.nextInt();
		}
			
		if (cmp < 100) {
			System.out.println("Sin descuento");
		}else if((cmp >= 100) && (cmp <= 500)) {
			System.out.println("Descuento de 10%: " + (cmp - (cmp * 0.10) ) );
		} else {
			System.out.println("Descuento de 20%: " + (cmp - (cmp * 0.20) ));
		}
		*/
		
		/*El Filtro de Pares e Impares
		Enunciado: Crea un programa que recorra los números del 1 al 20 usando un ciclo. 
		Para cada número, debe imprimir si es par o impar.
		Pista: Usa el operador módulo %. Si numero % 2 == 0, es par.
		
		for (int i= 1; i<=20; i++ ) {
			if(i % 2==0) {
				System.out.println("El numero " + i + " es par");
			} else {
				System.out.println("El numero " + i + " es impar");
			}
		}
		
		/*El Contador de Divisibles
		Enunciado: Pide al usuario un número límite (por ejemplo, 50). 
		El programa debe contar cuántos números entre 1 y ese límite son divisibles por 3 Y por 5 al mismo tiempo.
		Foco: Uso del operador && dentro de un bucle.
		
		System.out.println("Dime el numero maximo: ");
		int maxim = sc.nextInt();
		int contador = 0;
		while (maxim < 1 ) {
			System.out.println("No puedes poner un valor menor a 1");
		}
		
		for(int i=1; i<=maxim; i++) {
			if(i % 3==0 && i % 5==0 ) {
				contador++;
			}
		}
		System.out.println("Hay un total de " + contador + " numeros divisibles entre 3 y 5");
		*/
		
		/*Validación de PIN con Intentos
		Enunciado: Simula un cajero automático. El PIN correcto es 1234. El usuario tiene 3 intentos para adivinarlo.
		Si acierta, imprime: "Acceso concedido".
		Si falla los 3 intentos, imprime: "Tarjeta bloqueada"
		Foco: Ciclo while o for con una interrupción break si acierta.
	
		int pass = 1234;
		int intentos = 3;
		for (int i=1; i<=3; i++) {
			System.out.println("Introduce el PIN ");
			int pin = sc.nextInt();
			if(pin == pass) {
				System.out.println("Acceso concedido");
				break;
			}else {
				System.out.println("Contraseña equivocada vuelve a intentarlo, tienes " + (intentos -i) + " intentos");
			}
		}
		System.out.println("Tarjeta bloqueada");
		
		/*Validación de PIN con Intentos
		Enunciado: Simula un cajero automático. El PIN correcto es 1234. El usuario tiene 3 intentos para adivinarlo.

		Si acierta, imprime: "Acceso concedido".

		Si falla los 3 intentos, imprime: "Tarjeta bloqueada".

		Foco: Ciclo while o for con una interrupcion break si acierta.*/
		

		/*int suma = 0;
		int numero;

		while (true) {
		   System.out.print("Introduce un numero: ");
		   numero = sc.nextInt();

		   if (numero < 0) {
		                break; 
		   }

		   suma += numero;
		   }

		   System.out.println("La suma total es: " + suma);
		   sc.close();*/

		/*	El Buscador de Primos (Nivel Pro)
		Enunciado: Pide un número al usuario y determina si es un número primo.

		Un número es primo si solo es divisible por 1 y por sí mismo.

		Lógica: Debes usar un ciclo que pruebe a dividir el número desde 2 hasta la mitad del número. Si encuentras un divisor (módulo == 0), ya no es primo.

		Foco: Condicionales anidados dentro de un ciclo.
		    System.out.print("Introduce un numero: ");
		    int numero = sc.nextInt();

		    boolean esPrimo = true;

		    if (numero <= 1) {
		       esPrimo = false;
		    } else {
		    for (int i = 2; i <= numero; i++) {
		      if (numero % i == 0) {
		      esPrimo = false;
		      break; 
		      		}
		    	 }
		      }
		      if (esPrimo) {
		      System.out.println("Es un numero primo");
		      } else {
		         System.out.println("No es un numero primo");
		       }

		      sc.close();
		      */
		   
		   	/*Suma de Positivos y Salida con Negativo
			Enunciado: Escribe un programa que pida números al usuario constantemente.

			El programa debe sumar todos los números ingresados.

			Si el usuario ingresa un número negativo, el ciclo se detiene y muestra la suma total (sin incluir el negativo).

			Foco: Ciclo while(true) o do-while.
		   int suma = 0;
		   int num=0;
		   
		 while (true) {
		   	System.out.println("Introduce un numero si es negativo paras ");
			num = sc.nextInt();
			if (num < 0) {
				break;
			  }
			suma += num;
		   }
		 System.out.println("La suma sin el numero negativo es " + suma);
		 */
		}
	}

