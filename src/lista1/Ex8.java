package lista1;

/**
 *
 * @author Tiago Coelho
 */
public class Ex8 {

	public static void main(String[] args) {
		/*
		 * Crie um código que mostre a soma dos números entre 0 e 100.
		 */
		int x = 0, cont;

		for (cont = 0; cont <= 100; cont = cont + 1) {
			x = x + cont;
		}
		System.out.println("A soma Ã© de: " + x);
	}
}
