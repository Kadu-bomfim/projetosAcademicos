package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * Fa�a um algoritmo que pe�a ao usu�rio para digitar dois valores e determine
		 * se s�o iguais ou diferentes.
		 */
		float a, b;
		Scanner x = new Scanner(System.in);

		System.out.println("Digite o primeiro numero");
		a = x.nextFloat();
		System.out.println("Digite o segundo numero");
		b = x.nextFloat();
		if (a == b) {
			System.out.println("Os numeros digitados são iguais!");
		} else {
			System.out.println("Os nuemros digitados são diferentes");
		}
	}
}
