package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex20 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo para calcular a soma dos d�gitos de um n�mero.
		 */

		Scanner x = new Scanner(System.in);
		int a, aux = 0;

		System.out.println("Digite um numero");
		a = x.nextInt();
		do {
			aux = aux + (a % 10);
			a = a / 10;
		} while (a > 0);
		System.out.println("A soma é de " + aux);
	}

}
