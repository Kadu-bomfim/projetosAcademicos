package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex18 {

	public static void main(String[] args) {
		/*
		 * Fa�a um algoritmo que calcule qual � o menor e o maior de 3 n�meros inteiros
		 * inseridos pelo usu�rio.
		 */
		int a, maior, menor;
		int v[] = new int[3];
		Scanner x = new Scanner(System.in);

		for (a = 0; a < 3; a = a + 1) {
			System.out.println("Digite um número");
			v[a] = x.nextInt();
		}
		maior = v[0];
		menor = v[0];
		for (a = 0; a < 3; a = a + 1) {
			if (v[a] > maior) {
				maior = v[a];
			} else if (v[a] < menor) {
				menor = v[a];
			}
		}
		System.out.println("Menor valor " + menor);
		System.out.println("Maior valor " + maior);
	}
}
