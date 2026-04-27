package Principio;
import java.util.Scanner;
public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Eacribe un texto");
		String txt = sc.nextLine();
		System.out.println("Sigue el texto anterior");
		String txtcont = sc.nextLine();
		
		System.out.println("El tamaño del texto es de: " + txt.length());
		System.out.println(txt.concat(txtcont));
		System.out.println(txtcont.toLowerCase());
		System.out.println(txt.equalsIgnoreCase(txtcont));
		System.out.println(txt.trim()+ "\n" + "la primera posicin de" + " \"" + "e" + "\" " + "es" + txt.indexOf("e"));
		System.out.println(txt.charAt(2));
	}

}
