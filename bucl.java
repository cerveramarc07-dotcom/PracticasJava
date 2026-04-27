package Principio;


public class bucl {
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for (int num:numbers) {
			sum+=num;
			System.out.println(sum);
		}
		
/*		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		boolean check = true;
		for (String car : cars) {
			if(car == "Volvo") {
				check = true;
			}else {
				check = false;
			}
			System.out.println(car);
			System.out.println(check);
		}
		
	   for(int i = 1; i <= 3; i++ ) {
			System.out.println("Tabla del " + i);
			for (int j = 1; j<=10; j++ ) {
				System.out.println(i +"+"+j+"=" + (i+j));
			}
			System.out.println("-------------------------");
		}
		
		// Outer loop
		for (int i = 1; i <= 2; i++) {
		  System.out.println("Outer: " + i); // Executes 2 times
		    // Inner loop
		  for (int j = 1; j <= 3; j++) {
		    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
		  }
		}

	for(int i = 0; i<=10; i++ ) {
			System.out.println(i);
		}
		
		System.out.println("-----");
		
		int suma = 0;
		int cont = 0;
		for(int i = 0; i<=10; i+=2 ) {
			suma += i;
			cont++;
			System.out.println(i);
			
		}
		System.out.println("La suma total es: " + suma);
		System.out.println("El promedio es: " + (float)(suma / cont));
		
		int cont = 1;
		while(cont <= 10) {
			System.out.println(cont);
			cont++;
		}
		int con = 10;
		while(con >= 1) {
			System.out.println(con);
			con--;
		}

		int con = 10;
		do {
			System.out.println(con);
			con--;
		}while(con >= 5);
			
		int cont = 1;
		do {
			System.out.println(cont);
			cont++;
		}while(cont <= 10);
		*/
	
	}
}
