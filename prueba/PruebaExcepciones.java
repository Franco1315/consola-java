package p;

import java.util.Scanner;

public class PruebaExcepciones {

	public PruebaExcepciones() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un número");
		
		try {
			int numeroEntero = teclado.nextInt();
		
		System.out.println("Numero x 2 =" + numeroEntero * 2);
		}catch (Exception e) {
			System.out.println("No se pudo leer ningún número");
		}

	}

}
