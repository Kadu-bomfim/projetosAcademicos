package lista1;

import java.util.Scanner;

/**
 *
 * @author Tiago Coelho
 */
public class Ex5 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que peça ao usuário para digitar o salário de um vendedor e
		 * o valor total de vendas feitas por ele, para que possa calcular a comissão a
		 * receber referente às vendas que fizer. Caso as vendas forem abaixo de R$
		 * 300,00 no mês ele recebe 1% da comissão sobre as vendas. Se for acima de R$
		 * 300,00 e abaixo de R$ 1000,00 recebe 5% da comissão e se for acima de R$
		 * 1000,00 ele recebe 10% de comissão. Ao final apresente o valor total do
		 * salário com a comissão.
		 */
		double a, b;
		Scanner x = new Scanner(System.in);

		System.out.println("Digite o total de vendas do vendedor:");
		a = x.nextDouble();
		System.out.println("Digite o salÃ¡rio do vendedor:");
		b = x.nextDouble();
		if (a < 300) {
			b = b + (a * 0.01);
			System.out.println("O SalÃ¡rio final serÃ¡ de: " + b);
		} else if (a >= 300 && a < 1000) {
			b = b + (a * 0.05);
			System.out.println("O SalÃ¡rio final serÃ¡ de: " + b);
		} else if (a >= 1000) {
			b = b + (a * 0.1);
			System.out.println("O SalÃ¡rio final serÃ¡ de: " + b);
		}
	}
}
