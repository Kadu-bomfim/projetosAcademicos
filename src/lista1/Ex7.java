package lista1;

/**
 *
 * @author Tiago Coelho
 */
public class Ex7 {

	public static void main(String[] args) {
		/*
		 * Implemente um algoritmo mostre os números pares entre 10 e 200.
		 */
		int cont;

		for (cont = 10; cont <= 200; cont = cont + 1) {
			if (cont % 2 == 0) {
				System.out.println("Numero: " + cont);
			}
		}
	}
}
