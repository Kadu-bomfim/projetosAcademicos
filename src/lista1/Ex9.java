package lista1;

/**
 *
 * @author Tiago Coelho
 */
public class Ex9 {

	public static void main(String[] args) {
		/*
		 * Fa�a um c�digo que mostre a soma dos n�meros m�ltiplos de 7 entre 100 e 200.
		 */
		int x = 7, cont, soma = 0;

		for (cont = 100; cont <= 200; cont = cont + 1) {
			if (cont % x == 0) {
				soma = soma + cont;
			}
		}
		System.out.println("A soma é de: " + soma);
	}
}
