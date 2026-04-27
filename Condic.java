package Principio;
import java.util.Scanner;
public class Condic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inrtroduce el nonmbre de un mes");
		String mes = (sc.nextLine());
		
		switch (mes.toLowerCase()) {
		case "enero":
			System.out.println("Es el primer mes");
			break;
		case "febrero":
			System.out.println("Es el segundo mes");
			break;
		case "marzo":
			System.out.println("Es el tercer mes");
			break;
		case "abril":
			System.out.println("Es el cuarto mes");
			break;
		case "mayo":
			System.out.println("Es el quinto mes");
			break;
		case "junio":
			System.out.println("Es el sexto mes");
			break;
		case "julio":
			System.out.println("Es el septimo mes");
			break;
		case "agosto":
			System.out.println("Es el octavo mes");
			break;
		case "septiembre":
			System.out.println("Es el noveno mes");
			break;
		case "octubre":
			System.out.println("Es el decimo mes");
			break;
		case "noviembre":
			System.out.println("Es el onceavo mes");
			break;
		case "diciembre":
			System.out.println("Es el doceavo mes");
			break;
		default: System.out.println("No existe el meses");
		}

		
		
/*	    int choice = 0;

	    // 1 = Coffee
	    // 2 = Tea

	    switch (choice) {
	      case 1:
	        System.out.println("You ordered Coffee");
	        break;
	      case 2:
	        System.out.println("You ordered Tea");
	        break;
	      default: System.out.println("Invalid choice");
	   }
*/
	}
}