package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex17 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que leia 5 valores inteiros e que no final do programa
		 * imprima na tela a média dos números positivos.
		 */
		int a;
		double b = 0;
		int v[] = new int[5];
		Scanner x = new Scanner(System.in);

		for (a = 0; a < 5; a = a + 1) {
			System.out.println("Digite o campo do vetor");
			v[a] = x.nextInt();
			b = b + v[a];
		}
		System.out.println("A mÃ©dia Ã© de: " + (b / a));
	}
}
