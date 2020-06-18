package lista1;

/**
 *
 * @author Tiago Coelho
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		 * Implemente um código em Java que mostre a soma dos números que não são
		 * múltiplos de 13 entre 100 e 200.
		 */
		int x = 13, cont, soma = 0;

		for (cont = 100; cont <= 200; cont = cont + 1) {
			if (cont % x != 0) {
				soma = soma + cont;
			}
		}
		System.out.println("A soma Ã© de: " + soma);
	}
}
