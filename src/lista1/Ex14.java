/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex14 {

	public static void main(String[] args) {
		/*
		 * Implementar um algoritmo que realize uma das 4 opera��es (+), (-), (/) e (*)
		 * entre duas vari�veis, atrav�s da escolha do usu�rio. Utilize switch/case.
		 */
		Scanner ob = new Scanner(System.in);
		int x;
		double a, b;

		System.out.println("Digite o valor do elemento A");
		a = ob.nextDouble();
		System.out.println("Digite o valor do elemento B");
		b = ob.nextDouble();
		System.out.println("Digite a opção desejada");
		System.out.println("1 - Multiplicação");
		System.out.println("2 - Divisão");
		System.out.println("3 - Soma");
		System.out.println("4 - Subtração");
		x = ob.nextInt();
		switch (x) {
		case 1:
			System.out.println("A multiplicação é de:" + (a * b));
			break;
		case 2:
			System.out.println("A divisão é de:" + (a / b));
			break;
		case 3:
			System.out.println("A soma é de:" + (a + b));
			break;
		case 4:
			System.out.println("A subtração é de:" + (a - b));
			break;
		default:
			System.out.println("Opção Inválida");
		}
	}

}
