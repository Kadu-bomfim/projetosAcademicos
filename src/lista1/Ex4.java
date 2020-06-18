package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex4 {

	public static void main(String[] args) {
		/*
		 * Desenvolva um algoritmo que peça ao usuário para digitar o preço de tabela do
		 * seu carro e o ano do mesmo para poder calcular o imposto a pagar do veículo.
		 * Caso o ano do carro seja anterior ao ano 2000 terá o imposto sendo calculado
		 * como 10% no valor de preço de tabela do carro, caso contrário será 20%.
		 */
		double a;
		int b;
		Scanner x = new Scanner(System.in);

		System.out.println("Digite o preÃ§o de tabela do carro");
		a = x.nextDouble();
		System.out.println("Digite o ano do carro");
		b = x.nextInt();
		if (b < 2000) {
			a = (a * 10) / 100;
			System.out.println("O preÃ§o do imposto serÃ¡ de: " + a);
		} else {
			a = (a * 20) / 100;
			System.out.println("O preÃ§o do imposto serÃ¡ de: " + a);
		}
	}
}
