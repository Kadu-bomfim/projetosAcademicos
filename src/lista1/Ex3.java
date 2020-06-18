package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que peça ao usuário para digitar dois valores e determine
		 * se são iguais ou diferentes.
		 */
		float a, b;
		Scanner x = new Scanner(System.in);

		System.out.println("Digite o primeiro numero");
		a = x.nextFloat();
		System.out.println("Digite o segundo numero");
		b = x.nextFloat();
		if (a == b) {
			System.out.println("Os numeros digitados sÃ£o iguais!");
		} else {
			System.out.println("Os nuemros digitados sÃ£o diferentes");
		}
	}
}
