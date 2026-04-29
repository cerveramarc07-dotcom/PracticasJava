package Principio;

public class ClaseNueva {

	public static void main(String[] args) {
		        System.out.println("Iniciando conteo de inventario...");
		        int i ;
		        for (i = 1; i <= 5; i++) {
		            System.out.println("Revisando artículo número: " + i);
		        }
		        
		        System.out.println("Proceso terminado. Total de artículos: " + i);   
		        
		        puntos();
		        
	}
	
	public static void puntos() {

        int puntosGanados = 0;
        int totalCompra = 150;
        String mensajeBienvenida = "" ;
        int puntosPorRonda = 0 ;
        double regalo = 0.0 ;
        
        if (totalCompra > 100) {
           mensajeBienvenida = "Tienes un bono";
            int bono = 10;
        }

        System.out.println(mensajeBienvenida); //Error, se inicializa variable dentro del if

       
        for (int i = 0; i < 5; i++) {
        	puntosPorRonda = 5;
            puntosGanados += puntosPorRonda;
        }

        System.out.println("Puntos por ronda: " + puntosPorRonda);  //Error, se inicializa variable dentro del for



        if (puntosGanados > 20) {
            regalo = 5.0;
        }

       double sumaFinal = totalCompra + regalo; //Error, se inicializa variable dentro del if

        System.out.println("Total: " + sumaFinal);
    }
}

